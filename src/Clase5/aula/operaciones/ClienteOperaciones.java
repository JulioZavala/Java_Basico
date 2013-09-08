package Clase5.aula.operaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteOperaciones {

    private String host;
    private int port;

    public ClienteOperaciones(String host, int port) {
        this.host = host;
        this.port = port;
    }

    
    public static void main(String[] args) {
        ClienteOperaciones socketCliente = new ClienteOperaciones("LocalHost", 9999);
        socketCliente.doConectar();
    }
    
    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);

            // Crear los canales de lectura y escritura
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

            // COMUNICACION 1
            String msg = in.readLine();
            System.out.println(msg);

            // COMUNICACION 2
            out.println("División");
            out.println("5");
            out.println("20");

            
            System.out.println(in.readLine());
            
            // Cerrar canales
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}

package Clase5.aula.sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

    private String host;
    private int port;

    public Cliente(String host, int port) {
        this.host = host;
        this.port = port;
    }

    
    public static void main(String[] args) {
        Cliente socketCliente = new Cliente("LocalHost", 9999);
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
            out.println("CLIENTE: Julio Zavala");

            // Cerrar canales
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase5.aula.DNS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author PFR
 */
public class ServidorHilo extends Thread {

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    public void run() {
        try {
            // Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));

            // COMUNICACION 1
            out.println("SERVIDOR: Bienvenido, ¿Dominio?");

            // COMUNICACION 2
            String resp2 = in.readLine();
            System.out.println("El cliente solicitó IP para: " + resp2);

            String resp3 = ip(resp2);


            // COMUNICACION 3
            out.println("SERVIDOR: El IP address de " + resp2 + " es: " + resp3);


            /* Cerramos el canal */
            in.close();
            out.close();
            cliente.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cliente != null) {
                    cliente.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String ip(String dominio) throws IOException {
        try {
            InetAddress ipaddress = InetAddress.getByName(dominio);
            return ipaddress.getHostAddress();
        } catch (UnknownHostException e) {
            return "Could not find IP address for: " + dominio;
        }
    }
}

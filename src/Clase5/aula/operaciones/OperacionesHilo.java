/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase5.aula.operaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author PFR
 */
public class OperacionesHilo extends Thread {

    private Socket cliente;

    public OperacionesHilo(Socket cliente) {
        this.cliente = cliente;
    }

    public void run() {
        try {
            // Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));

            // COMUNICACION 1
            out.println("Calculadora...");

            // COMUNICACION 2
            String operacion = in.readLine();
            //Integer parametro1 = Integer.parseInt(in.readLine());
            //Integer parametro2 = Integer.parseInt(in.readLine());;
            Double parametro1 = Double.parseDouble(in.readLine());
            Double parametro2 = Double.parseDouble(in.readLine());

            /* Cerramos el canal */
            Double respuesta;

            switch (operacion) {
                case "Suma":
                    respuesta = parametro1 + parametro2;
                    break;
                case "Resta":
                    respuesta = parametro1 - parametro2;
                    break;
                case "Multiplicación":
                    respuesta = parametro1 * parametro2;
                    break;
                case "División":
                    respuesta = parametro1 / parametro2;
                    break;
                default:

                    respuesta = 0d;
            }


            out.println(respuesta);

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
}

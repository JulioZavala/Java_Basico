/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase5.aula.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author PFR
 */
public class EntradaSalida {

    public static void main(String[] args) {

        //EntradaSalida.EscribirArchivo();
        //EntradaSalida.leerArchivo();
        EntradaSalida.ejemploIO();
        
    }

    public static void EscribirArchivo() {

        //FileWriter fw = null;
        //BufferedWriter bw = null;

        try {
            FileWriter fw = new FileWriter("D:\\pruebas.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Es una linea");
            bw.newLine();
            bw.write("Es otra linea");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivo() {


        //FileReader fr = null;
        //BufferedReader br = null;
        String sInput = null;
        try {
            FileReader fr = new FileReader("D:\\pruebas.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    
    public static void ejemploIO() {
        
        
        try {
            FileReader fr = new FileReader("D:\\pruebas.txt");
            BufferedReader br = new BufferedReader(fr);
            String sInput;
            String buffer="";
            while ((sInput = br.readLine()) != null) {
                //System.out.println(sInput);
                buffer = buffer + sInput+"\n";
            }
            fr.close();
            br.close();           
            
            
            FileWriter fw = new FileWriter("D:\\pruebas.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(buffer);
            bw.newLine();
            bw.write("Line4");
            bw.newLine();
            bw.write("Line5");
            bw.close();
            fw.close();

            
          
        } catch (IOException e) {
            e.printStackTrace();
        } 

        
    }
    
    
    
}

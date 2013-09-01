
package Clase4.aula.hilos;

import java.io.IOException;


public class ProcesosHilo {
    
    public static void main(String[] args) throws IOException {
        Process proceso = Runtime.getRuntime().exec("tasklist");
    }
    
}

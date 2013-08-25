
package Clase4.aula.hilos;


public class AplicacionHilos {
    
    public static void main(String[] args) {
        
        AplicacionHilos.dohiloImplementacion();

    }
    
    
    public static void dohiloHerencia(){
        HiloHerencia hilo = new HiloHerencia();
        hilo.start();
    }
  
    
    
    public static void dohiloImplementacion(){
        HiloImplements hilo = new HiloImplements();
        Thread th = new Thread(hilo);
        th.start();
    }
}

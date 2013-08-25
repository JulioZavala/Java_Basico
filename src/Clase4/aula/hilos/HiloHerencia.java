
package Clase4.aula.hilos;


public class HiloHerencia extends Thread {
    
    String nombre;
    
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
                System.out.println(i);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}


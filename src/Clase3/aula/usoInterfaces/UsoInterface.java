
package Clase3.aula.usoInterfaces;


public class UsoInterface {
    
    public static void main(String[] args) {
        
        UsoInterface.doImp();
        
    }
    
    
    public static void doImp(){
        
        Capitalizable[] listado = new Capitalizable[3];   

        listado[0] = new Palabra("Programacion en Java");
        listado[1] = new Palabra("Tecsup");
        listado[2] = new Oracion("Curso Java Basico - Tecsup");        

        /*
        for (int i=0; i<listado.length;i++){
	        System.out.println( "Texto " + i + ": " + listado[i].cambiaMayuscula());
        }
        */
        
        for (Capitalizable item : listado) {   // "fore" + tab
            System.out.println(item.cambiaMayuscula());
        }
        
    }
    

    
}

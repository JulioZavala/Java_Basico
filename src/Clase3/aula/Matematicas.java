
package Clase3.aula;


public class Matematicas {
 
    
    public static void main(String[] args) {
        System.out.println(Matematicas.doOperaciones());
    }
    
    
    
    public static void wrappers(){
        Integer entero = new Integer(12);
        
        entero.shortValue();
        
        
    }
    
    
    
    public static void getConstants(){
        
        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        
    }
    
    
    public static double doOperaciones(){
        
        //return (Math.sqrt(144));
        return Math.cos(Math.PI);
        
        
    }
    
}

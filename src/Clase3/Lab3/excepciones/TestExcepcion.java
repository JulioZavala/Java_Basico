/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3.Lab3.excepciones;

/**
 *
 * @author PFR
 */
public class TestExcepcion {
    
    public static void main(String[] args) {
        
        TestExcepcion.doEjemplo3();
        
    }
    
    
    
public static void doEjemplo4(){
    
    try {
        
    } catch (Exception e) {
    }
    
}    
    



public static void doEjemplo4Exception(){
    
    
    
}    


public static void doEjemplo2(){
    
        int x = (int)(Math.random() * 5);
        int y = (int)(Math.random() * 10);
        int [] z = new int[5];
        
        try {
            System.out.println("y/x gives " + (y/x));
            System.out.println("y is " + y + ", z[y] is " + z[y]);
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic problem " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Subscript problem " + e.getMessage());
        } finally {
            System.out.println("Terminando la ejecución del método");
        }
        System.out.println("Continúa la ejecución del método....");
    

    
    
}    
    
    
public static void doejemplo(){
        int i = 0, u = 0, k;
        k = i / u;
}
         
    

public static void doEjempoExcepcion(){
 
        try {    
            int i = 0, u = 0, k;
            k = i / u;
        } catch(java.lang.ArithmeticException e){
            System.out.println("Hubo un error: " + e.getMessage());
        }

    
}



public static void doejemplo3(){
    
    int[] n=null; //= {11,22,33,44,55,66,77,88,99};
        

        for (int i=0; i<11;i++) {
            System.out.println( "Valor " + n[i]);
        }

 
    

    
}


public static void doejemplo3Excepcion(){
    
    int[] n=null; //= {11,22,33,44,55,66,77,88,99};
        
        try {
        for (int i=0; i<11;i++) {
            System.out.println( "Valor " + n[i]);
        }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        
        } catch (NullPointerException e) {
            
            System.out.println("Error: "+e.getMessage());
 
        } finally{
            System.out.println("Aplicacion Terminada");
        }
    

    
}


        

}

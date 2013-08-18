
package Clase3.aula;

import java.util.Date;


public class ClaseObject {
    
    
    public static void main(String[] args) {
        

        ClaseObject.rareCompare();
        
        
        
    }
    
    
    public static void rareCompare(){
        Integer numeroA = 12;
        Integer numeroB = 12;
        
        Integer numeroX = new Integer(12);
        Integer numeroY = new Integer(12);       
        
        
        if (numeroA==numeroB){
            System.out.println("iguales A y B");
        }
        
        if (numeroX==numeroY){
            System.out.println("iguales X y Y version 1");
        }              
                
        if (numeroX.intValue()==numeroY.intValue()){
            System.out.println("iguales X e Y version 2");
        }
        
        if (numeroX.equals(numeroY)){
            System.out.println("iguales X e Y version 3");
        }
        
    }
    
    
    
    
    
    public static void doEquals(){
        Date fechaNacimiento = new Date();
        //Date fechaCumpleaños = fechaNacimiento; // apunta a la memoria fechaNacimiento
        Date fechaCumpleaños = new Date();
        
        
        if (fechaNacimiento==fechaCumpleaños){
            System.out.println("iguales");
        }
        
        if (fechaNacimiento.equals(fechaCumpleaños)){
            System.out.println("Iguales");
        }
        
    }
    
    
    
    public static void doToString(){
        
        Date fechaNacimiento = new Date();
        System.out.println(fechaNacimiento.toString());
        
        
    }
    
    
    
    public static void overrideToString(){
        ClaseObject object = new ClaseObject();
        System.out.println(object.toString());
        
    }
    
    @Override
    public String toString(){
        return "EXPLICANDO LA CLASE DE OBJECT";
    }
    
    
}

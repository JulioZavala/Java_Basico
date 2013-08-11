
package Clase2.aula.figuras;


public class Modelamiento {
    
    
    public static void main(String[] args) {
        
        

    }
    
    
    
    
    public void static doAbstracto(){
        
        Cuadrado figura = new Cuadrado();
        figura.setAlto(10d);
        //figura.setAncho(5d);
        
        Rectangulo figura2 = new Rectangulo();
        figura2.setAlto(10d);
        figura2.setAncho(50d);
        
        
        System.out.println(figura.getArea());
        System.out.println(figura2.getArea()); 
        
        
    }
    
    
    
    
}

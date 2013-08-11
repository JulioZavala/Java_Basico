
package Clase2.aula.figuras;


public class Rectangulo extends Shape{
  
    @Override
    public Double getArea(){
        Double resultado = this.getAlto()*this.getAncho();
        return resultado;
        
    }
    
    
    
}

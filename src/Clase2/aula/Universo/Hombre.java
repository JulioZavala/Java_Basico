
package Clase2.aula.Universo;

import Clase2.aula.Universo.interfaces.SerVivo;
import Clase2.aula.Universo.interfaces.HumanoInterface;


public class Hombre implements SerVivo, HumanoInterface {

    @Override
    public void alimentarse() {
        System.out.println("COMER");  
    }

    @Override
    public void comunicarse() {
        System.out.println("HABLAR");  
    }

    @Override
    public void reproducirse() {
        System.out.println("SEXO");  
    }
     
    @Override
    public void contaminar() {
        System.out.println("CONTAMINA");  
    }
         
    
    
}

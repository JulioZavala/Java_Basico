
package Clase2.aula.Universo;

import Clase2.aula.Universo.interfaces.SerVivo;


public class Alienigena implements SerVivo {
    
     @Override
    public void alimentarse() {
        System.out.println("COMER2");  
    }

    @Override
    public void comunicarse() {
        System.out.println("HABLAR2");  
    }

    @Override
    public void reproducirse() {
        System.out.println("SEXO2");  
    }

   
         
    
    
}

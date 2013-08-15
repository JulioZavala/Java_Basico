
package Clase2.aula.Universo;

import Clase2.aula.Universo.interfaces.Melmakiano;
import Clase2.aula.Universo.interfaces.SerVivo;


public class Alf implements SerVivo, Melmakiano {

    @Override
    public void alimentarse() {
        System.out.println("COMER");  
    }

    @Override
    public void comunicarse() {
        System.out.println("COMER");  
    }

    @Override
    public void reproducirse() {
        System.out.println("COMER");  
    }

    @Override
    public void comerGato() {
        System.out.println("COMER GATO");  
    }
 
    
}

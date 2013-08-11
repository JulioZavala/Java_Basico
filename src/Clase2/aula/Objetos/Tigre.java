/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2.aula.Objetos;

public class Tigre extends Animal {

    
    public Tigre (){
        
    }
            
    
    public Tigre (String especie){
        this.setEspecie(especie);
        this.setNumeroPatas(4);
        
    }
    
    
    
    
    
    
    @Override
    public void hacerRuido() {
        System.out.println("Solo Rugir");
    }

    public void hacerRuido(boolean molestar) {

        if (molestar) {
            System.out.println("Rugir y Zarpar");
        }

    }

    public void hacerRuido(String mens) {

                    System.out.println(mens);
        
    }


    public void zarpar() {

                    System.out.println("Zarpar");
        
    }


}

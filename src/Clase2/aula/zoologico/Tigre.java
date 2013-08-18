/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2.aula.zoologico;

public class Tigre extends Animal {

    
    public Tigre (){
        this.setNumeroPatas(4);     
    }
            
    
    public Tigre (String especie){
        this.setNumeroPatas(4); 
        this.setEspecie(especie);
        
    }
    
    
    
    
    
    
    @Override
    void hacerRuido() {
        System.out.println("Solo Rugir");
    }

    void hacerRuido(boolean molestar) {

        if (molestar) {
            System.out.println("Rugir y Zarpar");
        }

    }

    void hacerRuido(String mens) {

                    System.out.println("rugir " + mens);
        
    }


    void zarpar() {

                    System.out.println("Zarpar");
        
    }


    
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Tigre) {
            return ((Tigre) obj).getEspecie().equals(this.getEspecie());
        }
        return false;
    }
    
    
    
}

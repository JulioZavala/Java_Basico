
package Clase2.aula.Objetos;


public class Condor extends Animal {
  
    public Condor (){
        
    }
            
    
     public Condor (String especie){
        this.setEspecie(especie);
        this.setNumeroPatas(2);
        
    }
    
    
    public Condor (String especie, int patas){
        this.setEspecie(especie);
        this.setNumeroPatas(patas);
        
    }
    
    
    public void hacerRuido() {

     
            System.out.println("Cantar");
    

    }
    
    
    
    public void hacerRuido(boolean molestar) {

        if (molestar) {
            System.out.println("Chillar");
        }

    }    
    
    
        public void picar() {

                    System.out.println("Picar");
        
    }
    
    
}

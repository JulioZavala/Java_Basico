
package Clase2.aula.Objetos;

public class Animal {
    
    
    private int numeroPatas;  // el private hace que no se vea en el objeto
    private String especie;
    private Double tamaño;
    
    
    
    
// lo crea ALT + Insert  "getters and setters"
    
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }
    
    
   
    
    public void hacerRuido(){
 
        
        System.out.println("Zzzzzzz");
        
    }
    
    
    
    public void printNombrePatas(){
        System.out.println(this.especie+" "+this.numeroPatas);
        
    }
    
    
    
}

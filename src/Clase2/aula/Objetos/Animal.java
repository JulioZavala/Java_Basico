
package Clase2.aula.Objetos;

public class Animal {
    
    
    private int numeroPatas;  // el private hace que no se vea en el objeto
    private String especie;
    private Double tama�o;
    
    
    
    
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

    public Double getTama�o() {
        return tama�o;
    }

    public void setTama�o(Double tama�o) {
        this.tama�o = tama�o;
    }
    
    
   
    
    public void hacerRuido(){
 
        
        System.out.println("Zzzzzzz");
        
    }
    
    
    
    public void printNombrePatas(){
        System.out.println(this.especie+" "+this.numeroPatas);
        
    }
    
    
    
}

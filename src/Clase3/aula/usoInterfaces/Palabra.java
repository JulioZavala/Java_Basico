
package Clase3.aula.usoInterfaces;


public class Palabra implements Capitalizable {

    
    String texto;
    
    Palabra(String n){
    texto=n.replaceAll(" ","");
    }

    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();        
    }

    @Override
    public String cambiaMinuscula() {
            return texto.toLowerCase();    
    }
    
    
    
    
    
}

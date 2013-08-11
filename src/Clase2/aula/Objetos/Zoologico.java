package Clase2.aula.Objetos;

public class Zoologico {

    public static void main(String[] args) {

        Zoologico.doHerencia();


    }

    public static void intanciaObjeto() {

        Animal tigre = new Animal();

        tigre.setEspecie("Tigre");

        System.out.println(tigre.getEspecie());
        tigre.hacerRuido();


    }

    public static void doHerencia() {


        Tigre tiger = new Tigre();
        tiger.setNumeroPatas(4);
        tiger.hacerRuido();
        System.out.println(tiger.getNumeroPatas());
        tiger.hacerRuido(true);
        tiger.hacerRuido("Hola");

        
        Condor condorito = new Condor();
        condorito.setNumeroPatas(2);
        condorito.hacerRuido();
        System.out.println(condorito.getNumeroPatas());
        condorito.hacerRuido();
        condorito.hacerRuido(!true);
        
    }



}

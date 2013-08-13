package Clase2.aula.zoologico;

public class Zoologico {

    public static void main(String[] args) {

        Zoologico.doHerencia();
        //Zoologico.doCasting(new Tigre());


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
        condorito.hacerRuido(true);
        
    }

    public static void doConstructor(){
        
        Condor condorito = new Condor();
        condorito.setEspecie("Condorito");
        condorito.setNumeroPatas(2);
        condorito.printNombrePatas();
        
        Condor cone = new Condor("Cone",2);
        cone.printNombrePatas();
     
        
        
        Tigre tiger = new Tigre();
        tiger.setEspecie("tiger");
        tiger.setNumeroPatas(4);
        tiger.printNombrePatas();
        
        Tigre tiger2 = new Tigre("tiger2");
        tiger2.printNombrePatas();
    }

    
    
    public static void doCasting(Animal animal){
       
        
        Condor condor = new Condor();
        Zoologico.doCasting1(condor);
        Zoologico.doCasting2();
               
            


    }
    
    
    
    
    
    public static void doCasting1(Animal animal){
       
        
        if (animal instanceof Tigre){
            Tigre tigre = (Tigre) animal;
            tigre.hacerRuido(true);
            tigre.zarpar();
        }else if (animal instanceof Condor){
            Condor condor = (Condor) animal;
            condor.hacerRuido();
            condor.picar();
            
        }
        
        
        
            


    }
    
    
    public static void doCasting2(){
       
        Animal[] animales = {new Tigre("Tigr"), new Condor("Condorito"), new Condor("Cone")};
        
        for (Animal animal : animales){
            animal.printNombrePatas();
            
        if (animal instanceof Tigre){
            ((Tigre) animal).hacerRuido(true);
        }else if (animal instanceof Condor){
            Condor condor = (Condor) animal;
            condor.picar();
            
            
        }

            
        }
        
                      


    }
    
    
}

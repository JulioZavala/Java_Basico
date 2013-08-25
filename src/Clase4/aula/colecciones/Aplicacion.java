
package Clase4.aula.colecciones;

import Clase2.aula.zoologico.Animal;
import Clase2.aula.zoologico.Condor;
import Clase2.aula.zoologico.Tigre;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class Aplicacion {
 
    public static void main(String[] args) {
        Aplicacion.animales();
    }
    
    
    public static void animales(){
        
        Tigre Tigre1 = new Tigre("Tigre1");
        Condor Condorito = new Condor("Condor1",2);
        Condor Cone = new Condor("Condor2",2);
        
        
        // List<Animal> listaAnimales = new ArrayList<>();
        Set<Animal> listaAnimales = new HashSet<Animal>();
        
        listaAnimales.add(Tigre1);
        listaAnimales.add(Condorito);
        listaAnimales.add(Cone);
        listaAnimales.add(Tigre1);
        
        for (Animal animal : listaAnimales) {
            System.out.println(animal.getEspecie());
        }
        
        
    }
    
    
    
    
    
    
    public static void ejemploArrayList(){
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // ArrayList
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e3);
        listaEstudiantes.add(e2);
        
        Collections.sort(listaEstudiantes);
        
        for (Estudiante e : listaEstudiantes) {
		System.out.println(e.getApellidos() + " " + e.getNombres());
	}

        
    }
    
    
    
    
    public static void ejemploLinkedList(){
        
        
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // LinkedList
        LinkedList<Estudiante> listadoEstudiante = new LinkedList<>();
        listadoEstudiante.addFirst(e1);
        listadoEstudiante.addFirst(e2);
        listadoEstudiante.addFirst(e3);
        
        ListIterator<Estudiante> iterador = listadoEstudiante.listIterator();
        while(iterador.hasNext()){
            Estudiante e = (Estudiante) listadoEstudiante.poll();
            System.out.println(e.getNombres());
        }
        System.out.println(listadoEstudiante.size());
    
        
    }
    
    
    
    public static void ejemploHashSet(){
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // HashSet
        HashSet<Estudiante> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e1);
        
        for (Estudiante e : set) {
		System.out.println(e.getNombres() + " " + e.getApellidos());
	}

        
        
    }
    
    
    
    public static void ejemploHashMap(){
        
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // HashMap
        HashMap<Integer, Estudiante> mapa = new HashMap<Integer, Estudiante>();
        mapa.put(100525, e1);
        mapa.put(100526, e2);
        mapa.put(100527, e3);
        
        Estudiante e = mapa.get(100526);
        //System.out.println(e.getNombres() );

        Collection<Estudiante> co = mapa.values();
        for (Estudiante es : co) {
		System.out.println(es.getNombres());
		}        
       
    }
    
    
}

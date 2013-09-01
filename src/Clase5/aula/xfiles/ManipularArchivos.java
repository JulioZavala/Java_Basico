
package Clase5.aula.xfiles;

import java.io.File;
import java.io.IOException;


public class ManipularArchivos {
 
    public static void main(String[] args) throws IOException {
        
        
        //ManipularArchivos.compruebaArchivo();
        //ManipularArchivos.ListDirectory();
        ManipularArchivos.renameFiles();
        
        
    }
    
    
    public static void compruebaArchivo() throws IOException{
        
        File f = new File("D:\\temario.txt");
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta : " + f.getPath());
        System.out.println("Ruta Absoluta: " + f.getAbsolutePath());

        if(f.exists()){
            System.out.println("Archivo sí existe!");
            System.out.println((f.canRead()) ? "Sí se puede leer" : "");
            System.out.println((f.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + f.length() + " bytes");
        } else {
            System.out.println("El archivo no existe");
            f.createNewFile();
        }
    }

    
    public static void ListDirectory() {
        
        
        File directorio = new File("C:\\ ");
        if ( (directorio.exists()) && (directorio.isDirectory())){
            String[] lista = directorio.list();
            for(int i=0; i<lista.length; i++){
                System.out.println(lista[i]);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    } 

       public static void renameFiles() {
        
           File directorio = new File("D:\\Musica");
           if ( (directorio.exists()) && (directorio.isDirectory())){
            String[] lista = directorio.list();
            for(int i=0; i<lista.length; i++){
                File file = new File(directorio,lista[i]);
                lista[i] = (i+1)+". "+lista[i];
                File file2 = new File(directorio,lista[i]);
                file.renameTo(file2);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
           
           
    }
 
        
    
    
    
}

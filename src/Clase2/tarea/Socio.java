package Clase2.tarea;

public class Socio {

    private String id;
    private String nombre;
    private String apellido;
    private String direccion;
    private Prestamo[] prestamos = new Prestamo[3];

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    
    
    
    void prestarLibro (String fecha, Media media) {
    
     Prestamo prestamo = new Prestamo ();
     
     prestamo.setSocioId(this.id);
     prestamo.setFecha(fecha);
     prestamo.setMedia(media);
     
     if (prestamos[0] == null) {
        prestamos[0] = prestamo;
    }else if (prestamos[1] == null){
        prestamos[1] = prestamo;
    }else if (prestamos[2] == null){
        prestamos[2] = prestamo;
    }else {
         System.out.println("Ya prestó 03 medios");
    }
     
     
}
    
    
    
    void calculaDeuda (){
        
    }



}

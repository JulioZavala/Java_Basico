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


    
    
    
    void prestarLibro (String fecha, int dia, Media media) {
    
     Prestamo prestamo = new Prestamo ();
     
     prestamo.setSocioId(this.id);
     prestamo.setFecha(fecha);
     prestamo.setDia(dia);
     prestamo.setMedia(media);
     
     if (media.getDias()<dia){
         System.out.println("El prestamo solo puede ser por "+media.getDias()+" dias, el prestamo no procede");
     }else if (prestamos[0] == null) {
        prestamos[0] = prestamo;
        System.out.println("El prestamo 1/3 procede");
    }else if (prestamos[1] == null){
        prestamos[1] = prestamo;
        System.out.println("El prestamo 2/3 procede");
    }else if (prestamos[2] == null){
        prestamos[2] = prestamo;
        System.out.println("El prestamo 3/3 procede");
    }else {
         System.out.println("Ya prestó 03 medios, el prestamo no procede");
    }
     
     
}
    
       
    void calculaDeuda (){
        
    }



}

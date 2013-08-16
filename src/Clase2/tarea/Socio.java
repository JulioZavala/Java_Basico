package Clase2.tarea;

public class Socio {

    private String id;
    private String nombre;
    private String apellido;
    private String direccion;
    private Prestamo[] prestamos = new Prestamo[3];
    private int cantidad = 0;
    private double deuda;

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

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public int getCantidad() {
        return cantidad;
    }

    void prestarLibro(String fecha, int dia, Media media) {

        Prestamo prestamo = new Prestamo();

        prestamo.setSocioId(this.id);
        prestamo.setFecha(fecha);
        prestamo.setDia(dia);
        prestamo.setMedia(media);

        if (media.getDias() < dia) {
            System.out.println("El prestamo solo puede ser por " + media.getDias() + " dias, el prestamo no procede");
        } else if (prestamos[0] == null) {
            prestamos[0] = prestamo;
            this.cantidad = 1;
            System.out.println("El prestamo 1/3 procede");
        } else if (prestamos[1] == null) {
            prestamos[1] = prestamo;
            this.cantidad = 2;
            System.out.println("El prestamo 2/3 procede");
        } else if (prestamos[2] == null) {
            prestamos[2] = prestamo;
            this.cantidad = 3;
            System.out.println("El prestamo 3/3 procede");
        } else {
            System.out.println("Ya prestó 03 medios, el prestamo no procede");
        }


    }

    public double getDeuda() {
        for (int i = 0; i < this.cantidad; i++) {

            deuda = deuda + prestamos[i].getCostoPrestamo();
        }

        return deuda;
    }

    void imprimirSocio() {

        System.out.println("Codigo : " + this.id);
        System.out.println("Nombre : " + this.nombre + " " + this.apellido);
        System.out.println("Direccion : " + this.direccion);


    }
}

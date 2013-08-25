
package Clase4.aula.colecciones;

public class Estudiante implements Comparable<Estudiante>{
        private String nombres;
	private String apellidos;
	private String direccion;
	private int codMatricula;

        @Override
	public int compareTo(Estudiante externo) {	 	
		String apellidosExterno = externo.getApellidos().toLowerCase();
		String apellidosLocal = this.getApellidos().toLowerCase(); 		
		return apellidosLocal.compareTo(apellidosExterno);
	}

    public Estudiante(String nombres, String apellidos, String direccion, int codMatricula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.codMatricula = codMatricula;
    }

        
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

        
    
    
    
    
}

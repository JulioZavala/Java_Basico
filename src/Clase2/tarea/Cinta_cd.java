package Clase2.tarea;

public class Cinta_cd extends Media {

    private String autor;
    private String lugar;
    private double duracion;

    public Cinta_cd() {
        this.setDias(5);
        this.setCosto(20);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}

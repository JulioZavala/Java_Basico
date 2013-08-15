package Clase2.tarea;

public class Video extends Media {

    private String director;
    private String actores;
    private double duracion;

    public Video() {
        this.setDias(3);
        this.setCosto(10);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}

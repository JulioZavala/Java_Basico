
package Clase2.tarea;


public class Prestamo {

    private String socioId;
    private String fecha;
    private Media media;

    public String getSocioId() {
        return socioId;
    }

    public void setSocioId(String socioId) {
        this.socioId = socioId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }
    

    
    
    
    void imprimeDatosPrestamo (){
        System.out.println(this.fecha);
        
        if (media instanceof Libro){
            Libro libro1 = (Libro) media;
            System.out.println("Titulo : "+libro1.getTitulo());
            System.out.println("Autor : "+libro1.getAutor());
            System.out.println("Paginas : "+libro1.getPaginas());
            System.out.println("ISBN : "+libro1.getIsbn());
        }else if (media instanceof Video){
            Video video1 = (Video) media;
            System.out.println("Titulo : "+video1.getTitulo());
            System.out.println("Director : "+video1.getDirector());
            System.out.println("Actores : "+video1.getActores());
            System.out.println("Duracion : "+video1.getDuracion());
        }else if (media instanceof Cinta_cd){
            Cinta_cd cinta1 = (Cinta_cd) media;
            System.out.println("Titulo : "+cinta1.getTitulo());
            System.out.println("Autor : "+cinta1.getAutor());
            System.out.println("Lugar : "+cinta1.getLugar());
            System.out.println("Duracion : "+cinta1.getDuracion());
        }   
        
        
    }   
    
    
}

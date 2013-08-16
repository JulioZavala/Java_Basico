package Clase2.tarea;

public class Libro extends Media {

    private String autor;
    private int paginas;
    private String isbn;

    public Libro() {
        this.setDias(15);
        this.setCosto(5);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

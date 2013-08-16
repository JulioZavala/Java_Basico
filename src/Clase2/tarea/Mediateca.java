package Clase2.tarea;

public class Mediateca {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Video video1 = new Video();
        Cinta_cd cd1 = new Cinta_cd();
        Cinta_cd cd2 = new Cinta_cd();

        libro1.setId("00001");
        libro1.setTitulo("El Delfin");
        libro1.setAutor("Sergio Barbaren");
        libro1.setPaginas(91);
        libro1.setIsbn("978-9972-239-65-6");

        video1.setId("00002");
        video1.setTitulo("Los Imperdonables");
        video1.setDirector("Clint Eastwood");
        video1.setActores("Clint Eastwood - Morgan Freeman");
        video1.setDuracion(1.75);

        cd1.setId("00003");
        cd1.setTitulo("The Best Of Aerosmith");
        cd1.setAutor("Aerosmith");
        cd1.setLugar("Londres");
        cd1.setDuracion(1.2);

        cd2.setId("00004");
        cd2.setTitulo("Unplugged");
        cd2.setAutor("Alanis Morissette");
        cd2.setLugar("USA");
        cd2.setDuracion(1.5);









        Socio persona1 = new Socio();

        persona1.prestarLibro("15/08/2013 14:35:00", 5, cd2);
        persona1.prestarLibro("16/08/2013 08:00:00", 6, cd1);
        persona1.prestarLibro("05/08/2013 12:45:00", 16, libro1);
        persona1.prestarLibro("07/08/2013 16:45:00", 4, video1);

    }
}

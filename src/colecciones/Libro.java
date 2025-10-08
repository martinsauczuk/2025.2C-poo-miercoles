package colecciones;

public class Libro {

    private final String titulo;
    private final String autor;
    private int cantLecturas = 0;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void leer() {
        cantLecturas ++;
    }


    @Override
    public String toString() {
        return "{"+autor+":"+titulo+"}";
    }


//    @Override
//    public String toString() {
//        return "Libro{" +
//                "titulo='" + titulo + '\'' +
//                ", autor='" + autor + '\'' +
//                '}';
//    }
}

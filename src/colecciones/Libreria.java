package colecciones;

import java.util.HashSet;

public class Libreria {

    private HashSet<Libro> librosEnVenta = new HashSet<>();

    public void agregarLibroAlStock(Libro unLibro) {
        librosEnVenta.add(unLibro);
    }

    public int cuantosLibrosTeQuedan() {
        return librosEnVenta.size();
    }

    public void venderTodo() {
        librosEnVenta.clear();
    }

    @Override
    public String toString() {
        return "Soy una libreria";
    }
}

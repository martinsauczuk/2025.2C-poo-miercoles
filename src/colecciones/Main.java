package colecciones;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Libro quijote = new Libro("El Quijote", "Cervantes");
        Libro martinFierro = new Libro("Martin Fierro", "Jose Hernandez");
        Libro elPrincipito = new Libro("El Principito", "Saint Exupery");

        // Set
        System.out.println("------Set------");

        HashSet<Libro> libros = new HashSet<Libro>();
        System.out.printf("Cantidad: %d %n",libros.size()); // 0
        libros.add(elPrincipito);
        System.out.printf("Cantidad: %d %n",libros.size()); // 1
        libros.add(quijote);
        System.out.printf("Cantidad: %d %n",libros.size()); // 2
        libros.add(elPrincipito);
        System.out.printf("Cantidad: %d %n",libros.size()); // 2
        libros.add(new Libro("titulo1", "autor1"));
        System.out.println(libros);
        libros.add(martinFierro);

        // List
        System.out.println("------List------");
        ArrayList<Libro> librosLeidos = new ArrayList<>();
        System.out.println(librosLeidos);
        System.out.printf("Cantidad: %d %n",librosLeidos.size()); // 0
        librosLeidos.add(quijote);
        System.out.printf("Cantidad: %d %n",librosLeidos.size()); // 1
        System.out.println(librosLeidos);
        librosLeidos.add(elPrincipito);
        System.out.printf("Cantidad: %d %n",librosLeidos.size()); // 2
        librosLeidos.add(quijote);
        System.out.printf("Cantidad: %d %n",librosLeidos.size()); // 3
        System.out.println(librosLeidos);

        elPrincipito.leer();
        System.out.println(librosLeidos);


        // Recorriendo las colecciones
        for (Libro libro : libros) {
            System.out.println("Este es un libro a leer" + libro);
            libro.leer();
        }

        for (Libro libro : librosLeidos) {
            System.out.println("Este es un libro de List" + libro);
            libro.leer();
        }


        Libreria santaFe = new Libreria();
        santaFe.agregarLibroAlStock(elPrincipito);

        System.out.println(santaFe.cuantosLibrosTeQuedan());


        System.out.println(santaFe);


    }
}

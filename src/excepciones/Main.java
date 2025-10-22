package excepciones;

import impresoras.impresoras.Documento;
import impresoras.impresoras.ImpresionException;
import impresoras.impresoras.Impresora;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Comienza mi programa");

        int dividendo = 2;
        int divisor = 0;

        int cociente = 0;
        try {
            cociente = dividendo / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Estoy capturando la excepcion"+ e.getMessage() );
        }

        ArrayList<String> saludos = new ArrayList<>();
        saludos.add("Hola");
        saludos.add("Chau");
        saludos.add("Buenas tardes");

        String saludo;
        try {
            saludo = saludos.get(3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Hubo un error " + e.getMessage());
           saludo = "No hay saludo";
        }

        System.out.println(saludo);


        Impresora hp1 = new Impresora(1000, 1000, 1000, 1000, 1);
        Documento miDoc = new Documento(10,10, 10, 10, 100);

        try {
            hp1.imprimir(miDoc);
        } catch (ImpresionException ex1) {
            System.out.println("No pude imprimir ");
        } catch (ArithmeticException ex2) {
            System.out.println("No pude imprimir ");
        }

        System.out.println("Llegamos al final");


        System.out.println("Aca termina mi programa");
    }
}

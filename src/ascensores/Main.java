package ascensores;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Mas adelante vamos a ver mejor este tema
        Ascensor ascensor = new Ascensor();

        ascensor.abrirPuerta();
        System.out.println("Esta abierta la puerta???" + ascensor.estaAbiertaLaPuerta());
        System.out.println("En que piso estas?? " + ascensor.enQuePisoEstas());
        ascensor.andaAlPiso(10);
        System.out.println("En que piso estas?? " + ascensor.enQuePisoEstas());
        ascensor.cerrarPuerta();
        System.out.println("Esta abierta la puerta???" + ascensor.estaAbiertaLaPuerta());

        // Clase 02 . Seguimos con el ascensor
        System.out.println("Nuestro ascensor es inteligente pero solo tiene lugar para un solo objeto");

        Persona luca = new Persona();
        Persona martin = new Persona();
        Persona matias = new Persona();

        // Luca esta en el 2do y quiere ir al 6to.
        luca.estasEn(2);
        luca.queresIrAl(6);

        ascensor.ingresa(matias);
        ascensor.comenzar(); // debe cerrar la puerta y llevar al objeto al piso que desea

        ascensor.irAFain();
        System.out.println(ascensor.enQuePisoEstas()); // deberia estar en el 6

        ascensor.hayAlguienAdentro(); // esperamos true
        System.out.println( ascensor.quienEstaViajando() == luca); // true
        System.out.println( ascensor.quienEstaViajando() );





    }
}
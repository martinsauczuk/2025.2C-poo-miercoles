package papaNoel;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Persona maximo = new Persona(19);

        Persona maximoDeChico = new Persona(11);
        Mascota rocco = new Mascota(2);

        System.out.println(maximo.mereceRegalo()); // false
        System.out.println(maximoDeChico.mereceRegalo()); // true

        // Yo no quiero "Habitante" que no sea Mascota o Persona
//        Habitante unHabitante = new Habitante();

        Planta miCactus = new Planta(44);
        miCactus.mereceRegalo();

    }

}

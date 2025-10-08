package papaNoel;

// Que nadie instancie esta clase.
public abstract class Habitante {

    private final int edad;

    protected Habitante(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    // "Obligar" a todas las clases que heredan a hacer una sobreescritura
    public abstract boolean mereceRegalo();


    public boolean esMayorDeEdad() {
        return edad > 18;
    }

}

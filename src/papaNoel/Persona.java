package papaNoel;

public class Persona extends Habitante{

//    private final int edad;

    public Persona(int edad) {
        super(edad);
    }

    @Override
    public boolean mereceRegalo() {
        return this.getEdad() <= 12;
    }
}

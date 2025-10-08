package papaNoel;

public class Planta extends Habitante {

    public Planta(int edad) {
        super(edad);
    }

    @Override
    public boolean mereceRegalo() {
        return false;
    }
}

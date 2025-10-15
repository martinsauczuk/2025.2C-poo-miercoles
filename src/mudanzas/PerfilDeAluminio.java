package mudanzas;

public class PerfilDeAluminio implements Medible{

    private final int volumen;

    public PerfilDeAluminio(int volumen) {
        this.volumen = volumen;
    }


    @Override
    public int obtenerVolumen() {
        return 0;
    }
}

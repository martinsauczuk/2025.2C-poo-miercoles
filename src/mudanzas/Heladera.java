package mudanzas;

public class Heladera implements Pesable, Medible, Vendible {

    private final int peso;

    public Heladera(int peso) {
        this.peso = peso;
    }

    @Override
    public int obtenerPeso() {
        return peso;
    }

    @Override
    public int obtenerVolumen() {
        return 0;
    }

    @Override
    public int obtenerPrecio() {
        return 0;
    }

    @Override
    public int cantidadEnStock() {
        return 0;
    }
}

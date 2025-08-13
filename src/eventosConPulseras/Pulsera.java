package eventosConPulseras;

public class Pulsera {

    private String color;
    private int cuantoPaga;

    public int cuantoPaga() {
        return cuantoPaga;
    }

    public void establecerPrecio(int unPrecio) {
        this.cuantoPaga = unPrecio;
    }
}

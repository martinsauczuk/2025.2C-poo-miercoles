package ascensores;

public class Persona {

    private int enQuePisoEstas;
    private int aQuePisoQueresIr;


    public void queresIrAl(int unNumeroDePiso) {
        this.aQuePisoQueresIr = unNumeroDePiso;
    }

    public void estasEn(int unNumeroDePiso) {
        this.enQuePisoEstas = unNumeroDePiso;
    }

    public int aQuePisoQueresIr() {
        return aQuePisoQueresIr;
    }

    public int enQuePisoEstas() {
        return enQuePisoEstas;
    }
}

package ascensores;

// Este nombre va a cambiar proximamente
public class Ascensor {

    private boolean puertaAbierta;
    private int pisoActual = 0;
    private int cantPersonas;
    private Persona quienViaja;


    public boolean estaAbiertaLaPuerta(){
        return puertaAbierta;
    }

    public void ingresa(Persona alguienQueViaja) {
        this.quienViaja = alguienQueViaja;
    }

    public void andaAlPiso(int piso) {
        this.cerrarPuerta();
        pisoActual = piso;
    }

    public void abrirPuerta() {
        puertaAbierta = true;
    }

    public void cerrarPuerta() {
        puertaAbierta = false;
    }

    public int enQuePisoEstas() {
        return pisoActual;
    }

    public void irAFain() {
        this.andaAlPiso(5);
    }

    public Persona quienEstaViajando() {
        return this.quienViaja;
    }

    public boolean hayAlguienAdentro() {
        return this.quienViaja != null;
    }

    // que vaya al piso que quiere el objeto quienViaja
    public void comenzar(){
        this.cerrarPuerta();
        this.andaAlPiso( this.quienViaja.aQuePisoQueresIr() );

    }

}

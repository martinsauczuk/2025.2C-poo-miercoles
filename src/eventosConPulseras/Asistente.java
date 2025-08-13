package eventosConPulseras;

public class Asistente {

    private Pulsera pulsera;

    public void recibirPulsera(Pulsera unaPulsera) {
        this.pulsera = unaPulsera;
    }

    public Pulsera quePulseraTenes() {
        return pulsera;
    }
}

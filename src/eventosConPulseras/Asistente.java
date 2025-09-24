package eventosConPulseras;

public class Asistente {

    private Pulsera pulsera;

    public void recibirPulsera(Pulsera unaPulsera) {
        this.pulsera = unaPulsera;
    }

    public Pulsera quePulseraTenes() {
        return pulsera;
    }

    public Asistente(){
        //
    }

    public void intercambiarPulseraCon(Asistente otroAsistente) {
        Pulsera pulseraDelOtroAsistente = otroAsistente.quePulseraTenes();
        otroAsistente.recibirPulsera(this.pulsera); // le doy mi pulsera
        this.pulsera = pulseraDelOtroAsistente;
    }
}

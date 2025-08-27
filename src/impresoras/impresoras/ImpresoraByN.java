package impresoras.impresoras;

public class ImpresoraByN extends Impresora {

    public ImpresoraByN(int cantNegro, int cantHojas) {
        super(0, 0, 0, cantNegro, cantHojas);
    }

    @Override
    public boolean podesImprimir(Documento unDocumento) {
        return hayTintaNegraSuficiente(unDocumento) && hayHojasSuficientes(unDocumento);
    }

    private boolean hayTintaNegraSuficiente(Documento unDocumento) {
        return unDocumento.sumatoriaDeTusTintas() <= cantNegro;
    }

    @Override
    public Documento imprimir(Documento unDocumento) {

        this.incrementarContadores(unDocumento);
        this.actualizarTintaNegra(unDocumento);
        this.actualizarHojas(unDocumento);

        unDocumento.marcarComoImpreso();
        return unDocumento;
    }

    private void actualizarTintaNegra(Documento unDocumento) {
        this.cantNegro = cantNegro - unDocumento.sumatoriaDeTusTintas();
    }
}

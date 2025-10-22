package impresoras.impresoras;

public class Impresora {

    private int cantCian;
    private int cantMagenta;
    private int cantAmarillo;
    protected int cantNegro;

    private int cantHojas;

    private int contadorDeHojas;
    private int contadorDeDocumentos;


    public Impresora(int cantCian, int cantMagenta, int cantAmarillo, int cantNegro, int cantHojas) {
        this.cantCian = cantCian;
        this.cantMagenta = cantMagenta;
        this.cantAmarillo = cantAmarillo;
        this.cantNegro = cantNegro;
        this.cantHojas = cantHojas;
    }



    public void recargarTodo() {
        this.cantCian = 1000;
        this.cantMagenta = 1000;
        this.cantAmarillo = 1000;
        this.cantNegro = 1000;
        this.cantHojas = 500;
    }

    public int getContadorDeDocumentos() {
        return contadorDeDocumentos;
    }

    public int getContadorDeHojas() {
        return contadorDeHojas;
    }

    private boolean hayTinta(Documento unDocumento) {
        return (
                cantCian >= unDocumento.getCantCian()
                        && cantMagenta >= unDocumento.getCantMagenta()
                        && cantAmarillo >= unDocumento.getCantAmarillo()
                        && cantNegro >= unDocumento.getCantNegro()
        );
    }


    protected boolean hayHojasSuficientes(Documento unDocumento) {
        return cantHojas >= unDocumento.getCantPaginas();
    }


    public boolean podesImprimir(Documento unDocumento) {

        return hayTinta(unDocumento) && hayHojasSuficientes(unDocumento);

    }


    public Documento imprimir(Documento unDocumento) throws ImpresionException, ArithmeticException {

        // division



        if ( !podesImprimir(unDocumento)) {
            throw new ImpresionException("Error en la impresion", 3434, "Asegurate no quedarte sin hojas");
        }

        this.incrementarContadores(unDocumento);
        this.actualizarTintas(unDocumento);
        this.actualizarHojas(unDocumento);
        unDocumento.marcarComoImpreso();

        return unDocumento;
    }


    protected void actualizarHojas(Documento unDocumento) {
        cantHojas = cantHojas - unDocumento.getCantPaginas();
    }

    protected void incrementarContadores(Documento unDocumento) {
        contadorDeHojas = contadorDeHojas + unDocumento.getCantPaginas();
        contadorDeDocumentos = contadorDeDocumentos + 1;
    }


    private void actualizarTintas(Documento unDocumento) {
        cantCian = cantCian - unDocumento.getCantCian();
        cantMagenta = cantMagenta - unDocumento.getCantMagenta();
        cantAmarillo = cantAmarillo - unDocumento.getCantAmarillo();
        cantNegro = cantNegro - unDocumento.getCantNegro();
    }


    @Override
    public String toString() {
        return "Impresora{" +
                "cantCian=" + cantCian +
                ", cantMagenta=" + cantMagenta +
                ", cantAmarillo=" + cantAmarillo +
                ", cantNegro=" + cantNegro +
                ", cantHojas=" + cantHojas +
                ", contadorDeHojas=" + contadorDeHojas +
                ", contadorDeDocumentos=" + contadorDeDocumentos +
                '}';
    }
}

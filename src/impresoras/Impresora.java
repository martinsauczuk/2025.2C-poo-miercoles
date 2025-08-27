package impresoras;

public class Impresora {

    private int cantCian;
    private int cantMagenta;
    private int cantAmarillo;
    private int cantNegro;

    private int cantHojas;

    private int contadorDeHojas;
    private int contadorDeDocumentos;


    public Impresora(int cantCian, int cantMagenta, int cantAmarillo, int cantNegro, int cantHojas) {
        System.out.println("Soy un constructor con parametros");
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


    private boolean hayHojasSuficientes(Documento unDocumento) {
        return cantHojas >= unDocumento.getCantPaginas();
    }


    public boolean podesImprimir(Documento unDocumento) {

        return hayTinta(unDocumento) && hayHojasSuficientes(unDocumento);

    }






    private void actualizarTintas(Documento unDocumento) {
        cantCian = cantCian - unDocumento.getCantCian();
        cantMagenta = cantMagenta - unDocumento.getCantMagenta();
        cantAmarillo = cantAmarillo - unDocumento.getCantAmarillo();
        cantNegro = cantNegro - unDocumento.getCantNegro();
    }




}

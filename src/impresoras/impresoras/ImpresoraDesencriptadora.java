package impresoras.impresoras;

public class ImpresoraDesencriptadora extends Impresora{
    public ImpresoraDesencriptadora(int cantCian, int cantMagenta, int cantAmarillo, int cantNegro, int cantHojas) {
        super(cantCian, cantMagenta, cantAmarillo, cantNegro, cantHojas);
    }

    @Override
    public Documento imprimir(Documento unDocumento) {
        unDocumento.desencriptar();

        return super.imprimir(unDocumento);
    }
}

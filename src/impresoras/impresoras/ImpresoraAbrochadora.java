package impresoras.impresoras;

public class ImpresoraAbrochadora extends Impresora{


    public ImpresoraAbrochadora(int cantCian, int cantMagenta, int cantAmarillo, int cantNegro, int cantHojas) {
        super(cantCian, cantMagenta, cantAmarillo, cantNegro, cantHojas);
    }

    @Override
    public Documento imprimir(Documento unDocumento) {
        // lo que hacia Impresora pero agregar "algo"
        Documento unDocumntoImpreso = super.imprimir(unDocumento);
        unDocumntoImpreso.abrochar();
        return unDocumntoImpreso;
    }


}

package impresoras.impresoras;

public class ImpresionException extends RuntimeException {

    private int cantidadDeHojasFaltantes;
    private String sugerencia;


    public ImpresionException(String message, int cantidadDeHojasFaltantes, String sugerencia) {
        super(message);
        this.cantidadDeHojasFaltantes = cantidadDeHojasFaltantes;
        this.sugerencia = sugerencia;
    }

    public int getCantidadDeHojasFaltantes() {
        return cantidadDeHojasFaltantes;
    }

    public String getSugerencia() {
        return sugerencia;
    }
}

package impresoras;

public class Documento {
    private int cantCian;
    private int cantMagenta;
    private int cantAmarillo;
    private int cantNegro;
    private int cantPaginas;

    private boolean fueImpreso = false;

    public Documento(int cantCian, int cantMagenta, int cantAmarillo, int cantNegro, int cantPaginas) {
        this.cantCian = cantCian;
        this.cantMagenta = cantMagenta;
        this.cantAmarillo = cantAmarillo;
        this.cantNegro = cantNegro;
        this.cantPaginas = cantPaginas;
    }

    public void marcarComoImpreso() {
        this.fueImpreso = true;
    }

    public int getCantCian() {
        return cantCian;
    }

    public int getCantMagenta() {
        return cantMagenta;
    }

    public int getCantAmarillo() {
        return cantAmarillo;
    }

    public int getCantNegro() {
        return cantNegro;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public int sumatoriaDeTusTintas(){
        return cantCian + cantMagenta + cantAmarillo + cantNegro;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "fueImpreso=" + fueImpreso +
                '}';
    }
}

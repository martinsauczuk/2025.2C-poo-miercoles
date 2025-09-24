package impresoras.impresoras;

import eventosConPulseras.Evento;

public class Documento {
    private int cantCian;
    private int cantMagenta;
    private int cantAmarillo;
    private int cantNegro;
    private int cantPaginas;

    private boolean fueImpreso;
    private boolean fueAbrochado;
    private boolean estaEncripado = true;

    public Documento(int cantCian, int cantMagenta, int cantAmarillo, int cantNegro, int cantPaginas) {
        this.cantCian = cantCian;
        this.cantMagenta = cantMagenta;
        this.cantAmarillo = cantAmarillo;
        this.cantNegro = cantNegro;
        this.cantPaginas = cantPaginas;
    }

    public void desencriptar() {
        this.estaEncripado = false;
    }

    public void marcarComoImpreso() {
        this.fueImpreso = true;
    }

    public void abrochar() {
        this.fueAbrochado = true;
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
                "cantCian=" + cantCian +
                ", cantMagenta=" + cantMagenta +
                ", cantAmarillo=" + cantAmarillo +
                ", cantNegro=" + cantNegro +
                ", cantPaginas=" + cantPaginas +
                ", fueImpreso=" + fueImpreso +
                ", fueAbrochado=" + fueAbrochado +
                '}';
    }
}

package mudanzas;

import java.util.HashSet;

public class Viaje {

    private HashSet<Medible> productosMedibles = new HashSet<>();
    private HashSet<Pesable> productosPesables = new HashSet<>();

    public int pesoTotalTransportado() {
        int pesoTotal = 0;
        for (Pesable productoPesable : productosPesables) {
            pesoTotal = pesoTotal + productoPesable.obtenerPeso();
        }
        return pesoTotal;
    }

    public int volumenTransportado() {
        int volumenTotal = 0;
        for (Medible productoMedible : productosMedibles) {
            volumenTotal = volumenTotal + productoMedible.obtenerVolumen();
        }
        return volumenTotal;
    }

    public void cargarProductoPesable(Pesable unProductoPesable) {
        productosPesables.add(unProductoPesable);
    }

    public void cargarProductoMedible(Medible unProductoMedible) {
        productosMedibles.add(unProductoMedible);
    }

}

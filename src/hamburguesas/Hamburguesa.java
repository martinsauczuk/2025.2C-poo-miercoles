package hamburguesas;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Hamburguesa {

    private final ArrayList<Medallon> medallones = new ArrayList<>();
    private final ArrayList<Adicional> adicionales = new ArrayList<>();
    private final Pan pan;

    public Hamburguesa(Pan pan) {
        this.pan = pan;
    }

    public void agregarMedallon(Medallon unMedallon) {
        medallones.add(unMedallon);
    }

    public void agregarAdicional(Adicional unAdicional) {
        adicionales.add(unAdicional);
    }

    public boolean puedeSerFacturada() {
        return ( !medallones.isEmpty() && tieneCantidadesValidas() );
    }

    private boolean tieneCantidadesValidas() {
        return medallones.size() >= adicionales.size();
    }

    public int precioTotal() {
       return ( // precio pan
            pan.getPrecio() +
            // precio medallones
            this.precioMedallones() +
            // precio adicionales
            this.precioAdicionales()
       );
    }

    private int precioMedallones() {
        int precioAcumulado = 0;
        for (Medallon medallon : medallones) {
            precioAcumulado = precioAcumulado +medallon.getPrecio();
        }
        return precioAcumulado;
    }

    private int precioAdicionales() {
        int precioAcumulado = 0;
        for (Adicional adicional : adicionales) {
            precioAcumulado = precioAcumulado + adicional.getPrecio();
        }
        return precioAcumulado;
    }

}

package hamburguesas;

public class Main {

    public static void main(String[] args) {

        Medallon carne = new Medallon(2900);

        Pan panDePapa = new Pan(4500);
        Hamburguesa bigUade = new Hamburguesa(panDePapa);
        bigUade.agregarMedallon(carne);

        bigUade.precioTotal();


    }

}

package eventosConPulseras;

public class Main {

    public static void main(String[] args) {

        Pulsera pulseraAzul = new Pulsera();
        pulseraAzul.establecerPrecio(7000);

        Pulsera pulseraVerde = new Pulsera();
        pulseraVerde.establecerPrecio(0);


        // TODO: Falta crear el resto de las puseras

        // Martin tiene pulsera azul -> paga 7000
        Evento conferenciaAlanKay = new Evento();

        Asistente martin = new Asistente();
        martin.recibirPulsera(pulseraAzul);

        System.out.println( conferenciaAlanKay.cuantoPaga(martin) ); // 7000


    }

}

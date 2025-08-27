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


        Asistente antonella = new Asistente();
        antonella.recibirPulsera(pulseraVerde);

        System.out.println( conferenciaAlanKay.cuantoPaga(martin) ); // 7000


        System.out.println("La pulsera de martin es " + martin.quePulseraTenes());
        System.out.println("La pulsera de antonella es " + antonella.quePulseraTenes());

        martin.intercambiarPulseraCon(antonella);

        System.out.println("La pulsera de martin es " + martin.quePulseraTenes());
        System.out.println("La pulsera de antonella es " + antonella.quePulseraTenes());

        System.out.print( "Martin tiene la pulsera verde :" );
        System.out.println( martin.quePulseraTenes() == pulseraVerde );


    }

}

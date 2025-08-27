package impresoras;

public class Main {

    public static void main(String[] args) {

        Impresora hp1 = new Impresora(1000, 1000, 1000, 1000, 500);
        Documento miDoc = new Documento(10,10, 10, 10, 100);

        Documento miDoc10000 = new Documento(10,10, 10, 10, 10000);

        System.out.println( "Podes imprimir miDoc: " + hp1.podesImprimir(miDoc) );
        System.out.println( "Podes imprimir miDoc10000 " +hp1.podesImprimir(miDoc10000) );




    }
}

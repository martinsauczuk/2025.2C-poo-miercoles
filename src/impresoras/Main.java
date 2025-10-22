package impresoras;

import impresoras.impresoras.Documento;
import impresoras.impresoras.Impresora;
import impresoras.impresoras.ImpresoraByN;

public class Main {

    public static void main(String[] args) {

        Impresora hp1 = new Impresora(1000, 1000, 1000, 1000, 1);
        Documento miDoc = new Documento(10,10, 10, 10, 100);

        Documento miDoc10000 = new Documento(10,10, 10, 10, 10000);

        // Esperamos true
        System.out.println( "Podes imprimir miDoc: " + hp1.podesImprimir(miDoc) );

        // Esperamos false
        System.out.println( "Podes imprimir miDoc10000 " +hp1.podesImprimir(miDoc10000) );

//        hp1.imprimir(miDoc);

        System.out.println(hp1.getContadorDeHojas());
        System.out.println(hp1);


        ImpresoraByN byn1 = new ImpresoraByN(6777,3000);
        byn1.podesImprimir(miDoc10000);
        byn1.imprimir(miDoc10000);
        System.out.println(byn1);





    }
}

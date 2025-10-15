package mudanzas;

public class Main {

    public static void main(String[] args) {

        Heladera miHeladera = new Heladera(150);
        CajaDeChocolate cajaDeChocolate = new CajaDeChocolate(1000);

        Viaje viajeBarilocheCABA = new Viaje();
        viajeBarilocheCABA.cargarProductoPesable(miHeladera);
        viajeBarilocheCABA.cargarProductoPesable(cajaDeChocolate);

        PerfilDeAluminio perfilDeAluminio = new PerfilDeAluminio(1242);

        viajeBarilocheCABA.cargarProductoMedible(perfilDeAluminio);
        viajeBarilocheCABA.cargarProductoMedible(perfilDeAluminio);

        viajeBarilocheCABA.cargarProductoPesable(miHeladera);
        viajeBarilocheCABA.cargarProductoMedible(miHeladera);

        System.out.printf("Estamos transportando %dkg %n", viajeBarilocheCABA.pesoTotalTransportado());
    }

}

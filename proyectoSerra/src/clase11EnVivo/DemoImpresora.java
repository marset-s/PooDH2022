package clase11EnVivo;

public class DemoImpresora {

    public static void main(String[] args) {

        ImpresoraCannon impresora1 = new ImpresoraCannon();
        impresora1.setHojasDisponibles(10);
        impresora1.setPorcentajeTinta(10.0);

        System.out.println("tiene papel " + impresora1.tienePapel());
        System.out.println("Necesita tinta " + impresora1.necesitaTinta());
        System.out.println( impresora1.imprimir());

        ImpresoraEpson impresora2 = new ImpresoraEpson();
        impresora2.setHojasDisponibles(10);
        impresora2.setPorcentajeTinta(7.0);

        System.out.println("tiene papel " + impresora2.tienePapel());
        System.out.println("Necesita tinta " + impresora2.necesitaTinta());
        System.out.println( impresora2.imprimir());


    }
}

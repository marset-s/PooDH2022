package clase6;

import java.util.Date;

public class DemoImpresora {

    public static void main(String[] args) {

        Date fecha = new Date(2022, 10, 27);


        Impresora impresora1 = new Impresora("HP1102", "USB");
        impresora1.setFechaDeFabricacion(fecha);
        impresora1.setCantidadDeHojas(10);
        impresora1.imprimir("Hola mundo 1", 3);
        impresora1.imprimir("Hola mundo 2", 3);
        impresora1.imprimir("Hola mundo 3", 5);




    }
}

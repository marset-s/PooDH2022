package clase10;

public class Demo {

    public static void main(String[] args) {

        Socio socio1 = new Socio("12345", "Pepe");
        Socio socio2 = new Socio("123453456", "Ana", 1000.0);

        SocioVip socioVip1 = new SocioVip("12342325", "Maria", "Correcta");

Pileta pileta = new Pileta("Grande");


        System.out.println(socio1.toString());
        System.out.println(pileta.toString());

    }
}

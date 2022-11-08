package clase6;

public class DemoMascota {

    public static void main(String[] args) {

        // creo dos objetos..

        Mascota mascota1 = new Mascota("Rose", 8.4);
        Mascota mascota2 = new Mascota(true, true);

        // seteo atrubutos que faltan a objeto mascota1
        mascota1.setAnioDeNacimiento(2010);
        mascota1.setReza("Pastor");
        mascota1.setEstaLastimado(true);
        mascota1.setTieneChip(true);


        // llamo a los metodos
        mascota1.preguntarEdad(2022);
        mascota1.adoptar();
        mascota1.sePierde();

    }

}

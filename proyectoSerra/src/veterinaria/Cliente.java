package veterinaria;

public class Cliente {

    // cliente

    private String nombre;
    private String mascotaNombre;
    private int cantidadConsulta;
    private double sladoDeudor;

    // constructor

    public Cliente(String nombre, String mascotaNombre, int cantidadConsulta, double sladoDeudor) {

        this.nombre = "";
        this.mascotaNombre = "";
        this.cantidadConsulta = 0;
        this.sladoDeudor = 0.0;

    }

    // creando mi objeto
    //  Cliente cliente = new Cliente("Serra", "Mulan", 2, 300,4);


    // metodos

    public double pagarConsulta() {
        return 0.0;
    }

    public boolean dejarMascota() {
        return true;
    }

    public boolean retirarMascota() {
        return true;
    }

    public static void main(String[] args) {

      /*  Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.nombre = "Serra";
        cliente1.mascotaNombre = "Mulix";
        cliente1.sladoDeudor= 345.2;
        cliente1.cantidadConsulta= 3;


        System.out.println("nombre del cliente: " + cliente1.nombre + "Nombre de su mascota: " + cliente1.mascotaNombre);
    }*/

    }


}

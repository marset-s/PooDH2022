package veterinaria;

public class Veterinario {

    // atributos

    public String nombre;
    public int consultorio;
    public String especialidad;
    public double costoConsulta;

    // constructor

    public Veterinario(){

        this.nombre= "";
        this.consultorio= 0;
        this.especialidad= "";
        this.costoConsulta= 0.0;

    }

    // metodos

    public double medir(){
        return 0.0;
    }


    public double pesar(){
        return 0.0;
    }

    public String registrar(){
        return "";
    }

    public double facturar(){
        return 0.0;
    }


}

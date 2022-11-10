package mesa11;

public abstract class Cuenta {

    protected int numeroCuenta;
    protected double saldo;
    protected Cliente cliente;


    // constructor
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    // metodos

    public void depositarEfectivo(double cantidadAdepositar){
        System.out.println("Deposita " + cantidadAdepositar);
    }

    public void informarSaldo(){
        System.out.println("Su saldo es: " + saldo );
    }


    // metodo abstract

    public abstract String extraerEfectivo(double cantidadAextraer);



}

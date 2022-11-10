package mesa11;

public class CajaAhorro extends Cuenta {

    private double tasaInteres;

    // constructor

    public CajaAhorro(double saldo) {

        super(saldo);
    }


    public CajaAhorro(double saldo, double tasaInteres) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }



    // Getters y Setters


    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    // Metedo abstract

    public String extraerEfectivo(double cantidadAextraer){
        if(saldo>= cantidadAextraer){
            double saldoDisponible = saldo - cantidadAextraer;
            return "Su saldo disponible es: " + saldoDisponible;
        } else {
            return "Saldo insuficiente";
        }
    }


    // metodos

    public double cobrarInteres(){

        return  this.tasaInteres * this.saldo;
    }


}

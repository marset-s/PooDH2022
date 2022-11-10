package mesa11;

public class CuentaCorriente extends Cuenta{

    private double descubierto;

    // constructor

    public CuentaCorriente(double saldo, double descubierto) {
        super(saldo);
        this.descubierto = descubierto;
    }


    // getters y setters


    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }


    // metodo abstracto

    public String extraerEfectivo(double cantidadAextraer) {
        if (saldo >= cantidadAextraer) {
            double osaldoDisponible = saldo - cantidadAextraer;
            System.out.println("Su saldo disponible es " + osaldoDisponible);
        } else if ((saldo < cantidadAextraer) && (descubierto >= cantidadAextraer)) {
            double saldoDisponibleDescubierto = descubierto - cantidadAextraer;
            return "Su disponible descubierto es: " + saldoDisponibleDescubierto;
        } else {
            return "Salado insificiente";
        }
        return null;
    }


// metodo

    public String depositarCheque(double importeCheque){
       double saldoTotal = saldo + importeCheque;
       return "Su saldo actual es de: " + saldoTotal;
    }



}

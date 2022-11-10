package mesa11;

public class Demo {
    public static void main(String[] args) {

        CajaAhorro cajaAhorro1 = new CajaAhorro(3000);


        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(2000.0, 5000);


        System.out.println(cuentaCorriente1.extraerEfectivo(2500.0));
        System.out.println("Cuenta corriente");

        System.out.println(cajaAhorro1.extraerEfectivo(1000.0));
        System.out.println("Caja de ahorro");

        cajaAhorro1.informarSaldo();
        cuentaCorriente1.depositarCheque(1500.0);

    }

}

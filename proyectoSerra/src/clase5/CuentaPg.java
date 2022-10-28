package clase5;

// forma Juan

public class CuentaPg {

    public class Cuenta {

        private int numeroDeCuenta;
        private Double saldo;

        // Crear la función depositar y retirar aca
        public void depositar(Double cantidadDeDinero) {
            setSaldo(saldo + cantidadDeDinero);
        }

        public void retirar(Double cantidadDeDinero) {
            if(getSaldo() >= cantidadDeDinero) {
                setSaldo(saldo - cantidadDeDinero);
            }
        }

        // No tocar estas funciones
        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }

        public Double getSaldo() {
            return saldo;
        }
    }

}

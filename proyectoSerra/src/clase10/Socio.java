package clase10;

public class Socio {

    protected String codigo;
    protected String nombre;
    protected double costoFijoMensual;
    protected boolean estaPagaLaCuota;

// constructores
    public Socio(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Socio(String codigo, String nombre, double costoFijoMensual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costoFijoMensual = costoFijoMensual;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costoFijoMensual=" + costoFijoMensual +
                ", estaPagaLaCuota=" + estaPagaLaCuota +
                '}';
    }






    // setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCostoFijoMensual(double costoFijoMensual) {
        this.costoFijoMensual = costoFijoMensual;
    }



// getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCostoFijoMensual() {
        return costoFijoMensual;
    }


}

package clase6;

import java.util.Date;

    public class Impresora {

    private String modelo;
    private String tipoDeConexion;
    private Date fechaDeFabricacion;
    private int cantidadDeHojas = 0;


    public Impresora(String modelo, String tipoDeConexion){
        this.modelo = modelo;
        this.tipoDeConexion = tipoDeConexion;
    }

    public Impresora(String modelo, String tipoDeConexion, Date fechaDeFabricacion){
        this.modelo = modelo;
        this.tipoDeConexion = tipoDeConexion;
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    public void imprimir(String documento, int hojas){
        if(hojas <= this.cantidadDeHojas ){
            this.cantidadDeHojas -= hojas;
            System.out.println("Imprimiendo..." + documento);
        } else {
            System.out.println("Falta papel..." + documento);
        }

    }

    // desde la clase si puedo acceder a los atributos privados.

    // getters: devuelve datos, obtengo dato
         public String getModelo(){
            return this.modelo;
        }

        public String getTipoDeConexion(){
            return this.tipoDeConexion;
        }

        public Date getFechadeFabricacion(){
            return this.fechaDeFabricacion;
        }

        public int getCantidadDeHojas(){
            return this.cantidadDeHojas;
        }

        // setters

        public void setFechaDeFabricacion(Date fecha){
            this.fechaDeFabricacion = fecha;
        }

        public void setCantidadDeHojas(int hojas){
            this.cantidadDeHojas = hojas;
        }




}

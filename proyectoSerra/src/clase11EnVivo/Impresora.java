package clase11EnVivo;


// Importa, todo lo que es java util, como el scanner

import java.util.*;

public abstract class Impresora {

    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;

    public boolean tienePapel(){
        if (this.hojasDisponibles > 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean necesitaTinta(){
        if (this.porcentajeTinta >= 10.0){
            return false;
        }else {
            return true;
        }
    }

    // metodo abstract

    public abstract String imprimir();



    // Getters y Setters


    public String getModelo() {
        return modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }
}

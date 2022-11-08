package clase10;

public class SocioVip extends Socio{


private String revisionMedica;
private  boolean estaHabilitado;


    public SocioVip(String codigo, String nombre, String revisionMedica) {
        super(codigo, nombre);
        this.revisionMedica = revisionMedica;
    }


    public String getRevisionMedica() {
        return revisionMedica;
    }

    public void setRevisionMedica(String revisionMedica) {
        this.revisionMedica = revisionMedica;
    }

    public boolean getEstaHabilitado() {
        return estaHabilitado;
    }

    public void setEstaHabilitado(boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }



}

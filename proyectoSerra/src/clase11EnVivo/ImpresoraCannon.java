package clase11EnVivo;

public class ImpresoraCannon extends Impresora{

    @Override
    public boolean necesitaTinta() {
        if (this.getPorcentajeTinta() >= 5.0){
            return false;
        }else {
            return true;
        }
    }


    public String imprimir() {
      if (this.tienePapel() == true && this.necesitaTinta() == false) {
          return "imprimiendo en Cannon.....";
      }else {
          return"No se puede imprimir desde Cannon";
      }
    }


}

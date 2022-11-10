package clase11EnVivo;

public class ImpresoraEpson extends Impresora{

    public String imprimir() {
        if (this.tienePapel() == true && this.necesitaTinta() == false) {
            return "imprimiendo en Epson.....";
        }else {
            return"No se puede imprimir desde Epson";
        }
    }


}

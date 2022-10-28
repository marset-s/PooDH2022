package clase5;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    // constructor
    public UsuarioJuego(String nombre,String clave, Double puntaje, int nivel ){
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 1;
    }

    public void aumentarPuntaje(){
        this.puntaje++;
    }

    public void aumentarNivel(){
        this.nivel++;
    }

    public void bonus(int valor){
        this.puntaje += valor;
    }


}

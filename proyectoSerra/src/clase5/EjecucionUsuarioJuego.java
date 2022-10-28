package clase5;

public class EjecucionUsuarioJuego {

    public static void main(String[] args) {

        UsuarioJuego elMejorUsuario = new UsuarioJuego("Juan David", "jajajaj", 100.1, 3);

        elMejorUsuario.aumentarNivel();
        elMejorUsuario.aumentarPuntaje();
        elMejorUsuario.bonus(451);
    }

}

package clase6;

public class Mascota {

    private boolean estaEnAdopcion;

    private String reza;
    private int anioDeNacimiento;
    private double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombrePila;


    // constructores...
    public Mascota (String nombre, double peso){
        this.nombrePila = nombre;
        this.peso = peso;
    }

    public Mascota(boolean chip, boolean lastimado ){
        this.tieneChip = chip;
        this.estaLastimado = lastimado;
    }

    // metodos...

    public void preguntarEdad(int anioActual){
        int edad = anioActual - this.anioDeNacimiento;
        System.out.println("La eada del perro es: " + edad);
    }

    public void sePierde(){
        if(this.tieneChip){
            System.out.println("El animal no se pierde");
        } else {
            System.out.println("El animal puede llegar a perderse");
        }
    }

    public void adoptar(){
        if(!this.estaLastimado && (this.peso > 5.0)){
            System.out.println("El animal se puede adoptar");
        } else {
            System.out.println("El animal no se puede adoptar");
        }
    }

    // setter

    public void setEstaEnAdopcion(boolean estaEnAdopcion) {
        this.estaEnAdopcion = estaEnAdopcion;
    }

    public void setAnioDeNacimiento(int anioDeNacimiento) {
        this.anioDeNacimiento = anioDeNacimiento;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setReza(String reza) {
        this.reza = reza;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    // getter


    public double getPeso() {
        return this.peso;
    }

    public int getAnioDeNacimiento() {
        return this.anioDeNacimiento;
    }

    public String getNombrePila() {
        return this.nombrePila;
    }

    public String getReza() {
        return this.reza;
    }

    public boolean getEstaEnAdopcion(){
        return this.estaEnAdopcion;
    }

    public boolean getEstaLastimado(){
        return this.estaLastimado;
    }

    public boolean getTieneChip(){
        return this.tieneChip;
    }



}

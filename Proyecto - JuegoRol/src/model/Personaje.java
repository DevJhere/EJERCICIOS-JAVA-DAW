package model;

public abstract class Personaje {
    //Atributes
    protected String nombre, rango; //Protected -> Los hijos podrán acceder a estos atributos con más facilidad
    protected int vida, vidaMaxima;


    //Constructor
    public Personaje() {
    }

    public Personaje(String nombre, String rango, int vida) {
        this.nombre = nombre;
        this.rango = rango;
        this.vida = vida; //Revisar que al curar vida pasa de 100;
        this.vidaMaxima = vida;
    }

    //Getters y Setters
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    //Funcionalidades
    public void recibirDanio(int cantidad){

        //Al recibir algún tipo de año restamos la vida del Personaje
        this.vida -= cantidad;

        if (this.vida <= 0){
            this.vida = 0; // Se asigna 0 en caso de tener vida negativa
        }

        System.out.println(getNombre() + " ha recibido " + cantidad + " puntos de daño. Vida restante: " + this.vida); //No se muestra el nombre del personaje atacado - corregir
    }

    public void mostrarInformacion(){

        String vivoOMuerto = isVivo() ? "Vivo" : "Muerto";

        System.out.printf("""
                Nombre: %s
                Rango: %s
                Vida: %d
                Estado: %s
                """, getNombre(), getRango(), getVida(), vivoOMuerto);
    }

    //Metodo para controlar salud Maxima
    public void recibirCuraMaxima(int cantidad){
        this.vida += cantidad;

        //Controlamos exceso de curación a vida maxima
        if (this.vida > this.vidaMaxima){
            this.vida = this.vidaMaxima;
        }
    }

    public boolean isVivo(){
        return this.vida > 0; //True si tiene vida Positiva

    }
}

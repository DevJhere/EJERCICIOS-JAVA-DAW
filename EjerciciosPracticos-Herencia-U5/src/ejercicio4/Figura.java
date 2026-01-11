package ejercicio4;

public abstract class Figura {
    //Atributos
    private String nombre;

    //Constructor
    public Figura() {
    }

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Funcionalidades - Métodos
    public abstract void calcularArea();

}

package ejercicio1;

public class Animal {
    //Atributos
    private String nombre;
    private int edad;

    //Constructor
    public Animal() {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Funcionalidades
    public void hacerSonido(){
        System.out.println("Un animal tiene un sonido especifico");
    }
}

package model;

public abstract class Persona {
    //Atributos
    private String nombre;
    private int id, edad;

    //Constructor
    public Persona() {
    }

    public Persona(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    public Persona(int id, String nombre){
        this(nombre,id,0);
    }

    //Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Funcionalidades
    public abstract void mostrarFicha();
}

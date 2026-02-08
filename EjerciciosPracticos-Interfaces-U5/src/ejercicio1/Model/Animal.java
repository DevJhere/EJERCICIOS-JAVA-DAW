package ejercicio1.Model;

/*CLASE ABSTRACTA DE ANIMAL, es el modelo base que van a heredar sus clases hijas*/
public abstract class Animal {
    //Usamos protected para acceder solo con la clase perteneciente a la familia
    protected String nombre;

    //Constructor
    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Funcionalidades
    public void dormir(){
        System.out.println("💤 " + nombre + " está durmiendo.");
    }

    public abstract void comer();
}

package ejercicio10;

public class Usuario {

    //Atributos
    private String nombre, numSocio;


    //Constructor
    public Usuario() {

    }
    public Usuario(String nombre, String numSocio) {
        this.nombre = nombre;
        this.numSocio = numSocio;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + "(" + numSocio + ")";
    }
}

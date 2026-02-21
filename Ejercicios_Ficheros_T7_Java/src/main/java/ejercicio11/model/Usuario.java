package ejercicio11.model;

public class Usuario {
    //Atributos
    private String nombre, apellido,dni;

    //Constructores
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //Getters and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //Funcionalidades

    public void mostrarDatos(){
        System.out.printf("""
                Nombre: %s
                Apellido: %s
                DNI: %s
                """, getNombre(), getApellido(), getDni());
        System.out.println();
    }

}

package model;

public class Paciente extends Persona {
    //Atributos
    private String sintomas;

    //Constructor
    public Paciente() {
    }

    public Paciente(String nombre, int id, int edad, String sintomas) {
        super(nombre, id, edad);
        this.sintomas = sintomas;
    }


    //Funcionalidades
    @Override
    public void mostrarFicha() {
        System.out.printf("""
                ID: %d
                Nombre: %s
                Edad: %d
                Sintomas: %s
                """, getId(), getNombre(), getEdad(), this.sintomas);
    }
}

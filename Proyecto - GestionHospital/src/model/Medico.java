package model;

public class Medico extends Persona {
    //Atributos
    private String especialidad;

    //Constructor
    public Medico() {
    }

    public Medico(String nombre, int id, int edad, String especialidad) {
        super(nombre, id, edad);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarFicha() {
        System.out.printf("""
                ID: %d
                Nombre: %s
                Edad: %d
                Especialidad: %s
                """, getId(), getNombre(), getEdad(), this.especialidad);
    }
}

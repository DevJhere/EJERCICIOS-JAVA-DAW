package ejercicio3;

public class Estudiante extends Persona{
    //Atributos propios
    private String curso;

    //Constructor
    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    //Getters and Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Funcionalidades
    public void estudiar(){
        System.out.println("Estoy estudiando " + getCurso() + " de DAW");
    }

}

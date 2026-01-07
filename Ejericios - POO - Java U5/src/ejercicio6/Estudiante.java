package ejercicio6;

public class Estudiante {

    //Atributos
    private String nombre;
    private int edad;
    private double nota;

    //Constructores
    public Estudiante(){}

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 &&nota <=10 ){
            this.nota = nota;
        }else {
            System.out.println("Error- La nota debe estar entre 0 - 10");
        }

    }
}

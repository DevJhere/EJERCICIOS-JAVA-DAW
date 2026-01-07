package ejercicio6;

public class Main {
    /*Crea una clase Estudiante con atributos privados nombre, edad y nota. La nota debe estar entre 0 y 10.
    Implementa el setter de nota validando que esté en el rango correcto (si no lo está, muestra un mensaje de error).
    Crea un objeto y prueba con diferentes valores.*/
    public static void main(String[] args) {

        //Instanciamos Objetos
        Estudiante estudiante1 = new Estudiante("Laura Fernandez", 16);
        System.out.println("Estudiante: " + estudiante1.getNombre());

        //Asigancion de nota
        System.out.print("Asignando nota 8.5: ");
        estudiante1.setNota(8.5);
        System.out.println("Correcto");

        System.out.println("Nota actual: " + estudiante1.getNota());

        //Asignamos una nueva nota no válida
        System.out.println("Asigando nota 12: ");
        estudiante1.setNota(12);
        System.out.println("Nota actual: " + estudiante1.getNota());
        System.out.println();

        System.out.println("Asiganando nota -3: ");
        estudiante1.setNota(-3);

        System.out.println("Nota actual: " +estudiante1.getNota());
    }
}

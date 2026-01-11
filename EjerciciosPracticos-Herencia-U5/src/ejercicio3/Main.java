package ejercicio3;

public class Main {
    /*
    * Crea una clase Persona con atributos nombre y edad, y un método presentarse().
    * Crea una clase Estudiante que herede de Persona y añada el atributo curso. Añade un método estudiar() en la clase
    * Estudiante. Crea objetos y prueba todos los métodos.
    * */
    public static void main(String[] args) {

        //Instanciamos Objeto Estudiante
        Estudiante estudiante1 = new Estudiante("Laura", 20, "1º");
        Estudiante estudiante2 = new Estudiante("Carlos", 19, "2º");

        //Aplicamos los métodos de herencia y únicos
        estudiante1.presentarse();
        estudiante1.estudiar();

        System.out.println();

        estudiante2.presentarse();
        estudiante2.estudiar();
    }
}

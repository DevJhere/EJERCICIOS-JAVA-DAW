package ejercicio1;

public class Main {
    //Crea una clase llamada Persona con dos atributos: nombre y edad. Define un constructor que inicialice estos atributos.
    // En el método main, crea un objeto de tipo Persona y muestra sus datos.
    public static void main(String[] args) {


        //Instanciamos el objeto Persona
        Persona persona = new Persona("Juan", 25);

        //Mostramos datos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}

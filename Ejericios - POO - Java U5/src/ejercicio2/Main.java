package ejercicio2;

public class Main {
    //Amplía la clase Persona del ejercicio anterior añadiendo métodos getter y setter para los atributos, nombre y edad.
    // Crea un objeto, modifica sus valores usando los setters y muestra los datos usando los getters.
    public static void main(String[] args) {

        //Creación de Objeto Persona - Instancia

        //Objeto Inicial
        Persona persona = new Persona("Lucas", 25);

        System.out.println("Datos Iniciales:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        //Objeto Modificado - Setter
        persona.setNombre("Maria");
        persona.setEdad(28);

        System.out.println("Datos Modificados:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}

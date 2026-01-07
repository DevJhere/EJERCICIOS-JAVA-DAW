package ejercicio7_1;

public class Main {
    /*
    * Crea una clase Direccion con atributos calle, ciudad y codigoPostal. Luego crea una clase Cliente que tenga como atributos
    *  nombre, email y un objeto Direccion. Implementa un método para mostrar todos los datos del cliente incluyendo su dirección.
    *                                                        */

    public static void main(String[] args) {
        //Instanciamos Objeto Direccion
        Direccion direccion1 = new Direccion("Menor 15", "Madrid", 28001);
        Direccion direccion2 = new Direccion("Empecinados 7", "Madrid, Móstoles", 28936);

        //Objeto cliente
        Cliente cliente1 = new Cliente("Pedro Ramirez", "pedror@gmail.com", direccion1);
        Cliente cliente2 = new Cliente("Samantha Cruellas", "samathacg4@gmail.com", direccion2);
        cliente1.mostrarInformacion();
        cliente2.mostrarInformacion();

    }
}

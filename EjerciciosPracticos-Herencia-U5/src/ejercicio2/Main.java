package ejercicio2;

public class Main {
    /*
    * Crea una clase Vehículo con atributos marca y modelo. Crea una clase Coche que herede de Vehiculo y añada
    * el atributo numeroPuertas. Implementa constructores en ambas clases usando super(). Crea varios objetos y
    * muestra su información.
    * */
    public static void main(String[] args) {
        System.out.println(" ----- FICHA VEHÍCULOS ------");

        //Instanciamos Coche con sus atributos
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza");

        Coche coche1 = new Coche("Toyota", "Rav-S", 5);
        Coche coche2 = new Coche("BMW", "M2", 3);

        System.out.println("Vehiculo: " + vehiculo.getMarca() + " " +vehiculo.getModelo());
        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
    }
}

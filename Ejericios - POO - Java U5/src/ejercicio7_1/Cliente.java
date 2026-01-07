package ejercicio7_1;

public class Cliente {

    //Atributos
    private String nombre, email;
    private Direccion direccion;

    //Constructor
    public Cliente() {

    }

    public Cliente(String nombre, String email, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    //Metodo mostrar información del cliente
    public void mostrarInformacion(){
        System.out.println("Cliente: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Dirección: " + direccion.toString());
        System.out.println();
    }
}

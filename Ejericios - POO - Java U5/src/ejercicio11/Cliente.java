package ejercicio11;

public class Cliente {
    //Atributos
    private String nombre, email;
    private Carrito carrito;

    //Constructor
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        //Inicializamos el objeto carrito
        this.carrito = new Carrito();
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}

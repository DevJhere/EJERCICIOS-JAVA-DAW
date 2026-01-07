package ejercicio11;

public class Main {
    /*
    * Crea un sistema de tienda online con las clases:
    * Producto (código, nombre, precio, stock),
    * Cliente (nombre, email, carrito) y
    * Carrito (lista de productos, cantidades).
    * Implementa métodos para añadir productos al carrito, eliminarlos, calcular el total y finalizar la compra (actualizando el stock).
    * Simula una compra completa.
    * */
    public static void main(String[] args) {
        //Instanciamos Objetos Producto
        Producto p1 = new Producto("P1", "Portátil", 899.99, 10);
        Producto p2 = new Producto("P2", "Ratón", 25.50, 20);
        Producto p3 = new Producto("P3", "Teclado", 45.99, 15);

        //Objeto Usuario
        Cliente cliente = new Cliente("Ana Martinez", "ana@gmail.com");

        //Mostramos Información
        System.out.println("--- TIENDA ONLINE ---");
        System.out.println("Cliente: " + cliente.getNombre() + "(" + cliente.getEmail() + ")");
        System.out.println();

        //Añadimos los Productos
        System.out.print("Añadiendo Portátil (899.99€) x1 al carrito... ");
        cliente.getCarrito().agregarProducto(p1, 1);
        //Confirmación
        System.out.println("✓");

        System.out.print("Añadiendo Ratón (25.50€) x2 al carrito... ");
        cliente.getCarrito().agregarProducto(p2, 2);
        System.out.println("✓");

        System.out.print("Añadiendo Teclado (45.99€) x1 al carrito... ");
        cliente.getCarrito().agregarProducto(p3, 1);
        System.out.println("✓");

        System.out.println();

        //Información Carrito LLENO
        System.out.println("----CARRITO COMPRA-----");
        cliente.getCarrito().mostrarCarrito();

        //Eliminando Producto
        System.out.println("Eliminando Ratón del carrito...");
        cliente.getCarrito().eliminarProducto("Ratón");
        System.out.println("✓");

        System.out.println();

        //Mostrar Carrito actualizado
        System.out.println("--- CARRITO ACTUALIZADO ---");
        cliente.getCarrito().mostrarCarrito();

        System.out.println();

        //Finalizar compra
        System.out.println("Finalizando compra...");
        cliente.getCarrito().finalizarCompra();
        System.out.println("✓ Compra realizada con éxito");
        System.out.println("Stock Actualizado");
    }
}

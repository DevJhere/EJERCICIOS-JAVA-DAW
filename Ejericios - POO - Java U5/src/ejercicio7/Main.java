package ejercicio7;

public class Main {
    public static void main(String[] args) {
        /*Crea una clase Producto con atributos nombre, precio y cantidad. Sobrescribe el método toString()
         para mostrar la información del producto de forma legible. Crea varios productos y
         muéstralos usando System.out.println().*/

        //Instanaciamos el Objeto
        Producto producto1 = new Producto("Teclado", 45.99, 10);
        Producto producto2 = new Producto("Ratón", 25.50, 25);
        Producto producto3 = new Producto("Monitor", 299.99, 5);

        System.out.println("Stock de Productos");

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
    }
}

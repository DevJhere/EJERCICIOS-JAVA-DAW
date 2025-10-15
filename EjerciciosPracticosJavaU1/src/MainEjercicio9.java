import java.util.Scanner;

public class MainEjercicio9 {
    //## Ejercicio 9: Información de un producto
    //
    //Escribe un programa que almacene la información de un producto (nombre, precio, código y disponibilidad) y
    // muestre estos datos formateados por consola.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Solicitamos información a Usuario
        System.out.println("Ingrese el nombre del Producto: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese precio del Producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese código promocional: ");
        String codigo = scanner.nextLine();

        System.out.println("¿Está Disponible (true/false)?: ");
        boolean disponible = scanner.nextBoolean();

        // LLamámos al método de la otra clase.
        MetodosEJercicio9 mostrarInformacion = new MetodosEJercicio9();
        mostrarInformacion.almacenar(nombre, precio, codigo, disponible);

        scanner.close();
    }
}

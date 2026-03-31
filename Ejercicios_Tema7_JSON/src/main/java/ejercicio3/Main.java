package ejercicio3;

import ejercicio2.controller.GestorApi;
import ejercicio3.controller.ApiController;

import java.util.Scanner;

public class Main {

    /*## Ejercicio 3: DummyJSON (un producto por id)
    Pide al usuario un id de producto (por ejemplo 1).

    Haz una petición a:

    - https://dummyjson.com/products/ID

    Muestra por consola:

    - title
    - description
    - category

    Si el id no existe o falla la petición, muestra un mensaje de error sencillo.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ApiController apiController = new ApiController();

        System.out.println("Introduce el ID del producto que quiere buscar: ");
        int idBuscar = sc.nextInt();

        apiController.buscarProductoID(idBuscar);
    }
}

package ejercicio2;

import ejercicio2.controller.GestorApi;

public class Main {
    /*## Ejercicio 2: DummyJSON (listar productos)

    Haz una petición a:

    - https://dummyjson.com/products?limit=5

    Recorre el array y muestra por consola, para cada producto:

    - id
    - title
    - price

    Pista: revisa `products`.*/

    public static void main(String[] args) {

        GestorApi consultas = new GestorApi();
        consultas.listarProductos();
    }
}

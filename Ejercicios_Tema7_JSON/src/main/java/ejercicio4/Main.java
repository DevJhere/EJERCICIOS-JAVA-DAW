package ejercicio4;

import ejercicio3.controller.ApiController;
import ejercicio4.controller.APIController;

public class Main {

    public static void main(String[] args) {
        /*## Ejercicio 4: JSONPlaceholder (posts y usuario)
        1. Haz una petición a:
        - https://jsonplaceholder.typicode.com/posts/1
        2. Con el `userId` del post, haz otra petición a:
        - https://jsonplaceholder.typicode.com/users/USER_ID
        Muestra por consola:
        - Título del post
        - Nombre del usuario
        - Ciudad del usuario*/

        // Instancia de APICONTROLLER
        APIController apiController = new APIController();

        apiController.mostrarPostYUsuario();
    }
}

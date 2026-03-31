package ejercicio1;

import ejercicio1.controller.API;

public class Main {

    /*## Ejercicio 1: RandomUser (datos básicos)
    Haz una petición a:

    - https://randomuser.me/api/

    Muestra por consola:

    - Nombre completo (title + first + last)
    - Email
    - País

    Pista: revisa `results[0]`.*/

    public static void main(String[] args) {

        API consultaApi = new API();

        consultaApi.consultaAPI();
    }
}

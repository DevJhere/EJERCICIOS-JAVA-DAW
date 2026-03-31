package ejercicio6;

import ejercicio6.controller.GestionAPI;

public class Main {

    public static void main(String[] args) {
        /*Ejercicio 6: Open Trivia DB (preguntas tipo test)
        Haz una petición a:
        https://opentdb.com/api.php?amount=3&type=multiple

        Para cada pregunta, muestra:
        category
        question
        correct_answer
        Nota: el texto puede venir con entidades HTML. Si quieres, añade una función para “limpiar” lo más básico (opcional).*/

        GestionAPI api = new GestionAPI();

        api.consultaTrivial();
    }
}

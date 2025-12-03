package ejercicios_arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        InteraccionArrays interaccion = new InteraccionArrays();
        int[] listaNumeros = new int[10];

        // Rellenamos la lista de números con úmero aleatorios
       interaccion.rellenarAleatorio(listaNumeros);

        String opcion = "";

        do {
            System.out.println("\n--- MENÚ DE ACCIONES ---");
            System.out.println("a. Imprimir array");
            System.out.println("b. Mover a izquierda");
            System.out.println("c. Mover a derecha");
            System.out.println("d. Invertir");
            System.out.println("x. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.next().toLowerCase();

            switch (opcion){
                case "a" -> {
                    System.out.println("Array Actual: " + Arrays.toString(listaNumeros));
                }
                case "b" -> {
                    interaccion.moverIzquierda(listaNumeros);
                    System.out.println("Movido a la izquierda: " + Arrays.toString(listaNumeros));
                }
                case "c" -> {
                    interaccion.moverDerecha(listaNumeros);
                    System.out.println("Movido a la derecha: " + Arrays.toString(listaNumeros));
                }
                case "d" -> {
                    interaccion.invertirArray(listaNumeros);
                    System.out.println("Invertido: " + Arrays.toString(listaNumeros));
                }
                case "x" -> {
                    System.out.println("Adiós!");
                }
                default -> System.out.println("Opción no válida");
            }
        }while (!opcion.equals("x"));
    }
}

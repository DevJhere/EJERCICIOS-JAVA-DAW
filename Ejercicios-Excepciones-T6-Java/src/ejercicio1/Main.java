package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*Crea un programa que pida al usuario dos números y realice la división del primero entre el segundo.
    Usa try-catch para capturar la excepción ArithmeticException que ocurre cuando se intenta dividir por cero.
    Muestra un mensaje apropiado si ocurre el error.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== División de dos Números ===");


        try {
            System.out.print("Introduce el primer número: ");
            int numero1 = sc.nextInt();

            System.out.print("Introduce el segundo número: ");
            int numero2 = sc.nextInt();

            divisionNumeros(numero1, numero2);
        } catch (InputMismatchException e) {
            System.out.println("Introduce solo números válidos enteros.");
        }

        sc.close();

    }

    public static void divisionNumeros(int numero1, int numero2) {

        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }

    }
}

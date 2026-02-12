package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class MainLambda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definimos Función Lambda
        BiConsumer<Integer, Integer> divisionNumeros = (num1, num2) -> {
            try {
                int resultado = num1/num2;
                System.out.printf("Resultado: %d", resultado);
            } catch (ArithmeticException e) {
                System.out.println("Imposible dividir entre 0.");
            }
        };

        try {
            System.out.println("=== DIVISIÓN DE NÚMEROS ===");

            System.out.print("Introduce número 1: ");
            int numero1 = sc.nextInt();

            System.out.print("Introduce número 2: ");
            int numero2 = sc.nextInt();

            divisionNumeros.accept(numero1, numero2);
        } catch (InputMismatchException e) {
            System.out.println("Debe introducir números enteros válidos");
        }

        sc.close();
    }
}

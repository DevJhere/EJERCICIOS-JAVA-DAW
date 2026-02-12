package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*Crea un programa que pida al usuario dos números y la operación a realizar (+, -, *, /). Usa múltiples bloques catch
    para manejar diferentes excepciones: ArithmeticException (división por cero), NumberFormatException (entrada no numérica)
     e InputMismatchException (si usas Scanner). Añade un bloque finally que siempre muestre el mensaje "Fin del programa".*/

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Calculadora controlada por Excepciones");

            System.out.print("Introduce el primer numero: ");
            int num1 = sc.nextInt();

            System.out.print("Introduce el segundo numero: ");
            String texto = sc.next();
            int num2 = Integer.parseInt(texto);

            System.out.println("Introduce la operación (+,-,*,/): ");
            char operacion = sc.next().charAt(0);

            int resultado = 0;

            switch (operacion) {
                case '+' -> {
                    resultado = num1 + num2;
                }
                case '-' -> {
                    resultado = num1 - num2;
                }

                case '*' -> {
                    resultado = num1 * num2;
                }

                case '/' -> {
                    resultado = num1 / num2;
                }

                default -> System.out.println("Operación no reconocida.");
            }

            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error Matemático. No se puede dividir por 0");
        } catch (NumberFormatException e) {
            System.out.println("Error de Formato. El segundo valor no es número válido");
        } catch (InputMismatchException e) {
            System.out.println("Error de entrada: El primer valor no es un entero válido");
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa");
        }
    }
}

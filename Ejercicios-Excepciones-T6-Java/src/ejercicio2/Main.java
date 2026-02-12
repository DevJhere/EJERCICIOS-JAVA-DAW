package ejercicio2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*## Ejercicio 2: Array fuera de límites
    Crea un programa que defina un array de 5 elementos con números enteros. Pide al usuario una posición del array y
    muestra el elemento en esa posición. Usa try-catch para capturar la excepción ArrayIndexOutOfBoundsException si el usuario
     introduce un índice inválido.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definimos Array con tamaño 5
        int[] enteros = {5,3,12,8,1};

        System.out.println("Array: " + Arrays.toString(enteros));


        try {
            System.out.print("Introduce la posición del elemento que deseas ver: ");
            int posicion = sc.nextInt();

            int valor = enteros[posicion];

            System.out.println("El valor en la posición " + posicion + " es: " + valor);


        } catch (InputMismatchException e) {
            System.out.println("Debe introducir números enteros válidos");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("La posición no existe en el array.");
        }

        sc.close();
    }
}

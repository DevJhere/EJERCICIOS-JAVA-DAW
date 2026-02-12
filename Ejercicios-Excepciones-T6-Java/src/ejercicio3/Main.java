package ejercicio3;

import java.util.Scanner;

public class Main {
    /*Crea un programa que pida al usuario que introduzca un número como texto y lo convierta a entero usando
    Integer.parseInt(). Usa try-catch para capturar la excepción NumberFormatException si el usuario introduce algo que
    no es un número válido. El programa debe seguir pidiendo un número hasta que el usuario introduzca uno válido.*/

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        boolean esValido = false;

        do {
                System.out.print("Introduce números enteros: ");
            try {

                int numero = Integer.parseInt(sc.nextLine());
                System.out.println("El número es: " + numero);

                esValido = true;

            }catch (NumberFormatException e){
                System.out.println("Debe introducir números válidos. Inténtelo de nuevo");
            }

        }while (!esValido);

        sc.close();
    }
}

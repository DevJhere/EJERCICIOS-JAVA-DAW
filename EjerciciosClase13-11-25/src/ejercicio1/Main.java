package ejercicio1;

import java.util.Scanner;

public class Main {
    /*1. Crea un programa de adivinación de números El programa genera de manera
    aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
    máximo de 7 intentos. Después de cada intento, indica si el número es mayor
    o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
    de intentos utilizado; si no, mostrar un aviso de que debe introducir
    nuevamente un número.

    0. Pedir datos por teclado
    1. Generar un número aleatorio entre 1-50
    2. 7 intento / repeticiones mientras no se acierta
        3. Indicar if número introducido es mayor que el elegido
    4. Mostrar aviso con número de intentos realizado
    */



    public static void main (String[] args){
        //Entrada de datos usuario
        Scanner scanner =  new Scanner(System.in);

        int numeroSistema = (int) (Math.random() * 50 + 1); //Genera un número aleatorio entre 0 - 50
        System.out.println("Número aleatorio: " + numeroSistema);
        int numeroUsuario;


        //Numero de intentos
        int intentos = 5;

        //Control de los valores
        boolean acierto = false;

        do {
            //Introducir numero
            System.out.println("Introducir numero: ");
            numeroUsuario = scanner.nextInt();
            intentos--;
            if (numeroSistema == numeroUsuario){
                System.out.println("Has acertado el numero");
                acierto = true;
                break;
            }else {
                if (numeroSistema < numeroUsuario){
                    System.out.println("El numero es grande");
                }else {
                    System.out.println("El numero es menor");
                }
            }

            System.out.println("Realizaste " + (5 - intentos) + " intentos");
        }while (intentos > 0);

        //Si no se cumple la cumple la condicion
        if (!acierto){
            System.out.println("Has perdido");
        }

    }
}

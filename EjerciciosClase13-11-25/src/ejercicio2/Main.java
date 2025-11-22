package ejercicio2;

import java.util.Scanner;

public class Main {
    /*Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
    las siguientes acciones:
    a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
    b. El programa debe seleccionar aleatoriamente una palabra del array y
    almacenarla como la palabra secreta.
    c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
    d. En cada intento, el usuario introduce una palabra por teclado.
    e. Tras cada intento, el programa debe indicar al usuario:
        i. Aciertos: cuántas letras tiene en la misma posición que la palabra
        secreta.
        ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
        posición diferente.
        iii. Fallos: cuántas letras no están presentes en la palabra secreta.
     El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.
    */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] palabras = {"datos","lucia", "cosas", "manta"};
        String palabraSecreta = palabras[(int) (Math.random()*4)];

        //Pedir palabra
        System.out.println("La palabra a adividar es " + palabraSecreta);

        //Intentos
        int intentos = 5;
        String palabraUsuario;
        int acierto = 0, numeroAprox = 0, numeroError=0;

        //Bucle
       do {
           do {
               System.out.print("Introduce la palabra: ");
               palabraUsuario = scanner.next();

               if(palabraUsuario.length() != 5){
                   System.out.println("Palabra no valida");
               }
           }while (palabraUsuario.length() != 5);

           System.out.println("Intento gastado");
           intentos--;

           if (palabraUsuario.equals(palabraSecreta)){
               System.out.println("Palabra Adivinida");
               acierto = 5;
               break;
           }

           //Analizar palabra
           for (int i = 0; i < palabraSecreta.length(); i++) {
               //En caso de que se acierte la palabra sales
               if (palabraUsuario.charAt(i) == palabraSecreta.charAt(i)){
                   acierto++;
               }else if (palabraSecreta.contains(String.valueOf(palabraUsuario.charAt(i)))){//Parseo a String
                   numeroAprox++;
               }else {
                   numeroError++;
               }
           }

           System.out.println("Numero aciertos: " +acierto);
           System.out.println("Numero errores: " +numeroError);
           System.out.println("Numero aprox: " +numeroAprox);

       }while (intentos > 0);

        System.out.println("Saliendo del juego....");
    }
}

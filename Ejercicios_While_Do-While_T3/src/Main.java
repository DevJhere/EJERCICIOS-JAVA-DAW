import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //Intanciamos Objeto Ejercicios
        Scanner teclado = new Scanner(System.in);
        Ejercicios operaciones = new Ejercicios(teclado);

        operaciones.ejercicio1();
        operaciones.ejercicio2();
        operaciones.ejercicio3();
        operaciones.ejercicio4();
        operaciones.ejercicio5();
        operaciones.ejercicio6();
        operaciones.ejercicio7();
        operaciones.ejercicio8();
        operaciones.ejercicio9();
        operaciones.ejercicio10();

        teclado.close();
    }
}

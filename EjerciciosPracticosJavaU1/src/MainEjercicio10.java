import java.util.Scanner;

public class MainEjercicio10 {
    //## Ejercicio 10: Conversión de temperaturas
    //
    //Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit. Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca temperatura en Cº: ");
        double grados = scanner.nextDouble();

        //Llamamos al metodo de la otra clase
        MetodosEjercicio10 conversorFahrenheit = new MetodosEjercicio10();
        conversorFahrenheit.conversor(grados);
    }
}

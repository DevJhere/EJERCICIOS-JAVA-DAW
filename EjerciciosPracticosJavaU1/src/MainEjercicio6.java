public class MainEjercicio6 {

    //## Ejercicio 6: Operaciones aritméticas simples
    //
    //Escribe un programa que declare dos variables numéricas, realice las operaciones básicas
    // (suma, resta, multiplicación y división) y muestre los resultados por consola.
    public static void main(String[] args){
        //Declaracion de Variables
        int numero1;
        int numero2;


        //Inicializamos las variables
        numero1 = 8;
        numero2 = 0;


        //Operaciones
        //Suma
        int resultadoSuma = numero1 + numero2;

        //Resta
        int resultadoResta = numero1 - numero2;

        //Multiplicación
        int resultadoMulti = numero1 * numero2;


        //Salida por Consola
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 1: " + numero2);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMulti);

        //División - Controlamos en caso de ser Divisor 0
        if(numero2 != 0){
            int resultadoDivision = numero1/numero2;
            System.out.println("Division: " + resultadoDivision);
        }else {
            System.out.println("No se puede dividir entre 0");
        }
    }
}

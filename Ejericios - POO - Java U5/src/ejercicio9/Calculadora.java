package ejercicio9;

public class Calculadora {

    //Métodos estáticos
    public static int sumar(int a, int b){
        return a+b;
    }

    public static int restar(int a, int b){
        return a-b;
    }

    public static int multiplicar(int a, int b){
        return a*b;
    }

    public static double dividir(int a, int b) {
        if (b != 0){
            return (double) a /b;
        }
        System.out.println("No se puede dividir por 0");
        return 0;
    }

    public static double potencia(int a, int b) {
        return Math.pow(a, b);
    }
}

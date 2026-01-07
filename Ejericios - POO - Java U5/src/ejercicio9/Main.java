package ejercicio9;

public class Main {
    /*
    * Crea una clase Calculadora con métodos estáticos para sumar, restar, multiplicar y dividir dos números.
    * Añade también un método estático potencia(base, exponente). Usa estos métodos sin crear objetos de la clase.*/
    public static void main(String[] args) {

        //Mostramos las operaciones
        System.out.println("Suma: 10 + 5 = " + Calculadora.sumar(10, 5));
        System.out.println("Resta: 10 - 5 = " + Calculadora.restar(10, 5));
        System.out.println("Multiplicación: 10 * 5 = " + Calculadora.multiplicar(10, 5));
        System.out.println("División: 10 / 5 = " + Calculadora.dividir(10, 0));
        System.out.println("Potencia: 2 ^ 3 = " + Calculadora.potencia(2, 3));
    }

}

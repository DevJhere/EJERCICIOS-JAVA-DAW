public class MainEjercicio8 {
    //## Ejercicio 8: Calculadora de área de un rectángulo
    //
    //Desarrolla un programa que calcule el área de un rectángulo. Declara variables para la base y la altura, y muestra el resultado del cálculo.
    public static void main(){

        //Llamamos al método calcularAreaRectangulo;
        calcularAreaRectagulo(4.0, 3.2);
    }

    public static void calcularAreaRectagulo(double base, double altura ){

        System.out.println("Base del Rectángulo es: " + base);
        System.out.println("Altura del Rectángulo es: " + altura);

        double resultado = base * altura;
        System.out.println("El area del rectángulo dado es: " + resultado);
    }
}

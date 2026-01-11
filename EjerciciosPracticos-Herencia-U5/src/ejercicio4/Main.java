package ejercicio4;

public class Main {
    /*
    * Crea una clase Figura con un método calcularArea(). Crea dos clases hijas: Circulo (con atributo radio) y Cuadrado
    *(con atributo lado). Implementa el método calcularArea() en cada clase hija con la fórmula correspondiente.
    *Crea objetos de cada tipo y muestra sus áreas.
    * */

    public static void main(String[] args) {

        //Instanciamos Figuras - Circulo y Cuadrado
        Circulo circulo = new Circulo("Circulo", 5);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 4);

        //Mostramos resultados
        System.out.println("-------- Área de Figuras -------");

        circulo.mostrarInformacion();
        circulo.calcularArea();

        System.out.println();

        cuadrado.calcularArea();
        cuadrado.mostrarInformacion();
    }
}

package ejercicio3;

public class Main {
    /*
    * Crea una clase Rectángulo con atributos base y altura. Añade métodos calcularArea() y calcularPerimetro()
    * que devuelvan el área y el perímetro respectivamente. Crea un objeto y muestra los resultados.
    * */

    public static void main(String[] args) {

        //Creamos objeto rectángulo
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);

        System.out.println("Rectángulo con base " + rectangulo.getBase() + " y altura " + rectangulo.getAltura());

        //Área y Perimetro
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
    }
}

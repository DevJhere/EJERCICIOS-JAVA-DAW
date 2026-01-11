package ejercicio4;

public class Cuadrado extends Figura{
    //Atributos propios
    private double lado;

    //Constructor
    public Cuadrado() {
        super();
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    //Getters and Setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //Funcionalidades - Métodos
    @Override
    public void calcularArea() {
        double areaCuadrado = this.lado * this.lado;
        System.out.printf("Area: %.2f\n", areaCuadrado);
    }

    public void mostrarInformacion(){
        System.out.println(getNombre() + " con lado: " + this.lado);
    }
}

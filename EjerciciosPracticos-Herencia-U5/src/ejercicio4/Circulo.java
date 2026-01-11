package ejercicio4;

public class Circulo extends Figura{
    //Atributos Propios
    private double radio;

    //Constructor
    public Circulo() {
        super();
    }

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    //Getters and Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Funcionalidades - Métodos
    public void calcularArea(){
        double pi = 3.1415926535;
        double areaCirculo = pi * (this.radio*this.radio);
        System.out.printf("Area: %.2f\n",  areaCirculo);
    }

    public void mostrarInformacion(){
        System.out.println(getNombre() + " con radio: " + this.radio);
    }
}

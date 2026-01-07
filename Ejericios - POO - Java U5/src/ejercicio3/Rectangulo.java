package ejercicio3;

public class Rectangulo {

    //Atributos
    private double base;
    private double altura;

    //Sobrecarga
    public Rectangulo () {

    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodos Auxiliares
    public double calcularArea () {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return (2*this.altura) + (2*this.base);
    }
}

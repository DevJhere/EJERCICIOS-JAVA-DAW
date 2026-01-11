package ejercicio2;

public class Coche extends Vehiculo{
    //Atributos no comunes
    private int numPuertas;

    //Constructor
    public Coche(String marca, String modelo, int numPuertas) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    public Coche() {
    }

    //Getters and Setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    //Funcionalidades
    public void mostrarInformacion(){
        System.out.println("Coche: " + getMarca() + " " + getModelo() + ", " + this.numPuertas + " puertas");
    }
}

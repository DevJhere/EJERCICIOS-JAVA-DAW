package ejercicio1.Model;

public class Pato extends Animal implements Nadador, Volador{

    //Constructor
    public Pato(){}

    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        System.out.println(nombre + " come maíz y semillas.");
    }

    @Override
    public void nadador() {
        System.out.println("🦆 " + nombre + " está nadando en el lago.");
    }

    @Override
    public void volador() {
        System.out.println("🦆 " + nombre + " levanta el vuelo torpemente.");
    }
}

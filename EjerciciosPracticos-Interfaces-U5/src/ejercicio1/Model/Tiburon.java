package ejercicio1.Model;

public class Tiburon extends Animal implements Nadador, Cazador {
    //Constructor
    public Tiburon(String nombre) {
        super(nombre);
    }

    public Tiburon() {
    }

    //Funcionalidades
    @Override
    public void comer() {
        System.out.println(nombre + " devora peces.");
    }

    @Override
    public void cazador() {
        System.out.println("🦈 " + nombre + " nada a gran velocidad en el océano.");
    }

    @Override
    public void nadador() {
        System.out.println("🦈 " + nombre + " acecha a su presa...");
    }
}

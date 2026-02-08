package ejercicio1.Model;

public class Murcielago extends Animal implements Cazador, Volador {

    //Constructor
    public Murcielago(String nombre) {
        super(nombre);
    }

    public Murcielago() {
    }

    //Funcionalidades
    @Override
    public void comer() {
        System.out.println("\uD83E\uDD87 Come frutas o insectos");
    }

    @Override
    public void cazador() {
        System.out.println("\uD83E\uDD87 Vuela en la oscuridad");
    }

    @Override
    public void volador() {
        System.out.println("\uD83E\uDD87 Usa ecolocalización");
    }
}

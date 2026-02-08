package model;

import java.util.Random;

public class Soldado extends Personaje implements IAtacante, ICurador{

    //Atributo
    private int recargasDisponibles;

    //Constructor
    public Soldado() {
    }

    public Soldado(String nombre, String rango, int vida) {
        super(nombre, rango, vida);
        this.recargasDisponibles = 2;
    }

    //Funcionalidades
    public void recargarMago(Mago mago) {
        if (recargasDisponibles > 0){
            System.out.println(this.nombre + " recarga hechizos magicos a " + mago);
            mago.recuperarHechizos();
            recargasDisponibles--;
            System.out.println("Recargas restantes: " + this.recargasDisponibles);
        }else {
            System.out.println(this.nombre + " no te quedan recargas disponibles");
        }
    }

    //Interfaz Atacante
    @Override
    public void atacarPersonaje(Personaje objetivo) throws JuegoExcepcion {
        //Validación con JuegoExcepcion

        //Soldado no se puede atacar así mismo
        if (this == objetivo){
            throw new JuegoExcepcion("¡No te puedes atacar a tí mismo!");
        }
        //Si ya está muerto no se le puede atacar
        if (!objetivo.isVivo()){
            throw new JuegoExcepcion("El objetivo ya está muerto.No se le puede atacar.");
        }

        //Definimos el máximo y mínimo de daño de ataque
        int max = 20;
        int min = 10;

        //El daño de ataque es aleatorio, lo generamos con Math.random
        int soldadoAtaque = (int) (Math.random() * (max - min + 1) + min);
        int danioFinal = Math.max(1, soldadoAtaque);

        objetivo.recibirDanio(danioFinal);
    }

    //Interfaz Curador
    @Override
    public void curarPersonaje(Personaje objetivo) throws JuegoExcepcion {
        //Soldado cura 25% a un objetivo, pero reduce 10% de su vida
        int costeVida = (int) (this.vida * 0.10);

        //Validación
        if (getVida() <= costeVida){
            throw new JuegoExcepcion("No tienes salud suficiente para poder curar.");
        }

        //Soldado pierde vida
       this.recibirDanio(costeVida); //Cuando recibe daño no va a bajar de 0

        //Soldado cura 25% a un objetivo
        int cantidadCura = (int) (objetivo.getVida() * 0.25);

        objetivo.recibirCuraMaxima(cantidadCura);

        System.out.println(objetivo.getNombre() + " recupera salud (Tope: " + objetivo.getVida() + "/" + objetivo.getVidaMaxima() + ")");
    }

}

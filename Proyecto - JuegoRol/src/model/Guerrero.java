package model;

import java.util.ArrayList;

public class Guerrero extends Personaje implements IAtacante{
    //Atributos
    private int potenciador;

    //Constructor
    public Guerrero(){}

    public Guerrero(String nombre, String rango, int vida, int potenciador) {
        super(nombre, rango, vida);
        if (potenciador < 0 || potenciador > 2){
            this.potenciador = 2;
        }else {
            this.potenciador = potenciador;
        }
    }

    public void ataqueMortal(ArrayList<Personaje> enemigos){
        //Validación de potenciador
        if (this.potenciador <=0){
            System.out.println("No tienes potenciadores suficientes para atacar");
            return;
        }

        System.out.println(this.nombre + " ejecuta un ataque mortal");
        this.potenciador--;

        for (Personaje enemigo:enemigos){
            if (enemigo.isVivo()){
                //Hace 50% de daño a TODOS
                int danio50 = (int) (enemigo.getVida() * 0.50);
                enemigo.recibirDanio(danio50);
            }
        }

        System.out.println("Te quedan " + this.potenciador + " potenciador/es");
    }

    @Override
    public void atacarPersonaje(Personaje objetivo) throws JuegoExcepcion {
        //Validación
        if ( this == objetivo){
            throw new JuegoExcepcion("No te puedes atacar a tí mismo");
        }

        if (!objetivo.isVivo()){
            throw new JuegoExcepcion("El objetivo ya está muerto. No se le puede atacar.");
        }

        //Daño 50%
        int danio50 = (int) (objetivo.getVida() * 0.50);


        System.out.println(this.nombre + " ataca a " + objetivo.getNombre() + " vida: " + objetivo.getVida());
        int danioFinal = Math.max(1, danio50);
        objetivo.recibirDanio(danioFinal);
    }
}

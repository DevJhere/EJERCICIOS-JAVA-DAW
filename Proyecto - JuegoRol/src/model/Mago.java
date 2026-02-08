package model;

import java.util.ArrayList;

public class Mago extends Personaje implements ICurador{
    //Atributes
    private String especialidadMagia;
    private int numeroHechizos;

    //Constructor
    public Mago() {
    }

    public Mago(String nombre, String rango, int vida, String especialidadMagia) {
        super(nombre, rango, vida);
        //Validación tipo Magia
        if (especialidadMagia.equalsIgnoreCase("negra") || especialidadMagia.equalsIgnoreCase("blanca")){
            this.especialidadMagia = especialidadMagia;
        }else {
            this.especialidadMagia = "blanca";
        }

        this.numeroHechizos = 4;
    }


    //Funcionalidades
    @Override
    public void curarPersonaje(Personaje objetivo) throws JuegoExcepcion {
        //Validaciones
        if (this == objetivo) {
            throw new JuegoExcepcion("No puedes curarte a ti mismo (reglas del juego).");
        }
        if (!objetivo.isVivo()) {
            throw new JuegoExcepcion("No puedes revivir a los muertos.");
        }

        //Cura 100%
        int cura100 = objetivo.vidaMaxima - objetivo.vida;

        objetivo.recibirCuraMaxima(cura100);

        System.out.println(this.nombre + " restaura completamente la salud de " + objetivo.getNombre());

    }

    //Recarga de hechizos
    public void recuperarHechizos(){
        this.numeroHechizos = 4;
        System.out.println(this.nombre + " ha recargado sus hechizos");
    }


    //Ataque a enemigos grupal
    public void lanzarHechizoAtaque(ArrayList<Personaje> enemigos){
        //Validación
        if (this.numeroHechizos <= 0){
            System.out.println("No te quedan hechizos, tienes que esperar a que un Soldado te ayude o recargar hechizos");
            return;
        }

        System.out.println(this.nombre + " lanza un hechizo sobre el enemigo");
        this.numeroHechizos--;

        for (Personaje enemigo:enemigos){
            //Validación si enemigo está vivo quita el 25%
            if (enemigo.isVivo()){
                int danio25 = (int) (enemigo.getVida() * 0.25);
                enemigo.recibirDanio(danio25);
            }
        }
    }

    //Curación de aliados
    public void lanzarConjuroCuracion(ArrayList<Personaje> aliados){
        //Validación si está vivo aliado
        if (this.numeroHechizos <= 0){
            System.out.println(this.nombre + " no tiene magia suficiente para curar a tus aliados");
            return;
        }

        System.out.println(this.nombre + " realiza un conjuro de sanación a sus aliados.");
        this.numeroHechizos--;

        for (Personaje aliado:aliados){
            //Si esta vivo el aliado
            if (aliado.isVivo()){
               int curaTotal = aliado.vidaMaxima - aliado.vida;
               aliado.recibirCuraMaxima(curaTotal);
                System.out.println(aliado.getNombre() + " recupera " + curaTotal + " de vida");
            }

        }
    }
}

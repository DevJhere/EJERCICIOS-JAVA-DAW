package model;

import java.util.ArrayList;

public class Arquero extends Personaje implements IAtacante{
    //Atributos
    private int numeroFlechas, nivelFuerza;

    //Constructor
    public Arquero() {
    }

    public Arquero(String nombre, String rango, int vida, int numeroFlechas, int nivelFuerza) {
        super(nombre, rango, vida);
        if (numeroFlechas < 0 || numeroFlechas > 4){
            //Se asignan por defecto 4 flechas como máximo si es superior a 4 o menor a 0
            this.numeroFlechas = 4;
        }else {
            this.numeroFlechas = numeroFlechas;
        }

        this.nivelFuerza = nivelFuerza;
    }


    //Funcionalidades
    public void ataqueGrupal(ArrayList<Personaje> enemigos) throws JuegoExcepcion{
        //Validamos numero de flechas
        if (this.numeroFlechas <= 0){
            throw new JuegoExcepcion("No te quedan flechas para realizar este ataque.");
        }

        System.out.println(this.nombre + " realiza ataque grupal");

        //Gasta munición
        this.numeroFlechas--;

        //Logica - Enemigos Aleatorios
        ArrayList<Personaje> vivos =  new ArrayList<>(); //Lista para enemigos vivos

        //Filtramos los vivos
        for (Personaje enemigo: enemigos){
            if (enemigo.isVivo()){
                //Asignamos los vivos a la lista de vivos
                vivos.add(enemigo);
            }
        }

        //Ataca como mínimo a 3 personajes
        int objetivos = Math.min(3, vivos.size());


        //Recorremos los objetivos para atacar
        for (int i = 0; i < objetivos; i++) {
            //Creamos un índice Aleatorio de tamaño objetivo
            int ataqueAleatorio = (int) (Math.random() * vivos.size());

            //Marcamos el personaje que va a ser atacado
            Personaje victima = vivos.get(ataqueAleatorio);

            //Ataque 30%
            int danio30 = (int) (victima.getVida() * 0.30);
            int danioFinal = Math.max(1, danio30);
            victima.recibirDanio(danioFinal);

            //Como el personaje ya ha sido atacado se elimina de la lista para que no se le ataque otra vez
            vivos.remove(ataqueAleatorio);
        }

        this.numeroFlechas--;
    }

    @Override
    public void atacarPersonaje(Personaje objetivo) throws JuegoExcepcion {
        //Validaciones
        if ( this == objetivo){
            throw new JuegoExcepcion("No te puedes atacar a tí mismo");
        }

        if (!objetivo.isVivo()){
            throw new JuegoExcepcion("El objetivo ya está muerto. No se le puede atacar.");
        }

        //Validación Flechas
        if ( this.numeroFlechas <= 0){
            throw new JuegoExcepcion("¡No te quedan flechas Arquero! No puedes atacar");
        }

        //Daño de ataque 25%
        int danio20 = (int) (objetivo.getVida() * 0.20);

        //Gasta Munición Flechas
        this.numeroFlechas--;

        System.out.println(this.nombre + " ataca a " + objetivo.getNombre() + " su vida actual es: " + objetivo.getVida());
        System.out.println(this.nombre + " dispara una flecha le quedan: " + this.numeroFlechas + " flechas");
        objetivo.recibirDanio(danio20);
    }
}

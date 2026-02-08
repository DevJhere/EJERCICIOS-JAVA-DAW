package model;

import java.util.ArrayList;

public class Clerigo extends Personaje implements ICurador{

    //Constructor
    public Clerigo() {
    }

    public Clerigo(String nombre, String rango, int vida) {
        super(nombre, rango, vida);
    }

    //Funcionalidades
    public void mostrarInfoEquipo(ArrayList<Personaje> miEquipo){
        System.out.println(this.nombre + " revisa estado de sus aliados");

        //Mostramos información de mi equipo
        miEquipo.forEach(Personaje::mostrarInformacion);

        System.out.println("===========================");
    }

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
        int cura100 = (int) (objetivo.getVida() * 1.0);
        objetivo.setVida(objetivo.getVida() + cura100);

        System.out.println(this.nombre + " lanza hechizo de curación sobre: " + objetivo.getNombre());
        System.out.println(objetivo.getNombre() + " recupera " + objetivo.getVida() + " puntos de vida");

    }

}

package viewer;

import controller.GestionJuego;
import model.*;

public class Main {
    public static void main(String[] args) throws JuegoExcepcion {

        //Instanciamos Personaje
        GestionJuego juego = new GestionJuego();
        juego.iniciar();

    }
}

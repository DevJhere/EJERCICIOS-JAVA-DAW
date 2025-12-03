package ejercicios_arrays4;

import java.util.Scanner;

public class Main {
    /*Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
    sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
    Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
    que un mismo equipo no puede jugar más de un partido */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        SorteoMundial sorteo = new SorteoMundial(teclado);

        sorteo.realizarSorteo();

        teclado.close();
    }
}

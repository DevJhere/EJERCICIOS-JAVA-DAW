package ejercicios_arrays4;

import java.util.Scanner;

public class SorteoMundial {

    private Scanner teclado;

    //Constructor Entrada de datos
    public SorteoMundial(Scanner teclado){
        this.teclado = teclado;
    }

    /*
    * MÉTODO PRINCIPAL
    */
    public void realizarSorteo(){
        //Definimos el array bombos
        String[] bombo1 = new String[5];
        String[] bombo2 = new String[5];

        //Pedimos nombre de Equipos para rellenar los bombos 1 y 2
        pedirEquipos(bombo1, "BOMBO 1");
        pedirEquipos(bombo2, "BOMBO 2");

        //Mezclamos bombos
        mezclarEquipos(bombo2);

        //Mostramos resultados
        mostrarPartidos(bombo1, bombo2);
    }


    /*
    * MÉTODOS AUXILIARES
    */

    //Función para solicitar los equipos de los bombos 1 y 2
    public void pedirEquipos(String[] bombo, String titulo){
        System.out.println("---Registro de " + titulo + " ----");

        //Iteramos el array bombo para registrar los equipos
        for (int i = 0; i < bombo.length; i++) {
            //Ingresamos los equipos por teclado
            System.out.printf("Introduce nombre del equipo %d: ", (i+1));
            bombo[i] = teclado.nextLine();
        }
    }

    //Método para mezclar - Debemos repartir aleatoriamente los elementos de cada array
    public void mezclarEquipos(String[] equipos){
        for (int i = 0; i < equipos.length; i++) {
            //Mezclamos aleatoriamente una posición del los equipos definidos
            int posicionAleatoria = (int) (Math.random() * equipos.length);

            //Intercambio temporal
            String temporal = equipos[i];

            //La posición aleatoria se almacena nuevamente en la posición equipos[posicionAleatoria]
            equipos[i] = equipos[posicionAleatoria];

            //Guardamos el equipo en la posición aleatoria
            equipos[posicionAleatoria] = temporal;
        }
    }

    //Imprimir los equipos asignados
    public void mostrarPartidos(String[] equipo1, String[] equipo2){
        System.out.println("--- RESULTADOS DEL SORTEO ---");
        System.out.println("-----------------------------------");

        for (int i = 0; i < equipo1.length; i++) {
            System.out.printf("Partido %d: %s VS %s%n", (i+1), equipo1[i], equipo2[i]);
        }
    }
}

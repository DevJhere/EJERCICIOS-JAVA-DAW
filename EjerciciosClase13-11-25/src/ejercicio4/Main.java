package ejercicio4;
import java.util.Scanner;

public class Main {
    /*Crea un programa para jugar una partida virtual de dardos entre dos
        jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
        partiendo desde 301.
        Reglas:
        • Nada más empezar pide el nombre de cada jugador
        • Cada jugador comienza con 301 puntos.
        • En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
        aleatorio entre 0 y 60 (simulando puntuación en dardos).
        • La puntuación del turno es la suma de los 3 dardos.
        • Resta la puntuación del turno al total de puntos del jugador.
        • Si la puntuación restante es menor que 0, se considera que el jugador "se
        pasa" y su total no cambia ese turno.
        • El primer jugador que llegue exactamente a 0 gana la partida.
        • Después de cada turno, muestra las puntuaciones actuales y quién va
        ganando (el que tiene menos puntos).
        • Al finalizar, muestra el ganador y cuántos turnos tomó la partida.*/

    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);

        //Puntuación por Jugador
        int ptsPlayer1 = 301;
        int ptsPlayer2 = 301;


        System.out.println("---Juego de dardos 301---");
        //1.Introducir nombre de player1 y player 2
        System.out.print("Introducir nombre Jugador1: ");
        String player1 = scanner.nextLine().toUpperCase(); //Controlamos Minúsculas

        System.out.print("Introducir nombre Jugador2: ");
        String player2 = scanner.nextLine().toUpperCase();


        //Bucle principal del Juego
        int turnos = 0;


        while (true){
            //Turno Player1
            int[] dardos = lanzarTurno();
            int sumaDardos = dardos[0] + dardos[1] + dardos[2];
            System.out.printf("%s lanza -> Dardo1: %2d | Dardo2: %2d | Dardo3: %2d | Total: %3d%n", player1, dardos[0], dardos[1], dardos[2], sumaDardos);

            int nuevoTurno1= aplicarPuntuacion(ptsPlayer1, sumaDardos);
            //Si ptsPlayer1 == 0 gana la la partida
            if (nuevoTurno1 == ptsPlayer1){
                System.out.println("Se pasa");
            }else {
              ptsPlayer1 = nuevoTurno1;
            }
            turnos++;
            mostrarEstado(player1, ptsPlayer1, player2, ptsPlayer2);

            if (ptsPlayer1 == 0){
                System.out.printf("%n%s gana la partida!%n", player1);
                break;
            }

            //Turno Player2
            dardos = lanzarTurno();
            sumaDardos = dardos[0] + dardos[1] + dardos[2];
            System.out.printf("%s lanza -> Dardo1: %2d | Dardo2: %2d | Dardo3: %2d | Total: %3d%n", player2, dardos[0], dardos[1], dardos[2], sumaDardos);


            int nuevoTurno2= aplicarPuntuacion(ptsPlayer2, sumaDardos);

            //Si ptsPlayer1 == 0 gana la la partida
            if (nuevoTurno2 == ptsPlayer2){
                System.out.println("Se pasa.");
            }else {
                ptsPlayer2 = nuevoTurno2;
            }
            turnos++;
            mostrarEstado(player1, ptsPlayer1, player2, ptsPlayer2);

            if (ptsPlayer2 == 0){
                System.out.printf("%n%s gana la partida!%n", player2);
                break;
            }
        }

        System.out.printf("La partida se realizó en %d turnos.",turnos);

        scanner.close();
    }

    //2. Método para generar un número random entre 0-60
    public static int[] lanzarTurno() {
        //Creamos el número aleatorio
        int dardoAleatorio1 = (int) (Math.random() * 61);
        int dardoAleatorio2 = (int) (Math.random() * 61);
        int dardoAleatorio3 = (int) (Math.random() * 61);
        return new int[]{dardoAleatorio1, dardoAleatorio2, dardoAleatorio3};
    }


        //3. Aplica la puntuación del turno siguiendo la regla "se pasa".
    //Devuelve el total nuevo (si se pasa, devuelve totalAntes sin cambios).
    public static int aplicarPuntuacion(int totalAntes, int puntuacionTurno){
       int resto = totalAntes - puntuacionTurno;
       if (resto<0){
           return totalAntes;
       }else {
           return resto;
       }
    }

    //4. Mostrar puntuación actual de ambos jugadores y quien va ganando
    public static void mostrarEstado(String nombre1, int pts1, String nombre2, int pts2){
        System.out.println("-----Estado de la partida-----");
        System.out.printf("%s: %d puntos%n", nombre1, pts1);
        System.out.printf("%s: %d puntos%n", nombre2, pts2);

        //Controlamos quien va ganando
        if (pts1 < pts2){
            System.out.printf("Va ganando: %s%n", nombre1);
        }else if (pts2 < pts1){
            System.out.printf("Va ganando: %s%n", nombre2);
        }else {
            System.out.printf("Jugador1: %s y Jugador2: %s vais empatados.", nombre1, nombre2);
        }

        System.out.println("---------------------------------------");
    }
}

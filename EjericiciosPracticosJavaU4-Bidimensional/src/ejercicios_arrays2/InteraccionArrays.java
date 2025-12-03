package ejercicios_arrays2;

import java.util.Arrays;

public class InteraccionArrays {


    // METODOS AUXILIARES

    // Rellenamos Aleatoriamente el array. 1- 20
    public void rellenarAleatorio(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 )+ 1;
        }
    }

    // Mover a la Izquierda
    public void moverIzquierda(int[] array){
        int primero = array[0];
        for (int i = 0; i < array.length -1 ; i++) {
            array[i] = array[i +1];
        }
        array[array.length - 1] = primero;
    }

    //Mover a la Derecha
    public void moverDerecha(int[] array){
        int ultimo = array[array.length -1];

        for (int i = array.length -1; i > 0 ; i--) {
            array[i] = array[i-1];
        }
        array[0] = ultimo;
    }

    //Invertir el array
    public void invertirArray(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            int indiceContrario = array.length -1 - i;
            array[i] = array[indiceContrario];
            array[indiceContrario] = temp;
        }
    }
}

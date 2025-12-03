package ejercicios_arrays1;
public class Main {
    /*1. Crea un programa que permita sumar arrays multidimensionales. Para ello
    siguiente estos pasos:

    a. Pide al usuario el tamaño de las matrices
    b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y
    50
    c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
    de las celdas de las generadas en el punto anterior
    d. Mostrar cada una de las matrices donde cada una tiene un título diferente
    para poder identificarlas */

    public static void main(String[] args) {

        SumaArraysBidimensionales arraySuma = new SumaArraysBidimensionales();

        arraySuma.generarMatrizBidimensional();

    }
}

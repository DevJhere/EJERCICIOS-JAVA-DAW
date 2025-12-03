package ejercicios_arrays1;
import java.util.Scanner;

public class SumaArraysBidimensionales {

    //1. Pide al usuario el tamaño de las matrices y Se crearán automáticamente dos matrices con números aleatorios
    // entre 0 y 50
    public void generarMatrizBidimensional(){
        //Iniciamos variable para pedir datos por teclado
        Scanner teclado = new Scanner(System.in);

        //A. Usuario define tamaño de Matriz -> Filas y Columnas
        System.out.print("Introduce tamaño de las filas de la matriz A: ");
        int filasMatriz = teclado.nextInt();

        System.out.print("Introduce tamaño de las columnas de la matriz A: ");
        int columnasMatriz = teclado.nextInt();

        System.out.println("---------------------------------------");


        //Definimos matrices A y B
        int[][] matrizA = new int[filasMatriz][columnasMatriz];
        int[][] matrizB = new int[filasMatriz][columnasMatriz];

        //C. Rellenamos matriz A y B con números aleatorios entre 0 y 50
        rellenarAleatorio(matrizA);
        rellenarAleatorio(matrizB);

        //D. Imprimimos resultados
        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);
        System.out.println();

        System.out.println("Matriz B");
        imprimirMatriz(matrizB);
        System.out.println();

        // Resultado suma de matrices
        int[][] matrizC = sumaMatrizBidimensional(matrizA,matrizB);

        System.out.println("--- Matriz Suma (A+B) ---");
        imprimirMatriz(matrizC);
        teclado.close();
    }

    //2. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
    //de las celdas de las generadas en el punto anterior
    public int[][] sumaMatrizBidimensional(int[][] matrizA, int[][] matrizB){
        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        //Creamos la siguiente matriz C para realizar la suma
        int[][] sumaMatrices = new int[filas][columnas];

        //Rellenamos matriz y sumamos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaMatrices[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return sumaMatrices;
    }

    //Metodos Auxiliares - Rellenar Matrices e Imprimir resultados
    public void rellenarAleatorio (int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 51);
            }
        }
    }

    public void imprimirMatriz(int[][] matriz){
        for (int[] elemento : matriz){
            for (int item : elemento){
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}

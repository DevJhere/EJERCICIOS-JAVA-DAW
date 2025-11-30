import java.util.Arrays;
import java.util.Scanner;

public class Operaciones {

    private Scanner teclado;

    public Operaciones (Scanner teclado){
        this.teclado =  teclado;
    }

    //Ejercicio 1: Crear y mostrar una matriz
    public void ejercicio1 (){
        //Crea un programa que defina una matriz de 3x3 con números del 1 al 9. Usa bucles for anidados para mostrar la matriz en formato de tabla.
        System.out.println(" Matriz 3x3 ");

        //Declaramos el array bidimensional
        int[][] matrizBidimensional = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Loop externo controlamos las FILAS
        for (int[] ints : matrizBidimensional) {
            // Loop interno controlamos las columnas
            for (int anInt : ints) {
                //Mostramos los números y añadimos un espacio dentro de la FILA
                System.out.print(anInt + " ");
            }
            //\n para pasar a la siguiente fila
            System.out.println();
        }
    }

    //Ejercicio 2: Rellenar matriz con input del usuario
    public void ejercicio2 () {
        //Desarrolla un programa que cree una matriz de 2x4. Usa bucles for anidados para pedir al usuario que introduzca
        // 8 números y los almacene en la matriz. Al final, muestra la matriz completa.

        System.out.println(" Matriz 2x4 de Usuario");

        int[][] matriz = new int[2][4];
        //Recorremos la matriz para ir asignando valores al array
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce el valor para la posición [%d][%d]: ",i,j);
                matriz[i][j] = teclado.nextInt();

            }
        }

        //Mostramos la matriz resultante
        System.out.println("--- Matriz Resultante ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

    }

    //Ejercicio 3: Sumar todos los elementos de una matriz
    public void ejercicio3 () {
        //Escribe un programa que defina una matriz de 4x4 con números. Usa bucles for anidados para recorrer la matriz
        // y calcular la suma de todos sus elementos. Muestra el resultado.

        //Matriz definida
        int[][] matriz = {
                {2,4,6,8},
                {1,3,5,7},
                {9,11,13,15},
                {10,12,14,16}
        };

        //Variable sumatorio
        int suma = 0;

        System.out.println("Matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                suma += matriz[i][j];
            }
            System.out.println();
        }
//        for (int[] elemento : matriz){
//            for (int item : elemento){
//                System.out.print(item + " ");
//                suma += item;
//            }
//
//            System.out.println();
//        }

        System.out.println();
        System.out.println("Suma total de elementos: " + suma);

    }

    //Ejercicio 4: Buscar un elemento en una matriz
    public void ejercicio4 () {
        //Crea un programa con una matriz de 3x5 con números. Pide al usuario un número a buscar y usa bucles for
        // anidados para encontrarlo. Si existe, muestra su posición (fila y columna). Si no existe, indica que no se encontró.

        //Definimos matrix 3x5
        int[][] matriz = {
                {12,45,23,67,89},
                {34,56,78,90,11},
                {22,33,44,12,66}
        };

        //Mostramos la matriz definida
        System.out.println("Matriz: ");
        for (int[] elemento : matriz){
            for (int item: elemento){
                System.out.print(item + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Usuario ingresa número a buscar dentro del array
        System.out.print("Introduce el numero a buscar: ");
        int numeroBuscar = teclado.nextInt();

        //Control de bandera
        boolean encontrado = false;

        //Buscar número ingresado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroBuscar){
                    System.out.printf("El número %d se encuentra en la posición [%d][%d]%n", numeroBuscar,i,j);
                    encontrado =  true;
                }
            }
        }

        if (!encontrado){
            System.out.printf("El número %d no se ha encotrado en la matriz", numeroBuscar);
        }
    }

    //Ejercicio 5: Calcular el promedio de cada fila
    public void ejercicio5 () {
        //Desarrolla un programa que defina una matriz de 4x3 con números decimales. Usa bucles for anidados para
        // calcular y mostrar el promedio de cada fila de la matriz.

        //Definimos matriz 4x3
        double[][] matriz = {
                {5.5,7.2,6.8},
                {8.1,9.3,7.5},
                {4.2,5.6,6.1},
                {7.8,8.9,9.2}
        };

        //Mostramos la matriz definida
        System.out.println("Matriz: ");
        for (double[] elemento : matriz){
            for (double item: elemento){
                System.out.print(item + " ");
            }
            System.out.println();
        }

        System.out.println();


        //Calcular promedio por fila
        for (int i = 0; i < matriz.length; i++) {
            //Contador de números por fila para que se reinicie cada vez que empiece una FILA nueva
            double contadorFilas = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                contadorFilas += matriz[i][j];
            }
            //Calculamos promedio
            double promedio = contadorFilas / matriz[i].length;

            //Mostramos resultado por fila
            System.out.printf("Promedio de fila %d: %.2f%n", i, promedio);
        }
    }

    //Ejercicio 6: Encontrar el mayor elemento de cada columna
    public void ejercicio6 () {
        //Escribe un programa que cree una matriz de 3x4 con números. Usa bucles for para encontrar el número mayor de
        // cada columna y muestra los resultados.

        // Matriz 3x4
        int[][] matriz = {
                {15, 23, 8, 19},
                {42, 17, 31, 25},
                {28, 35, 12, 40}
        };

        //Mostramos la matriz definida
        //Mostramos la matriz definida
        System.out.println("Matriz: ");
        for (int[] elemento : matriz){
                for (int item: elemento){
                System.out.print(item + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Controlamos las columnas que hay
        int totalColumnas = matriz[0].length;
        int totalFilas = matriz.length;

        for (int j = 0; j < totalColumnas; j++) {

            //Inicializamos la columna con el valor j
            int mayor = matriz[0][j]; // Asumimos que se empieza desde la columna j, y siempre va a ser [0][0]

            //Recorremos las filas de Arriba-Abajo
            for (int i = 0; i < totalFilas; i++) {

                if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            }

            System.out.println("Mayor de columna " + j + ": " + mayor);
        }
    }

    //Ejercicio 7: Transponer una matriz
    public void ejercicio7 () {
        //Crea un programa que defina una matriz de 3x4. Usa bucles for anidados para crear una nueva matriz transpuesta
        // (4x3) donde las filas se convierten en columnas. Muestra ambas matrices.

        //Definimos la matriz original (3x4)
        int[][] original = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        //Iniciamos una nueva matriz 4x3 (Matriz transpuesta)
        int[][] transpuesta = new int[4][3];

        //Mostramos la matriz definida
        System.out.println("Matriz original (3x4): ");
        for (int[] elemento : original){
            for (int item: elemento){
                System.out.print(item + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {

                //Intercambiamos las posiciones [j][i] = [i][j] -> Transpuesta
                transpuesta[j][i] = original[i][j];
            }
        }

        System.out.println("Matriz transpuesta (4x3): ");
        //Imprimimos nueva matriz
        for (int[] elemento : transpuesta) {
            for (int item : elemento) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    //Ejercicio 8: Contar números pares e impares en una matriz
    public void ejercicio8 () {
        //Desarrolla un programa que cree una matriz de 4x5 con números enteros. Usa bucles for anidados para contar
        // cuántos números pares e impares hay en toda la matriz. Muestra ambos contadores.

        //Definimos la matriz 4x5
        int[][] matriz = {
                {12, 15, 8, 23, 34},
                {17, 20, 9, 14, 27},
                {6, 11, 18, 25, 30},
                {13, 22, 7, 16, 20}
        };

        //Contadores Pares e Impares
        int contadorPar = 0, contadorImpar = 0;

        //Mostramos la matriz definida
        System.out.println("Matriz : ");
        for (int[] elemento : matriz){
            for (int item: elemento){
                System.out.print(item + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Contamos los números pares e impares de la matriz
        for (int[] elemento : matriz) {
            for (int item : elemento) {
                if (item % 2 == 0) {
                    contadorPar++;
                } else {
                    contadorImpar++;
                }
            }
        }

        System.out.println("Números pares: " + contadorPar);
        System.out.println("número impares: " + contadorImpar);
    }

    //Ejercicio 9: Tabla de multiplicar en matriz
    public void ejercicio9 () {
        //Escribe un programa que genere una matriz de 10x10 que represente las tablas de multiplicar del 1 al 10.
        // Usa bucles for anidados para llenar la matriz donde cada elemento [i][j] contenga el resultado de (i+1) * (j+1).
        // Muestra la matriz completa.

        //Definimos matrix 10x10
        int[][] tabla = new int[10][10];

        System.out.println("Tabla de multiplicar (10x10): ");

        for (int i = 0; i < tabla.length; i++) { //Filas de la tabla
            for (int j = 0;  j< tabla[i].length; j++) {// Columnas que se multiplican (x1,x2,x3...)
                //Cada fila y columna empieza en 1 -> En la siguiente vuelta i y j + 1 y se multiplican
                tabla[i][j] = (i+1) * (j+1);

                //Mostramos tabla resultante
                System.out.print(tabla[i][j] + "\t"); // Tabulamos por tema estético y que no se vea  agrupado
            }

            System.out.println();
        }
    }

    //Ejercicio 10: Sistema de notas de una clase
    public void ejercicio10() {
        /*Desarrolla un programa que pida al usuario cuántos estudiantes y cuántas asignaturas hay. Crea una matriz para almacenar las notas (estudiantes x asignaturas). Usa bucles for anidados para rellenar la matriz con las notas. Luego:

        1. Muestra todas las notas en formato de tabla

        2. Calcula y muestra el promedio de cada estudiante

        3. Calcula y muestra el promedio de cada asignatura

        4. Encuentra la nota más alta de toda la clase y su posición

        */


        //1. Usuario Define Dimension de Matriz
        System.out.print("¿Cuántos estudiantes hay?: ");
        int numEstudiante = teclado.nextInt();

        System.out.print("¿Cuántos asignaturas hay?: ");
        int numAsignatura = teclado.nextInt();

        double[][] notas = new double[numEstudiante][numAsignatura];

        //2. Rellenar Matriz
        System.out.println("\n--- INTRODUCCION DE NOTAS ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la nota del estudiante " + (i + 1));
            for (int j = 0; j <notas[i].length ; j++) {
                System.out.printf(" Nota Asignatura %d: ", (j+1));
                notas[i][j] = teclado.nextDouble();

            }
        }

        //3. Mostrar tabla filas y columnas
        System.out.println("\n--- TABLA DE NOTAS ---");

        //IMPRIMIR CABECERA (Asig1, Asig2...)
        System.out.print("        "); // Dejamos 8 espacios en blanco para la columna de "Est X:"

        //Filas
        for (int j = 0; j < numAsignatura; j++) {
            System.out.printf("Asig%-3d", (j+1));
        }

        System.out.println(); //Salto de linea para asignaturas

        //Columnas
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Est %d: ", (i+1));
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("%-7.1f", notas[i][j]);
            }
            System.out.println();
        }

        //4. Calculo Promedio y máximos

        //Promedio por ESTUDIANTE
        //Variable nota Maxima
        double notaMasAlta = notas[0][0];
        int mejorEstudiante = 0, mejorAsignatura = 0;

        System.out.println("\n--- PROMEDIOS POR ESTUDIANTE ---");
        for (int i = 0; i < notas.length; i++) {
            //Variable suma de estudiante
            double sumaEstudianteFila = 0;
            for (int j = 0; j < notas[i].length; j++) {

                sumaEstudianteFila += notas[i][j];

                //Buscamos nota más alta y asignamos mejor Estudiante y mejor Asignatura
                if (notas[i][j] > notaMasAlta){
                    notaMasAlta = notas[i][j];
                    mejorEstudiante = i;
                    mejorAsignatura = j;
                }
            }

            double promedioEst = sumaEstudianteFila/numAsignatura;

            System.out.printf("Estudiante %d: %.2f%n", i+1, promedioEst);
        }

        //Promedio por ASIGNATURAS -> DEBEMOS INVERTIR EL ORDEN, es decir de Arriba-Abajo
        System.out.println("\n--- PROMEDIOS POR ASIGNATURA ---");
        for (int j = 0; j <numAsignatura ; j++) {
            double sumaColumna = 0;
            for (int i = 0; i < numEstudiante; i++) {
                sumaColumna += notas[i][j];
            }
           double promedioAsig = sumaColumna/numEstudiante;

            System.out.printf("Asignatura %d: %.2f%n", (j + 1), promedioAsig);
        }

        //5. Mostrar Nota más alta
        System.out.println("\n--- NOTA MÁS ALTA ---");
        System.out.printf("La nota más alta es %.1f (Estudiante %d, Asignatura %d)%n",
                notaMasAlta, (mejorEstudiante + 1), (mejorAsignatura + 1));
    }
}

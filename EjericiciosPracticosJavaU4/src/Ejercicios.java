import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {

    /*Ejercicios Tema 4 Colecciones*/

    // Ejecuto entrada de datos una vez
    private Scanner teclado;
    public Ejercicios(Scanner teclado){
        this.teclado =  teclado;
    }

    //Ejercicio 1: Crear y mostrar un array
    public void ejercicio1(){
        //Crea un programa que defina un array llamado frutas con 5 nombres de frutas. Luego, muestra todos los elementos del array en la consola, uno por línea.

        //Almacenamos las 5 frutas
        String[] frutas =  new String[5];

        System.out.println("Listado de 5 frutas.");

        //Pedimos 5 frutas por teclado
        for (int i = 0; i < frutas.length ; i++) {
            System.out.printf("Introduce fruta %d: ", i + 1);
            String fruta = teclado.next();
            frutas[i] = fruta;
        }

        System.out.println("Frutas del listado:");

        //Accedemos a cada elemento
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    //Ejercicio 2: Recorrer array con for
    public void ejercicio2(){
        //Escribe un programa que cree un array de 6 números enteros. Usa un bucle for para recorrer el array y mostrar
        // cada número junto con su posición (índice).

        //Array de numeros
        int[] numerosEnteros =  new int[6];

        //Iteramos con un for y pedimos 6 numeros por consola
        for (int i = 0; i < numerosEnteros.length ; i++) {
            System.out.printf("Introduce número %d: ", i+1);
            int numero = teclado.nextInt();
            numerosEnteros[i] = numero;
        }

        System.out.println("Recorriendo el Array");

        //Accedemos a los elementos
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.printf("Posición %d: %d%n", i, numerosEnteros[i]);
        }
    }

    //Ejercicio3:Rellenar array con input del usuario
    public void ejercicio3() {
        //Desarrolla un programa que cree un array vacío de tamaño 5. Usa un bucle for para pedir al usuario que
        // introduzca 5 nombres, guardándolos en el array. Al final, muestra todos los nombres almacenados.

        //Creamos Array con 5 elementos
        String[] nombres = new String[5];

        //Pedir nombres para rellenar el array
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Introduce el nombre %d: ", i+1);
            String nombre = teclado.next();
            //Cada nombre introducido se almacena en la posición del array
            nombres[i] = nombre;
        }

        System.out.println("Nombres introducidos:");

        for (String nombre: nombres){
            System.out.println(nombre);
        }
    }

    //Ejercicio 4: Buscar un elemento en el array
    public void ejercicio4() {
        //Crea un programa con un array de 7 números. Pide al usuario un número a buscar y usa un bucle for para recorrer
        // el array. Si el número existe, muestra su posición. Si no existe, indica que no se encontró.

        //Lista de números
        int[] numeros = {1,10,15,20,4,6,8};
        System.out.print("Array: " + Arrays.toString(numeros) + "\n" );

        //Número a Buscar
        System.out.print("Introduce el número que quieres buscar: ");
        int busquedaNumero = teclado.nextInt();

        //Variable Encontrado // Bandera de control
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == busquedaNumero) {
                encontrado = true;
                System.out.printf("El numero %d que buscas está en la posición %d", busquedaNumero, i);
                break;
            }
        }

        if (!encontrado){
            System.out.printf("El numero %d no se encuentra en el array", busquedaNumero);
        }



    }

    //Ejercicio 5: Contar elementos que cumplen una condición
    public void ejercicio5() {
        //Escribe un programa que defina un array de 10 números enteros. Usa un bucle for para contar cuántos números
        // son mayores que 50 y muestra el resultado.

        //Arrays numeros
        int[] numeros = {23,67,45,89,12,56,78,34,90,43};
        System.out.println("Array: " + Arrays.toString(numeros));

        //Variable contador >50
        int contadorMayor50 = 0;
        for (int numero : numeros) { //Con un for each se ejecuta de manera más limpia, ya que, solo
            // queremos los valores no hace falta la posición.

            if (numero > 50) {
                contadorMayor50++;
            }
        }

        System.out.printf("Cantidad de números mayores que 50: %d", contadorMayor50);
    }

    //Ejercicio 6: Calcular la suma y promedio de un array
    public void ejercicio6(){
        //Crea un programa con un array de 8 números decimales. Recorre el array con un bucle for para calcular la suma
        // de todos los elementos. Luego, calcula y muestra el promedio

        //Array 8 numeros double
        double[] numeros = {4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};
        System.out.println("Array: " + Arrays.toString(numeros));

        //Inicializamos variables para realizar la suma
        double sumaNumeros = 0;

        for (double numero : numeros) {
            //Calcular suma
            sumaNumeros += numero;
        }

        //Calculamos promedio
        double promedio = sumaNumeros/numeros.length;

        //Mostramos resultados
        System.out.printf("Suma Total: %.1f%n", sumaNumeros);
        System.out.printf("Promedio: %.1f", promedio);

    }

    //Ejercicio 7: Encontrar el número mayor y menor
    public void ejercicio7() {
        //Desarrolla un programa que cree un array de 6 números. Usa bucles for para encontrar el número mayor y el
        // número menor del array, y muestra ambos resultados.

        //Array numeros
        int[] numeros = {15, 8, 23, 4, 23, 12};
        System.out.println("Array: " + Arrays.toString(numeros));

        //Lo importante es comparar la primera posición de los elementos. Por lo tanto, inicializamos maximo y minimo en la primera posición del array
        //para poder compararlo

        //Inicializamos Maxima
        int maximo = numeros[0];

        //Inicializamos Minima
        int minimo= numeros[0];


        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo){
                minimo = numero;
            }
        }


        System.out.printf("El número mayor de la lista es: %d%n", maximo);
        System.out.printf("El número menor de la lista es: %d%n", minimo);


    }

    //Ejercicio 8: Contar apariciones de un elemento
    public void ejercicio8() {
        //Crea un programa con un array de 10 palabras (pueden repetirse). Pide al usuario una palabra y usa un bucle
        // for para contar cuántas veces aparece esa palabra en el array.

        //Array palabras
        String[] palabras = {"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};
        System.out.println("Array de animales: " + Arrays.toString(palabras));

        //Pedir palabra para buscar
        System.out.print("Introduce la palabra a buscar: ");
        String buscaPalabra = teclado.nextLine();

        //Contador palabras repetidas
        int contador = 0;

        for (String palabra : palabras){
            // Ignora si son mayúsculas o minúsculas automáticamente
            if (palabra.equalsIgnoreCase(buscaPalabra)){
                contador++;
            }
        }

        if (contador > 0){
            System.out.printf("La palabra %s aparece %d veces en el array.", buscaPalabra, contador);
        }else {
            System.out.printf("La palabra '%s' no se ha encontrado en la lista.%n", buscaPalabra);
        }



    }

    //Ejercicio 9: Invertir el orden de un array
    public void ejercicio9() {
        //Escribe un programa que cree un array de 7 números. Usa un bucle for para crear un nuevo array con los elementos
        // en orden inverso. Muestra ambos arrays: el original y el invertido.

        //Array números
        int[] numeros = {2, 4, 6, 8, 10, 12, 14};
        System.out.println("Array original: " + Arrays.toString(numeros));

        //Array vacio
        int[] arrayInverso = new int [7];

        //Variable auxiliar para el nuevo array
        int j = 0;


        for (int i = numeros.length -1; i >= 0 ; i--) {
            //Almacenamos las posiciones dentro del nuevo array vacio que habiamos creado
            arrayInverso[j] = numeros[i];

            j++; //Contador para que vaya guardando la posición 0, 1, 2....
        }

        System.out.println("Array invertido: " + Arrays.toString(arrayInverso));

    }

    //Ejercicio 10: Sistema de calificaciones con arrays
    public void ejercicio10() {
        /* Desarrolla un programa que pida al usuario cuántos estudiantes hay en una clase. Crea un array para almacenar
        sus calificaciones (0-10). Usa un bucle while para rellenar el array con las notas. Luego, usa un bucle for para:
            1. Mostrar todas las calificaciones
            2. Calcular el promedio de la clase
            3. Contar cuántos estudiantes aprobaron (nota ≥ 5)
            4. Encontrar la nota más alta y la más baja
         */

        // 1. Mostrar calificaciones
        //Pedir número estudiantes
        System.out.print("¿Cuántos estudiantes hay en clase?: ");
        int numerosEstudiante = teclado.nextInt();

        //Creamos array para almacenar notas calificaciones
        double[] arrayCalificaciones = new double[numerosEstudiante];

        int i = 0;
        while (i < arrayCalificaciones.length){
            System.out.printf("Introduce la nota del estudiante %d (0-10): ", i + 1);
            double nota = teclado.nextDouble();

            //Validacion de entrada de datos
            if (nota >=0 && nota<=10){
                arrayCalificaciones[i] = nota;
                i++;
            }else {
                System.out.println("Error: La nota debe estar entre 0 - 10");
            }
        }

        //Inicialización Variable suma y contador aprobados
        int aprobados = 0;
        double suma = 0;

        //inicializamos notaMax y notaMin
        double notaMax = arrayCalificaciones[0];
        double notaMin = arrayCalificaciones[0];

        //Calculamos suma de todas las notas
        for (double calificacion : arrayCalificaciones){
            suma += calificacion;

            // Numero de aprobados
            if (calificacion>=5){
                aprobados++;
            }
            //Nota más alta
            if (calificacion>notaMax){
                notaMax = calificacion;
            }
            //Nota más baja
            if (calificacion<notaMin){
                notaMin = calificacion;
            }
        }

        //Calculamos promedio
        double promedio = suma/arrayCalificaciones.length;

        //Mostramos Resultados

        System.out.println("----REPORTE DE CALIFICIACIONES----");
        System.out.println("Calificaciones: " + Arrays.toString(arrayCalificaciones));
        System.out.printf("Promedio de la clase: %.1f%n", promedio);
        System.out.printf("Numero de aprobados: %d%n", aprobados);
        System.out.printf("Nota más alta: %.1f%n", notaMax);
        System.out.printf("Nota más baja: %.1f%n", notaMin);


    }
}
import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicios {

    private Scanner teclado;

    public void ejercicio1 () {
        //Crea un programa que pida un número del 1 al 7 y use un switch para mostrar el día de la semana
        // correspondiente (1=Lunes, 2=Martes, etc.).

        //Entrada por teclado
        teclado = new Scanner(System.in);
        System.out.print("Introduce un número del 1-7: ");
        int numero = teclado.nextInt();

        // Ejecutamo Switch
        switch (numero) {
            case 1 -> {
                System.out.println("El dia 1 es: Lunes");
            }

            case 2 -> {
                System.out.println("El dia 2 es: Martes");
            }
            case 3 -> {
                System.out.println("El dia 3 es: Miércoles");
            }

            case 4 -> {
                System.out.println("El dia 4 es: Jueves");
            }
            case 5 -> {
                System.out.println("El dia 5 es: Viernes");
            }

            case 6 -> {
                System.out.println("El dia 6 es: Sábado");
            }
            case 7 -> {
                System.out.println("El dia 7 es: Domingo");
            }
            default -> System.out.println("Error. Número introducido no válido!");
        }

        teclado = null;
    }

    public void ejercicio2 () {
        //Desarrolla un programa que pida una letra de calificación (A, B, C, D, F) y use un switch para mostrar el
        // mensaje correspondiente: A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".

        //Entrada de datos
        teclado = new Scanner(System.in);
        System.out.println("Introduce tu calificación(A-F):");
        String calificacion = teclado.next();

        // Controlamos Mayúculas pasa a ser mayuscula la letra si o si
        String calificacionMayus = calificacion.toUpperCase();

        //Ejecutamos Switch
        switch (calificacionMayus){
            case "A" -> {
                System.out.println("Calificación A: Super Bien");
            }
            case "B" -> {
                System.out.println("Calificación B: Muy Bien");
            }
            case "C" -> {
                System.out.println("Calificación C: Bien");
            }
            case "D" -> {
                System.out.println("Calificación D: Regular");
            }
            case "E" -> {
                System.out.println("Calificación E: Mal");
            }
            case "F" -> {
                System.out.println("Calificación F: Muy Mal");
            }
            default -> System.out.println("Error. Calificación no válida");
        }

        teclado = null;
    }

    public void ejercicio3 () {
        //Escribe un programa que pida dos números y una operación (+, -, *, /). Usa un switch para realizar la operación
        // correspondiente y mostrar el resultado.

        //Entrada de datos
        teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.print("Introduce la operacion que quieres realizar (+, -, *, /): ");
        String operacion = teclado.next();

        //Inicializamos variables
        double resultado = 0;

        //Ejecutamos Switch
        switch (operacion) {
            case "+" -> {
                resultado = numero1 + numero2;
                System.out.printf("Resultado: %d + %d = %.1f", numero1, numero2, resultado);
            }
            case "-" -> {
                resultado = numero1 - numero2;
                System.out.printf("Resultado: %d - %d = %.1f", numero1, numero2, resultado);
            }
            case "*" -> {
                resultado = numero1 * numero2;
                System.out.printf("Resultado: %d * %d = %.1f", numero1, numero2, resultado);
            }
            case "/" -> {
                if (numero2 !=0) {
                    resultado = (double) numero1 / numero2;
                    System.out.printf("Resultado: %d / %d = %.1f", numero1, numero2, resultado);
                }else {
                    System.out.println("Error. No se puede dividir entre 0");
                }
            }
            default -> System.out.println("Operador no admitido");
        }
    }

    public void ejercicio4 () {
        //Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil, 2=Configuración, 3=Ayuda, 4=Salir.
        // Pide al usuario que elija una opción y usa un switch para mostrar el mensaje correspondiente a cada opción.

        //Entrada de opciones
        teclado = new Scanner(System.in);
        System.out.println("---- MENÚ ----");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");

        System.out.println("Elige una opción: ");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1 -> {
                System.out.println("Has seleccionado: Ver perfil");
            }
            case 2 -> {
                System.out.println("Has seleccionado: Configuración");
            }
            case 3 -> {
                System.out.println("Has seleccionado: Ayuda");
            }
            case 4 -> {
                System.out.println("Has seleccionado: Salir");
            }
            default -> System.out.println("Opción no válida");
        }

        teclado = null;
    }

    public void  ejercicio5 () {
        //Desarrolla un programa que pida un mes (número del 1 al 12) y use un switch para determinar la estación del
        // año: Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11)

        //Entrada de datos
        teclado = new Scanner(System.in);
        System.out.println("Introduce el número del mes (1-12): ");
        int mes = teclado.nextInt();

        //Inicialzamos la variable
        String estacion= "Mes Inválido";

        switch (mes) {
            case 12, 1, 2 -> {
                estacion = "Invierno";
            }
            case  3,4,5 -> {
                estacion = "Primavera";
            }
            case  6,7,8 -> {
                estacion = "Verano";
            }
            case 9,10,11 -> {
                estacion = "Otoño";
            }

        }

        System.out.printf("El mes %d corresponde a: %s.%n", mes, estacion);


    }

    public  void ejercicio6 () {
        //Escribe un programa que pida un número y use un bucle for para mostrar su tabla de multiplicar del 1 al 10.

        //Entrada de datos
        teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        System.out.printf("Tabla del %d:%n", numero);

        //Iteramos en el bucle for para determinar la tabla de multiplicar
        for (int i = 0; i <= 10 ; i++) {
            System.out.printf("%d * %d = %d%n", numero,i, numero * i);
        }

        teclado = null;
    }

    public void ejercicio7 () {
        //Crea un programa que pida un número N y use un bucle for para calcular la suma de todos los números desde 1 hasta N.
        // Muestra el resultado final.

        //Entrada de datos
        teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        int suma=0;

        //Permite construir y modificar cadenas de texto de forma eficiente, sin crear nuevos objetos cada vez
        //StringBuilder cadena = new StringBuilder();
        String cadena = "";


        for (int i = 1; i <= numero ; i++) {
            // Suma los numeros anterires hasta que llegue a N
            suma += i ;

            //Añadimos i a la variable cadena
           cadena += i;

            //Si i es menor que n entonces en la cadena se va añadiendo " + "
            if (i < numero){
                cadena += " + ";
            }
        }

        System.out.println("Sumando: " + cadena);
        System.out.printf("La suma de numeros del 1 al %d es: %d", numero, suma);

        teclado = null;
    }

    public void ejercicio8 () {
        //Desarrolla un programa que pida un número N y use un bucle for para contar cuántos números pares e impares hay
        // desde 1 hasta N. Muestra ambos contadores.

        //Entrada de datos
        teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        System.out.printf("Recorriendo números del 1 al %d...%n", numero);

        //Inicializamos Variables
        int contPares = 0;
        int contImpares = 0;

        //Iteramos 1 hasta n
        for (int i = 1; i <=numero ; i++) {

            //Comprabamos si es par impar
            if (i % 2 ==0){
                //Contamos numero de pares
                contPares ++;
            }else {
                //Contamos numero de impares
                contImpares ++;
            }
        }

        System.out.printf("Numeros pares encontrados: %d%n",contPares);
        System.out.printf("Numeros impares econtrados: %d%n",contImpares);

        teclado =  null;
    }

    public void ejercicio9 () {
        //Escribe un programa que pida un número entero positivo y calcule su factorial usando un bucle for.
        // El factorial de N es: N! = N × (N-1) × (N-2) × ... × 1

        //Entrada de datos
        teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        System.out.printf("Calculando %d!%n", numero);

        //Inicializamos variables - tipo long, ya que al crecer exponecialmente tipo int no alamacena numeros muy grandes
        long factorial = 1;
        String cadena = "";

        // El factorial debe ser mayor que 0
        if (numero > 0){
            for (int i = numero; i >=1  ; i--) {
                // Calculamos facorial de n
                factorial *=i;

                //Agregamos i a la cadena
                cadena += i;

                //Si i es menor que n añadimos * en la cadena
                if (i > 1){
                    cadena += " * ";
                }
            }
        }else {
            System.out.println("Número debe ser positivo o mayor que 0");
        }

        System.out.println(cadena);
        System.out.printf("El factorial de %d es: %d", numero,factorial);

        teclado = null;
    }

    public void ejercicio10() {
        //Crea un programa que muestre un menú con 3 tipos de ejercicios: 1=Flexiones, 2=Abdominales, 3=Sentadillas.
        // Pide al usuario que elija un ejercicio y cuántas repeticiones quiere hacer. Usa un switch para determinar el
        // ejercicio y un for para contar las repeticiones una a una.

        //Entrada de datos
        System.out.println("--- EJERCICIOS ---");
        System.out.println("1. Flexiones");
        System.out.println("2. Sentadillas");
        System.out.println("3. Abdominales");
        teclado = new Scanner(System.in);

        System.out.print("Elige un ejercicio (1-3): ");
        int tipoEjercicio = teclado.nextInt();

        System.out.print("¿Cuántas repeticiones?: ");
        int numeroRepes = teclado.nextInt();

        switch (tipoEjercicio){
            case 1 -> {
                System.out.println("Has elegido: Flexiones");

                //Iteramos en el número de repeticiones y obtnemos resultados
                for (int i = 1; i <=numeroRepes  ; i++) {
                    System.out.printf("Repetición %d completada %n", i);
                }

                System.out.printf("¡Ejercicio completado! Has hecho %d flexiones", numeroRepes);
            }
            case 2 -> {
                System.out.println("Has elegido: Sentadillas");
                for (int i = 1; i <=numeroRepes  ; i++) {
                    System.out.printf("Repetición %d completada %n", i);
                }

                System.out.printf("¡Ejercicio completado! Has hecho %d sentadillas", numeroRepes);
            }
            case 3 -> {
                System.out.println("Has elegido: Abdominales");
                for (int i = 1; i <=numeroRepes  ; i++) {
                    System.out.printf("Repetición %d completada %n", i);
                }

                System.out.printf("¡Ejercicio completado! Has hecho %d abdominales", numeroRepes);
            }

            default -> System.out.println("Debes elegir una opción válida");
        }

    }
}

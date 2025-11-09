import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

    private Scanner teclado;
    // Ejecuto entrada de datos una vez
    public Ejercicios(Scanner teclado){
        this.teclado = teclado;
    }

    //Ejercicio 1: Contador básico con while
    public void ejercicio1 () {
        //Crea un programa que pida un número N y use un bucle while para contar desde 1 hasta N, mostrando cada número.

        //Entrada de datos
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        System.out.println("Contando con un While");

        //Contador numero
        int contador = 0;
        while (contador < numero) {
            contador++;
            System.out.println(contador);
        }
        System.out.println("Fin del conteo");
    }

    //Ejercicio 2: Validación de contraseña con do-while
    public void ejercicio2 () {
        //Desarrolla un programa que pida al usuario una contraseña. La contraseña correcta es "1234". Usa un bucle
        // do-while para seguir pidiendo la contraseña hasta que el usuario la introduzca correctamente.

        int password= 1234;
        int pedir;
        do {
            //Petición de contraseña
            System.out.print("Introduce la contraseña: ");
            pedir = teclado.nextInt();

            if(pedir != password) {
                System.out.println("Contraseñaa incorrecta. Intentelo de nuevo.");
            }
        }while (password != pedir);

        System.out.println("Contraseña correcta. Acceso Permitido");
    }

    //Ejercicio 3: Suma acumulativa con while
    public void ejercicio3 () {
        //Escribe un programa que pida números al usuario y los vaya sumando. El bucle while debe continuar mientras el
        // usuario introduzca números positivos. Cuando introduzca un número negativo o cero, el programa debe terminar
        // y mostrar la suma total.

        //Entrada de datos
        int numero =1;

        //Contador para sumar numeros
        int contadorSuma = 0;

        while (numero > 0 ) {
            System.out.print("Introduce un número (0 o negativo para terminar): ");
            numero = teclado.nextInt();

            if (numero > 0) {
                contadorSuma +=numero;
                System.out.println("Suma actual: " + contadorSuma);
            }
        }

        System.out.println("Programa terminado. Suma total: " + contadorSuma);

    }

    //Ejercicio 4: Adivinar número con do-while
    public void ejercicio4 () {
        //Crea un juego donde el programa elige un número secreto entre 1 y 10 (por ejemplo, 7). Usa un bucle do-while
        // para pedir al usuario que adivine el número. El programa debe indicar si el número es mayor o menor,
        // y continuar hasta que el usuario acierte.

        //Objeto para generar un número aleatorio
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1; //Número entre 1 y 10, ya que si solo añadimos (10) empezaria a contar de 0-9
        int intento;
        int contadorIntento = 0;

        System.out.println("¡Adivina un número entre 1 y 10!");

        do {
            System.out.print("Introduce tu intento: ");
            intento = teclado.nextInt();

            //Número de intentos realizados
            contadorIntento++;

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Intentalo de nuevo");
            }else if (intento > numeroSecreto){
                System.out.println("El número es menor. Intentalo de nuevo");
            }

        }while(intento != numeroSecreto);

        System.out.printf("¡Correcto! has adivinado el número en %d intentos",  contadorIntento);
    }

    //Ejercicio 5: Menú interactivo con do-while y switch
    public void ejercicio5 () {
        //Desarrolla un programa con un menú que se repita usando do-while. El menú debe tener 4 opciones: 1=Saludar,
        // 2=Despedirse, 3=Ver hora actual (puedes mostrar un mensaje fijo), 4=Salir. Usa switch para procesar cada opción.
        // El programa solo debe terminar cuando el usuario elija la opción 4.

        int opcion;

        do {
            System.out.println("-----MENÚ----");
            System.out.println("1.Saludar");
            System.out.println("1.Despedirse");
            System.out.println("3.Ver hora");
            System.out.println("4.Salir");

            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1-> {
                    System.out.println("¡Hola¡ ¿Cómo estás?");
                }
                case 2->{
                    System.out.println("¡Adiós! Que te vaya bien.");
                }
                case 3->{
                    //Determinamos la hora actual con el objeto LocalTime
                    LocalTime hora =  LocalTime.now();

                    //Formateo de hora. Permite formatear la hora según el uso que queramos (Horas:min:seg), en mi caso.
                    DateTimeFormatter formateo = DateTimeFormatter.ofPattern("HH:mm:ss");
                    System.out.println("Hora actual: " + hora.format(formateo));
                }
                case 4 ->{
                    System.out.println("Saliendo del programa...");
                }
                default -> {
                    System.out.println("Opción no válida");
                }
            }

        }while (opcion != 4);

    }

    //Ejercicio 6: Cuenta atrás con while
    public void ejercicio6() {
        //Escribe un programa que pida un número N y use un bucle while para hacer una cuenta atrás desde N hasta 1,
        // mostrando cada número. Al llegar a 1, debe mostrar "¡Despegue!".

        //Inicializamos la variable en N para que se pueda restar en la cuenta atras
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();

        // Mientras numero sea  > 1 va restando 1
        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }
        System.out.println("Despegue!!!");
    }

    //Ejercicio 7: Calcular promedio con while
    public void ejercicio7() {
        //Crea un programa que pida al usuario cuántas calificaciones va a introducir. Luego, usa un bucle while para
        // pedir cada calificación una por una, sumarlas y al final calcular y mostrar el promedio.

        System.out.print("¿Cuantas calificaciones vas a introducir?: ");
        int notas = teclado.nextInt();

        //Inicializamos variable contador para saber cuantas notas debemos introducir
        int contadorNotas = 0;

        //Variables para realizar las operaciones
        double sumaTotal = 0, promedio;

        //Operamos con las calificaciones
        while (contadorNotas < notas){

            System.out.printf("Introduce la calificación %d: ", contadorNotas + 1);
            double nota = teclado.nextDouble();
            contadorNotas++;

            sumaTotal += nota;

        }

        promedio = sumaTotal / notas;

        System.out.printf("Suma total: %.1f%n", sumaTotal);
        System.out.printf("Promedio de calificaciones: %.2f%n", promedio);
    }

    //Ejercicio 8: Validación de edad con do-while
    public void ejercicio8() {
        //Desarrolla un programa que pida la edad del usuario. Usa un bucle do-while para validar que la edad
        // introducida esté entre 0 y 120. Si no es válida, debe volver a pedirla. Una vez válida, muestra un mensaje de confirmación.

        int edad;
        do {
            System.out.println("Introduce tu edad: ");
            edad = teclado.nextInt();

            if (edad < 0 || edad > 120){
                System.out.println("Edad no válida. debe estar entre 0 y 120");
            }

        }while (edad < 0 || edad > 120 );

        System.out.printf("Edad valida: %d años. ¡Gracias!", edad);
    }

    //Ejercicio 9: Combinando while, for y switch - Sistema de notas
    public void ejercicio9() {
        //Crea un programa que pida al usuario cuántos estudiantes hay en una clase. Para cada estudiante, usa un bucle
        // while para pedir su calificación numérica (0-10). Luego, usa un bucle for para mostrar todas las calificaciones
        // y usa un switch para convertir cada nota numérica en letra: 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.

        //Numero de estudiante
        System.out.print("¿Cuántos estudiantes hay en clase?: ");
        int numeroEstudiante = teclado.nextInt();

        //Declaramos Variables
        int[] notas = new int[numeroEstudiante]; //Varaible para guardar las notas
        int estudiante = 0;


        while (estudiante < numeroEstudiante) {
            System.out.printf("Introduce la nota del estudiante %d (0-10): ", estudiante + 1);
            int nota = teclado.nextInt();

            if (nota >=0 && nota <=10){
                //Almacenamos las notas
               notas[estudiante] = nota;
               estudiante++;
            }else {
                System.out.println("Nota inválida. Debe estar entre 0 y 10.");
            }
        }
        System.out.println();

        //Motramos resultados
        System.out.println("--- REPORTE DE CALIFICACIONES ---");

        //Recorremos las notas y convertimos a switch las calificaciones
        for (int i = 0; i < numeroEstudiante ; i++) {
            //Guardamos la posicion de la nota para evaluarla en el switch
            int nota = notas[i];
            char letra;

            switch (nota){
                case 10,9 -> letra = 'A';
                case 8,7 -> letra = 'B';
                case 6,5 -> letra = 'C';
                case 4,3 -> letra = 'D';
                default -> letra = 'F';
            }
            System.out.printf("Estudiante %d: %d puntos = Calificación %s%n", i + 1, nota, letra);
        }


    }

    //Ejercicio 10: Cajero automático con do-while, switch y while
    public void ejercicio10() {
        /*Desarrolla un programa que simule un cajero automático. El saldo inicial es 1000€. Usa un bucle do-while para
        mostrar un menú con opciones: 1=Consultar saldo, 2=Retirar dinero, 3=Depositar dinero, 4=Salir. Usa switch para cada opción.
        Para retirar dinero, usa un bucle while para validar que no se retire más del saldo disponible (si intenta retirar más, debe volver a pedir la cantidad).
        Para depositar, válida que sea una cantidad positiva.*/

        //Variable opcion uso do-while
        int opcion;
        int saldoInicial = 1000;

        System.out.println("---CAJERO AUTOMÁTICO---");
        System.out.println("Saldo Inicial: " + saldoInicial);

        do {
            System.out.println("---MENÚ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1 -> {
                    System.out.printf("Tú saldo actual es: %d€%n",saldoInicial);
                }
                case 2 -> {
                    int retirarDinero;
                    do {
                        System.out.println("¿Cúanto dinero quieres retirar?: ");
                        retirarDinero = teclado.nextInt();

                        if(retirarDinero > saldoInicial){
                            System.out.printf("Saldo insuficiente. Tu saldo es: %d€ %n", saldoInicial);
                        }
                    }while(retirarDinero > saldoInicial);

                    saldoInicial -= retirarDinero;
                    System.out.printf("Retiro exitoso. Has retirado: %d€%n", retirarDinero);
                    System.out.printf("Nuevo saldo: %d€ %n", saldoInicial);
                }
                case 3 -> {
                    int deposito;
                    System.out.print("¿Cuánto deseas depositar?: ");
                    deposito = teclado.nextInt();

                    if (deposito > 0){
                        saldoInicial += deposito;
                        System.out.printf("Ingreso exitoso. Has ingresado: %d€%n", deposito);
                        System.out.printf("Nuevo saldo: %d€ %n", saldoInicial);
                    }else {
                        System.out.println("Cantidad inválida. El deposito debe ser positivo");
                    }
                }
                case 4 -> {
                    System.out.println("Gracias por usar el cajero. ¡Hasta luego!");

                }
                default -> System.out.println("Opción no válida. Intentalo de nuevo");
            }
        }while(opcion != 4);
    }
}

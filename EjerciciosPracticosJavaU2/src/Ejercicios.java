import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Ejercicios {
    private Scanner lectorTeclado;

    public void ejercicio1() {
        //Crea un programa que pida al usuario dos números enteros por consola y muestre el resultado de las cinco
        // operaciones aritméticas básicas: suma, resta, multiplicación, división y módulo (resto).

        // Entrada por teclado

        System.out.println("Calculadora Basica. Importante el numero 2 debe ser Mayor 0");

        lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce 1º numero: ");
        int numeroUno = lectorTeclado.nextInt();



        System.out.println("Introduce 2º numero: ");
        int numeroDos = lectorTeclado.nextInt();

        //Operaciones
        int suma = numeroUno + numeroDos;
        int resta = numeroUno - numeroDos;
        int multiplicacion = numeroUno * numeroDos;
        int division = numeroUno / numeroDos;
        int modulo = numeroUno%numeroDos;

        System.out.printf("""
                        Suma: %d\s
                        Resta: %d\s
                        Multplicacion: %d\s
                        División: %d\s
                        Modulo: %d\s""", suma , resta , multiplicacion , division, modulo);

        lectorTeclado.close();
    }

    public void  ejercicio2(){
        //Escribe un programa que pida dos números al usuario y muestre el resultado de todas las comparaciones
        // relacionales entre ellos (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).
        System.out.println("---------Comparación de números------------");
        lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numeroUno = lectorTeclado.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int numeroDos = lectorTeclado.nextInt();

        boolean resultadoComparacion = numeroUno > numeroDos;
        System.out.printf("¿Numero %d es mayor que %d? : %b\n", numeroUno, numeroDos, resultadoComparacion);

        resultadoComparacion = numeroUno < numeroDos;
        System.out.printf("¿Numero %d es mayor que %d? : %b\n", numeroUno, numeroDos, resultadoComparacion);

        resultadoComparacion = numeroUno == numeroDos;
        System.out.printf("¿Numero %d es mayor que %d? : %b\n", numeroUno, numeroDos, resultadoComparacion);

        resultadoComparacion = numeroUno != numeroDos;
        System.out.printf("¿Numero %d es mayor que %d? : %b\n", numeroUno, numeroDos, resultadoComparacion);

        resultadoComparacion = numeroUno <= numeroDos;
        System.out.printf("¿Numero %d es mayor que %d? : %b\n", numeroUno, numeroDos, resultadoComparacion);

        resultadoComparacion = numeroUno >= numeroDos;
        System.out.printf("¿Numero %d es mayor que %d? : %b\n", numeroUno, numeroDos, resultadoComparacion);

        lectorTeclado.close();
    }

    public void ejercicio3 (int valorInicial) {

        System.out.println("Valor Inicial : " + valorInicial);

        valorInicial += 50;
        System.out.println("Despues de suma 50: " + valorInicial);
        valorInicial -=30;
        System.out.println("Despues de restar 30: "+ valorInicial);
        valorInicial *=2;
        System.out.println("Despues de multiplicar por 2: " + valorInicial);
        valorInicial /=4;
        System.out.println("Despues de dividir entre 4: " + valorInicial);


    }

    public void ejercicio4 () {
        //Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el operador módulo.
        // Muestra el resultado por consola.

        lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int parImpar = lectorTeclado.nextInt();

        int resto = parImpar%2;

        if ( resto == 0 ){
            System.out.printf("El número %d es par (resto al dividir entre 2: %d)%n", parImpar, resto);
        }else {
            System.out.printf("El número %d es impar (resto al dividir entre 2: %d)%n", parImpar, resto);
        }

        lectorTeclado.close();
    }

    public void ejercicio5 () {
        //Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false). Usa operadores
        // lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y tener carnet).

        lectorTeclado = new Scanner(System.in);
        System.out.println("¿Que edad tienes?: ");
        int edad = lectorTeclado.nextInt();

        System.out.println("Tienes carnet de conducir (true/false): ");
        boolean carnet = lectorTeclado.nextBoolean();

        // Determinamos las operaciones logicas
        boolean resultadoLogicoEdad = edad >= 21; //true
        System.out.println("Eres mayor 21 años: " + resultadoLogicoEdad);
        System.out.println("Tienes carnet: " + carnet);

        boolean resultadoLogicoAnd = resultadoLogicoEdad && carnet;

        System.out.println("¿Puedes Alquilar un coche?: " + resultadoLogicoAnd);

        lectorTeclado.close();
    }

    public void ejercicio6 () {
        //Escribe un programa que pida el precio de un producto y el porcentaje de descuento. Calcula el precio final
        // después del descuento usando operadores aritméticos y muestra todos los pasos del cálculo.

        lectorTeclado = new Scanner(System.in);
        System.out.print("Introduce el precio del producto (€): ");
        double precioProducto = lectorTeclado.nextDouble();

        System.out.print("Introduce el porcentaje del descuento (%): ");
        double valorDescuento = lectorTeclado.nextDouble();

        //Realizamos Calculos
        double precioDescuento = (valorDescuento/100) * precioProducto;
        double precioFinal = precioProducto - precioDescuento;

        //Mostramos informacion
        System.out.printf("Precio original: %.1f€\n", precioProducto);
        System.out.printf("Descuento (%.1f%%): %.1f€\n", valorDescuento, precioDescuento );
        System.out.printf("Precio Final: %.1f€\n", precioFinal);

        lectorTeclado.close();
    }

    public void ejercicio7 () {
        //Crea un programa que pida al usuario su edad y si es estudiante (true/false). Usa operadores lógicos
        // (AND, OR, NOT) para determinar si puede acceder a diferentes descuentos: descuento joven (menor de 26 años),
        // descuento estudiante, o descuento especial (menor de 26 Y estudiante).

        lectorTeclado = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();

        System.out.print("¿Eres estudiante (true/false)?: ");
        boolean esEstudiante = lectorTeclado.nextBoolean();

        //Realizamos operaciones lógicas
        boolean menor26 = edad < 26;
        boolean noEstudiante = !esEstudiante;
        boolean descuentoEstudiante = esEstudiante;
        boolean descuentoEspecial = menor26 && esEstudiante;

        //Mostramos información
        System.out.println("----Resultado Lógico---");
        System.out.printf("¿Eres menor de 26 años?: %b%n", menor26);
        System.out.printf("¿Eres estudiante?: %b%n", esEstudiante);
        System.out.printf("¿No eres estudiante?: %b%n", noEstudiante);
        System.out.printf("¿Tienes descuento joven (Menor de 26) ?: %b%n", menor26);
        System.out.printf("¿Tienes descuento de estudiante?: %b%n", descuentoEstudiante);
        System.out.printf("¿Tienes descuento especial?: %b%n", descuentoEspecial);

        lectorTeclado.close();
    }

    public void ejercicio8 () {

        lectorTeclado = new Scanner(System.in);

        //Pedimos 3 numeros y calculamos la suma de los 3 números
        System.out.print("Introduce el primer número: ");
        int numeroUno = lectorTeclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numeroDos = lectorTeclado.nextInt();
        System.out.print("Introduce el tercer número: ");
        int numeroTres = lectorTeclado.nextInt();

        // Calculamos suma
        int suma = numeroUno + numeroDos + numeroTres;

        //Calculamos promedio
        double promedio = suma/3.0;

        //Operacion combinada
        double opCombinada = (double) (numeroUno * numeroDos) / numeroTres;

        //Mostramos resultados
        System.out.printf("Suma de los tres números: %d%n", suma);
        System.out.printf("Promedio: %.1f%n", promedio);
        System.out.printf("Operación Combinada: %.1f", opCombinada);

        lectorTeclado.close();
    }

    public void ejercicio9 () {
        //Escribe un programa que pida al usuario la puntuación de tres exámenes. Calcula la nota media y usa operadores
        // relacionales para determinar si ha aprobado (>=5), si tiene notable (>=7), y si tiene sobresaliente (>=9).
        // Muestra todos los resultados.

        lectorTeclado = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double notaUno = lectorTeclado.nextDouble();
        System.out.print("Introduce la nota del segundo examen: ");
        double notaDos = lectorTeclado.nextDouble();
        System.out.print("Introduce la nota del tercer examen: ");
        double notaTres = lectorTeclado.nextDouble();

        // Calculamos promedio de las notas
        double sumaNotas = notaUno + notaDos + notaTres;
        double promedioNotas = sumaNotas/ 3.0;

        // Realizamos operaciones lógicas
        boolean suspenso = promedioNotas < 5;
        boolean aprobado = promedioNotas >= 5;
        boolean notable = promedioNotas >= 7;
        boolean sobresaliente = promedioNotas >=9;

        //Mostramos información
        System.out.printf("Nota media: %.1f%n", promedioNotas);
        System.out.printf("¿He suspendido?: %b%n", suspenso);
        System.out.printf("¿He aprobado?: %b%n", aprobado);
        System.out.printf("¿Tengo notable?: %b%n", notable);
        System.out.printf("¿Tengo sobresaliente?: %b%n", sobresaliente);

        lectorTeclado.close();
    }

    public void ejercicio10 () {
        //Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false).
        // Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble.
        // Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.

        lectorTeclado = new Scanner(System.in);

        //Solicitamos Datos
        System.out.print("Introduce el salario por hora: ");
        double salarioHora = lectorTeclado.nextDouble();

        System.out.print("Introduce las horas trabajadas: ");
        int horasTrabajadas = lectorTeclado.nextInt();

        System.out.print("¿Horas extras? (true/false): ");
        boolean horasExtras = lectorTeclado.nextBoolean();


        // Evaluamos las operaciones lógicas
        boolean trabajaMas40 = horasTrabajadas > 40;
        boolean aplicaHorasExtras = horasExtras && trabajaMas40;

        int horasNormales = Math.min(horasTrabajadas,40);
        int horaExtra = aplicaHorasExtras ? horasTrabajadas - 40 : 0;

        double salarioNormal = horasNormales * salarioHora;
        double salarioExtra = horaExtra * salarioHora*2;
        double salarioTotal = salarioNormal + salarioExtra;

        //Mostramos información
        System.out.printf("Horas normales (maximo 40): %d%n", horasNormales);
        System.out.printf("Horas extra: %d%n", horaExtra);
        System.out.printf("¿Trabajaste mas de 40 horas?: %b%n", trabajaMas40);
        System.out.printf("¿Tienes derecho a horas extra?: %b%n", horasExtras);
        System.out.printf("¿Se aplican horas extra?: %b%n",aplicaHorasExtras);

        System.out.printf("Salario por hora normales: %.1f%n€", salarioNormal);
        System.out.printf("Salario por horas extra: %.1f%n€", salarioExtra);
        System.out.printf("Salario total: %.1f€", salarioTotal);

        lectorTeclado.close();
    }
}

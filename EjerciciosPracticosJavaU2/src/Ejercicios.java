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


    }
}

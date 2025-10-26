import java.util.Scanner;

public class Ejercicios {
    private Scanner lectorTeclado;

    public void ejercicio1() {
        //Crea un programa que pida la edad del usuario y determine si es mayor de edad (18 años o más).
        // Muestra un mensaje indicando si puede votar o no.
        lectorTeclado = new Scanner(System.in);

        //Pedimos edad por teclado
        System.out.print("Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();

        if (edad >= 18 ){
            System.out.println("Eres mayor de edad. Puedes votar");
        } else {
            System.out.println("Eres menor de edad. No puedes votar");
        }

        lectorTeclado = null;
    }

    public void ejercicio2() {
        //Desarrolla un programa que pida un número al usuario y determine si es positivo, negativo o cero.
        // Muestra el resultado por consola.

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = lectorTeclado.nextInt();

        if (numero < 0) {
            System.out.printf("El número %d es negativo%n", numero);
        } else if (numero == 0) {
            System.out.printf("El número %d es Cero%n", numero);
        }else {
            System.out.printf("El número %d es positivo%n", numero);
        }

        lectorTeclado = null;
    }

    public void ejercicio3() {
        //Escribe un programa que pida la nota de un examen (entre 0 y 10) y determine si el alumno ha aprobado
        // (nota mayor o igual a 5) o ha suspendido.

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");
        double nota = lectorTeclado.nextDouble();

        if (nota >= 0 && nota <= 10 ){
            if (nota <5){
                System.out.printf("Tu nota es %.2f . Has suspendido", nota);
            } else {
                System.out.printf("¡Enhorabuena! Has aprobado con un %.2f", nota);
            }

        } else {
            System.out.println("Nota fuera del rango de medición");
        }

        lectorTeclado = null;
    }

    public void ejercicio4() {
        //Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€, aplica un
        // descuento del 10%. Muestra el importe original y el importe final a pagar.

        lectorTeclado =  new Scanner(System.in);

        System.out.print("Introdyce el importe de tu compra: ");
        double importe = lectorTeclado.nextDouble();
        double descuentoAplicado = 0;


        if ( importe >= 100) {

            descuentoAplicado = importe * 0.10;
            double descuentoFinal = importe - descuentoAplicado;

            System.out.printf("Importe original: %.1f€%n", importe);
            System.out.printf("Descuento Aplicado: %.1f€%n", descuentoAplicado);
            System.out.printf("Importe Final: %.1f€%n", descuentoFinal);
        }else {
            System.out.println("No tienes ningún descuento para poder aplicar");
        }

        lectorTeclado = null;
    }

    public void ejercicio5() {
        //Desarrolla un programa que pida un número entero y determine si es par o impar usando el operador módulo.
        // Muestra un mensaje personalizado para cada caso.

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = lectorTeclado.nextInt();

        if ( numero%2== 0){
            System.out.printf("El número %d es par", numero);
        }else {
            System.out.printf("El número %d es par", numero);
        }

        lectorTeclado = null;
    }

    public void ejercicio6() {
        //Escribe un programa que pida la edad del usuario y determine si puede acceder a contenido para mayores de 16 años.
        //Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();

        if (edad > 0 && edad <= 100) {
            if (edad >=16) {
                System.out.printf("Acceso Permitido. Tu edad es %d años%n", edad);
            }else {
                System.out.println("Acceso denegado. Debes tener al menos 16 años");
            }
        }else {
            System.out.println("La edad introducida es incorrecta");
        }

        lectorTeclado = null;
    }

    public void ejercicio7() {
        //Crea un programa que pida una nota numérica (0-10) y determine la calificación: Suspenso (0-4), Aprobado (5-6)
        //Notable (7-8) o Sobresaliente (9-10).

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");
        int nota = lectorTeclado.nextInt();

        //Controlamos parámetros
        if ( nota >=0 && nota <= 10){
            if (nota <= 4){
                System.out.println("Tu calificación es: Suspenso");
            } else if ( nota <=6 ) {
                System.out.println("Tu calificación es: Aprobado");
            } else if (nota <= 8) {
                System.out.println("Tu calificación es: Notable");
            } else {
                System.out.println("Tu calificación es: Sobresaliente");
            }

        }else {
            System.out.println("La nota introducida no es válida");
        }

        lectorTeclado = null;
    }

    public void ejercicio8() {
        //Desarrolla un programa que pida dos números al usuario y determine cuál es mayor, o si son iguales.
        // Muestra el resultado por consola.

        lectorTeclado =  new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int numeroUno = lectorTeclado.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int numeroDos = lectorTeclado.nextInt();

        //Comparación de entradas
        if (numeroUno > numeroDos) {
            System.out.printf("El numero %d es mayor que %d", numeroUno, numeroDos);
        }else if (numeroDos > numeroUno){
            System.out.printf("El número %d es mayor que %d", numeroDos, numeroUno);
        }
        else {
            System.out.println("Son iguales");
        }

        lectorTeclado = null;
    }

    public void ejercicio9() {
        //Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario. Calcula el IMC (peso / altura²)
        //y determina si está en peso normal (IMC entre 18.5 y 24.9), por debajo del peso normal (IMC menor a 18.5) o por
        // encima del peso normal (IMC mayor a 24.9).

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce tu peso (kg): ");
        double peso = lectorTeclado.nextDouble();

        System.out.print("Introduce tu altura (m): ");
        double altura = lectorTeclado.nextDouble();

        // Operaciones IMC
        //double imc = peso/Math.pow(altura, 2); //Uso libreria Math.pow para elevar altura al cuadrado
        double imc = peso/(altura * altura); //-> Metodo sencillo.
        System.out.printf("Tu IMC es: %.2f%n", imc);

        //Controlamos IMC Usuario
        if ( imc >= 0 &&  imc <40){
            if (imc < 18.5){
                System.out.println("Tú IMC está por debajo de lo normal");
            } else if ( imc < 24.9 ) {
                System.out.println("Tú IMC está en el peso normal");
            }else {
                System.out.println("Tú IMC está por encima de lo normal");
            }
        }else {
            System.out.println("IMC fuera del rango de medición");
        }

        lectorTeclado = null;
    }

    public void ejercicio10() {
        //Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción.
        // La altura mínima es 120 cm y la máxima es 200 cm. Si está dentro del rango, muestra "Puedes subir", si no,
        // indica el motivo (demasiado bajo o demasiado alto).

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce tu altura (cm): ");
        int altura = lectorTeclado.nextInt();
        int alturaMinima = 120;
        int alturaMaxima = 200;

        if ( altura < alturaMinima ){
            System.out.printf("No puede subir a la atraccion. Altura minima: %d cm%n", alturaMinima);
        } else if (altura > alturaMaxima) {
            System.out.printf("No puede subir a la atracción. Altura máxima: %d cm%n", alturaMaxima);
        }else {
            System.out.println("Puede subir a la atracción");
        }

        lectorTeclado = null;
    }

    public void ejercicio11() {
        /*Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false).
        Aplica descuentos según estas reglas: Si es socio Y la compra es mayor o igual a 200€, descuento del 20%. Si es
        socio Y la compra es menor de 200€, descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€, descuento del 5%.
        En cualquier otro caso, no hay descuento. Muestra el importe original, el descuento aplicado y el importe final.*/

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce el importe de la compra: ");
        double importeCompra = lectorTeclado.nextDouble();

        System.out.print("¿Eres socio (true/false)?: ");
        boolean socio = lectorTeclado.nextBoolean();


        //Inicializamos variables
        int descuento20 = 20;
        int descuento10 = 10;
        int descuento5 = 5;
        double importeTotal;

        // Calculamos operaciones
        System.out.printf("Importe Original: %.1f€%n", importeCompra);

        if (socio && importeCompra >= 200) {

            double importe20 = importeCompra * descuento20/100;
            importeTotal = importeCompra - importe20;

            System.out.println("Eres socio y tu compra es >= 200€ ");
            System.out.printf("Descuento aplicado (%d%%): %.1f€%n",descuento20, importe20);
            System.out.printf("Importe total: %.1f€",importeTotal);
        } else if (socio && importeCompra < 200) {

            double importe10 = importeCompra * descuento10/100;
            importeTotal = importeCompra - importe10;

            System.out.println("Eres socio y tu compra es < 200€ ");
            System.out.printf("Descuento aplicado (%d%%): %.1f€%n",descuento10, importe10);
            System.out.printf("Importe total: %.1f€",importeTotal);
        } else if (!socio && importeCompra >= 300 ) {

            double importe5 = importeCompra * descuento5/100;
            importeTotal = importeCompra - importe5;

            System.out.println("No eres socio y tu compra es >= 300€ ");
            System.out.printf("Descuento aplicado (%d%%): %.1f€%n",descuento5, importe5);
            System.out.printf("Importe total: %.1f€",importeTotal);
        } else {
            System.out.println("Lo siento no hay descuento para aplicarse");
        }

        lectorTeclado = null;
    }

    public void ejercicio12() {
        /*Crea un programa que pida al usuario crear una contraseña. La contraseña debe cumplir estos requisitos:
        tener al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password".
        El programa debe verificar cada condición por separado usando operadores lógicos y mostrar si la contraseña
        es válida o no, indicando qué requisitos no cumple. Nota: Para este ejercicio, asume que tienes funciones auxiliares
        como longitudCadena(texto), contienNumero(texto).*/

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce una contraseña: ");
        String contrasenia = lectorTeclado.nextLine();

        //Controlamos las mayusculas
        String toLowerCase = contrasenia.toLowerCase();

        //Comprobamos longitud password
        int logitud = toLowerCase.length();


        // Controlamos las peticiones
        boolean cumpleLongitud = logitudCadena(toLowerCase);
        boolean tieneUnNumero = contieneNumero(toLowerCase);
        boolean esProhibida = toLowerCase.equals("12345678") || toLowerCase.equals("password");
        boolean esValida = true;

        //Mostramos Información
        System.out.printf("Longitud de la contraseña: %d%n" , logitud);
        System.out.printf("¿Tiene al menos 8 caracteres?: %b%n", cumpleLongitud);
        System.out.printf("¿Contiene al menos un número?: %b%n", tieneUnNumero);
        System.out.printf("¿La contraseña es prohibida?: %b%n", esProhibida);

        if (!cumpleLongitud || !tieneUnNumero || esProhibida){
            esValida = false;
        }

        System.out.printf("¿Es válida? (cumple todos los requisitos): %b%n", esValida);

        if( !esValida ) {
            System.out.print("Contraseña no válida. ");
            if (!cumpleLongitud){
                System.out.println("Debe tener al menos 8 caracteres");
            } else if (!tieneUnNumero) {
                System.out.println("Debe tener al menos un número");
            } if (esProhibida) {
                System.out.println("No puede ser '12345678' ni 'password'");
            }
        }

        lectorTeclado = null;
    }

    // Metodos auxiliares para ejercicio12
    public static boolean logitudCadena(String texto) {
        return texto.length() >= 8;
    }

    public static boolean contieneNumero (String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char c =  texto.charAt(i);
            if (Character.isDigit(c)){
                return true;
            }
        }

        return false;
    }

    public void ejercicio13() {
        /*Escribe un programa para calcular el precio de entrada a un museo. Pide la edad del usuario y el día de la
        semana (1=lunes, 2=Martes... 7=domingo). Las reglas son: Menores de 12 años: entrada gratis. Entre 12 y 17 años:
        5 € (pero gratis los martes). Entre 18 y 64 años: 10€ (pero 7€ los jueves). 65 años o más: 6 €. Usa operadores
        lógicos para determinar el precio correcto y muestra el cálculo.*/

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();

        System.out.print("Introduce el día de la semana(1-7): ");
        int dia = lectorTeclado.nextInt();

        // Llamamos a nuestra función nombreDia y nos indica que dia de la semana es
        // También al motivo del descuento
        String diaSemana = nombreDia(dia);

        //Operaciones con los operadores lógicos
        boolean esMenor12 = edad < 12;
        boolean entre12y17 = edad >= 12 && edad <= 17;
        boolean entre18y64 = edad >=18 && edad <=64;
        boolean esJueves = dia == 4;
        boolean esMartes = dia == 2;

        //Inicializamos precio
        double precio = 0;

        if(esMenor12){
            precio = 0.0;
        } else if (entre12y17) {
            if (esMartes){
                precio = 0.0;
            }else {
                precio = 5.0;
            }

        } else if (entre18y64) {
            if (esJueves){
                precio = 7.0;
            }else {
                precio = 10.0;
            }
        } else {
            precio = 6.0;
        }

        //Mostramos Información
        String razonDia = motivoDia(precio, edad, dia);
        System.out.printf("Edad: %d años%n", edad);
        System.out.printf("Día de la semana: %d (%s)%n", dia,diaSemana);
        System.out.printf("¿Eres menor de 12?: %b%n", esMenor12);
        System.out.printf("¿Tienes entre 12 y 17?: %b%n", entre12y17);
        System.out.printf("¿Es martes?: %b%n", esMartes);
        System.out.printf("Precio Entrada: %.1f (%s)", precio, razonDia);

        lectorTeclado = null;
    }

    // Métodos auxiliares ejercicio13
    public static String nombreDia (int dia) {

        return switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día no válido";
        };
    }

    public static String motivoDia (double precio, int edad, int dia){
        if(precio == 0.0){
            if(edad < 12){
                return "Entrada gratuita para menores de 12 años";
            } else if (edad <= 17 && dia == 2 ){
                return "Entrada gratuita para menores en Martes";
            }
        } else if (edad >= 18 && edad <= 64 && dia == 4 && precio == 7.0) {
            return "Descuento para adultos en jueves";
        } else if (edad >= 65 && precio == 6.0) {
            return "No hay descuento disponible";
        } else if (edad >= 18 && edad <= 64 && precio == 10.0 ) {
            return "No hay descuento disponible";
        }
        // En cualquier otro caso devuelve un String vacío.
        return "";
    }

    public void ejercicio14() {
        /*Desarrolla un programa que determine si una persona es elegible para un préstamo bancario. Pide:
        edad, ingresos mensuales (€), y si tiene deudas pendientes (true/false). Los requisitos son:
        Edad entre 21 y 65 años, ingresos mensuales de al menos 1000 €, y NO tener deudas pendientes.
        El programa debe evaluar cada condición y mostrar si es elegible o no, explicando qué requisitos no cumple.*/

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();

        System.out.print("Introduce tus ingresos mensuales: ");
        int ingresosMensuales = lectorTeclado.nextInt();

        System.out.print("¿Tienes deudas pendiente (true/false)?: ");
        boolean deudasPendientes = lectorTeclado.nextBoolean();

        //Evaluamos condiciones con operadores lógicos -> Requisitos
        boolean entre21y65 = edad >= 21 && edad <= 65;
        boolean ingresoMinimo = ingresosMensuales >= 1000;
        boolean esElegible = entre21y65 && ingresoMinimo && !deudasPendientes;

        //Mostramos información
        System.out.printf("¿Edad entre 21 y 64?: %b%n", entre21y65);
        System.out.printf("¿Ingresos mayores a 1000€ ?: %b%n", ingresoMinimo);
        System.out.printf("¿Tienes deudas pendientes?: %b%n", deudasPendientes);
        System.out.printf("¿Es elegible el préstamo?: %b%n", esElegible);

        //En caso de ser elegible y de no serlo muestra la siguiente información
        if(esElegible){
            System.out.println("¡Felicidades! Eres puedes obtener el préstamo");
        }else {
            System.out.println("Lo sentimos. No cumples los siguiente requisitos");
            if (!entre21y65){
                System.out.println("-No cumples requisitos de edad");
            }
            if (!ingresoMinimo)  {
                System.out.println("-Los ingresos mínimos debes ser superiores a 1000€");
            }
            if (deudasPendientes) {
                System.out.println("-No debes tener deudas");
            }
        }

        lectorTeclado = null;
    }

    public void ejercicio15() {
        //Crea un programa que calcule el coste de envío de un paquete. Pide: peso del paquete (kg),
        // distancia de envío (km), y si es envío urgente (true/false). Las reglas son:
        // Precio base: 5€. Si el peso es mayor de 5kg, añadir 2€ por cada kg adicional. Si la distancia es mayor de 100km, añadir 10€.
        // Si es envío urgente, multiplicar el precio total por 1.5. Muestra todos los cálculos paso a paso.

        lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce el peso del paquete: ");
        int pesoPaquete = lectorTeclado.nextInt();

        System.out.print("Introduce la distancia de envío (km): ");
        int distanciaEnvio = lectorTeclado.nextInt();

        System.out.print("¿Es un envío urgente?: ");
        boolean urgente = lectorTeclado.nextBoolean();

        //Operaciones
        double precioBase= 5.0;
        double costePeso = 0;
        double costeDistancia = 0;
        double subtotal = 0;
        double recargoUrgente = 0;
        double total = 0;

        System.out.printf("Precio base: %.1f€%n", precioBase);

        //Coste Adicional por peso
        if (pesoPaquete > 5){
            int excesoPeso = pesoPaquete - 5;
            costePeso = excesoPeso * 2;

            System.out.printf("Peso: %dkg (execede los 5kg en %dkg)%n", pesoPaquete, excesoPeso);
        }else {
            System.out.printf("Peso: %dkg (no execede los 5kg)%n", pesoPaquete);
        }

        //Coste Adicional por distancia
        if (distanciaEnvio > 100) {
            costeDistancia = 10;
            System.out.printf("Distancia: %dkm (mayor de 100km)%n", distanciaEnvio);
        }else {
            System.out.printf("Distancia: %dkm (menor de 100km)%n", distanciaEnvio);
        }

        //Subtotal antes de ser envio urgente
        subtotal = precioBase + costePeso + costeDistancia;

        // Recargo urgencia
        if (urgente) {
            recargoUrgente = subtotal * 0.5;
            total = subtotal * 1.5;
        }else {
            total = subtotal;
        }

        //Mostramos información
        System.out.printf("Coste adicional por peso: %.1f€%n", costePeso);
        System.out.printf("Coste adicional por distancia: %.1f€%n", costeDistancia);
        System.out.printf("Subtotal: %.1f€%n", subtotal);
        System.out.printf("¿Es un envio urgente?: %b%n", urgente);

        if (urgente) {
            System.out.printf("Recargo por urgencia (x1.5): %.1f€%n", recargoUrgente);
        }
        System.out.printf("Coste total de envío: %.1f€%n", total);

        lectorTeclado = null;
    }
}

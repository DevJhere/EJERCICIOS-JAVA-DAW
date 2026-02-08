package ejercicio1;

import ejercicio1.controller.Centralita;
import ejercicio1.model.Llamada;
import ejercicio1.model.Local;
import ejercicio1.model.Nacional;
import ejercicio1.model.Provincial;

import java.util.Scanner;

public class Main {
    /*1. Desarrollar una aplicación de control de llamadas realizadas en una centralita
    telefónica.
    La centralita mostrará por pantalla todas las llamadas según las vaya registrando. Existen
    tres tipos de llamadas:
    • Las llamadas locales que no tienen coste
    • Las llamadas provinciales que cuestan 15 céntimos el segundo.
    • Las llamadas nacionales que dependiendo de la franja horaria en la que se
    realicen cuestan: 20 céntimos en franja 1, 25 céntimos en franja 2 y 30 céntimos
    en franja 3, cada segundo.
    Todas las llamadas tienen como datos el número origen de la llamada, el número destino
    y su duración en segundos.
    Con la centralita se podrá
    • Registrar llamadas, mostrar llamadas realizadas (número origen, número
    destino, duración y coste)
    • Mostrar Costes totales
    • Mostrar llamadas realizadas
    Decide cuales son los métodos que se deberían de poner en herencia
    */

    public static void main(String[] args) {

        //Instanciamos
        Scanner scanner =new Scanner(System.in);
        int opcion;
        Centralita centralita = new Centralita();

        do {
            System.out.println("1. Registrar Llamada: ");
            System.out.println("2. Mostrar Llamada: ");
            System.out.println("3. Mostrar Caja: ");
            System.out.println("4. Salir: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Que llamada quieres registrar?: ");
                    System.out.println("1. Local");
                    System.out.println("2. Provincial");
                    System.out.println("3. Nacional");
                    int tipo = scanner.nextInt();
                    //CReamos objeto Llamada
                    Llamada llamada = null;
                    System.out.println("Indica número Origen:");
                    long origen = scanner.nextLong();

                    System.out.println("Indica número Destino:");
                    long destino = scanner.nextLong();

                    System.out.println("Indica duracion:");
                    int duracion = scanner.nextInt();
                    switch (tipo) {
                        case 1 -> {
                            llamada = new Local(origen, destino, duracion);
                        }
                        case 2 -> {
                            llamada = new Provincial(origen, destino, duracion);
                        }
                        case 3 -> {
                            System.out.println("Indica franja: ");
                            int franja = scanner.nextInt();
                            llamada = new Nacional(origen, destino, duracion, franja);
                        }
                        default -> System.out.println("No valida.");

                    }

                    if (llamada != null) {
                        centralita.registrarLlamadas(llamada);
                    }else  {
                        System.out.println("Llamada no registrada.");
                    }

                }

                case 2 -> {
                    centralita.mostrarLlamadas();
                }

                case 3 -> {
                    centralita.mostrarCaja();
                }

                case 4 -> {
                    System.out.println("Saliendo....");
                }
                default -> System.out.println("Opcion no válida");
            }
        }while (opcion != 4);
    }
}

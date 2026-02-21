package ejercicio11;

import ejercicio11.controller.GestorAgenda;
import ejercicio11.model.Usuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*## Ejercicio 9: Agenda
    Crea una aplicación que permita gestionar una agenda de contactos. Para ello crea una clase Usuario que tenga las
    características: nombre, apellido, dni. Además de esta clase, crea un main que permita gestionar los usuarios, con las siguientes opciones:
    1. Agregar usuario: pedirá por consola todos los datos
    2. Listar usuarios: mostrará por consola todos los usuarios del sistema
    3. Exportar usuarios: guardará en un fichero .txt todos los usuarios de la lista*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorAgenda gestor = new GestorAgenda();

        //Menú Usuario
        int opcion;
        do {
            System.out.println("==== MENÚ: MI AGENDA ====");
            System.out.println("1. Agregar Usuario.");
            System.out.println("2. Listar Usuario.");
            System.out.println("3. Exportar Usuario.");
            System.out.println("4. Salir.");
            System.out.print("Eliga una opción: ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                opcion = -1;
                sc.nextLine(); // Limpiamos la letra equivocada aquí directamente
            }

            switch (opcion) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Introduce el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Introduce el apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Introduce el DNI: ");
                    String dni = sc.nextLine();

                    gestor.agregarContacto(new Usuario(nombre, apellido, dni));
                }
                case 2 -> {
                    System.out.println(" --- DATOS USUARIOS ---");
                    gestor.listarContacto();
                }
                case 3 -> gestor.exportarDatos();
                case 4 -> System.out.println("Saliendo de la Agenda");
                default -> {
                    System.out.println("Opción no valida.");
                }
            }
        } while (opcion != 4);

        sc.close();
    }
}

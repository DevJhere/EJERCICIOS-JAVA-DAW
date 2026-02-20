package ejercicio10;

import ejercicio10.model.Archivo;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*🏆 Ejercicio 10: El Jefe Final (El Gestor de Tareas)
    Llegamos al final de nuestro entrenamiento. Vamos a juntar todo lo que has aprendido en un mini-proyecto real.
    El Reto: Crea una "Lista de Tareas" (To-Do List) que sobreviva al cerrar el programa.
    Menú por consola:
    1.Añadir nueva tarea
    2.Ver todas las tareas
    3.Borrar todas las tareas
    Salir
    Funcionamiento:
    Si elijo 1, me pide escribir una tarea y la guarda en un archivo llamado tareas.txt (recuerda usar el modo Append new FileWriter(ruta, true) para no borrar las anteriores).
    Si elijo 2, lee el archivo tareas.txt línea por línea y me las muestra numeradas.
    Si elijo 3, vacía el archivo (pista: si usas new FileWriter(ruta) normal, sin el true, se sobrescribe en blanco).*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        Archivo gestion =  new Archivo();

        File file = new File("tareas.txt");

        do {
            try {

                System.out.println("===  MENÚ TO-DO LIST ===");
                System.out.println("1. Añadir tareas.");
                System.out.println("2. Ver todas las tareas.");
                System.out.println("3. Borrar todas las tareas.");
                System.out.println("4. Salir.");
                System.out.println("Elija una opción: ");

                opcion = sc.nextInt();

                sc.nextLine(); //Limpiamos Buffer

                switch (opcion){
                    case 1 ->{

                        System.out.println("Introduzca la tarea: ");
                        String tarea = sc.nextLine();

                        gestion.asignarTareas(file, tarea);
                    }
                    case 2 -> {
                        gestion.verTareas(file);
                    }
                    case 3 -> {
                        gestion.eliminarTareas(file);
                    }
                    case 4 -> {

                        System.out.println("Saliendo...");
                    }
                    default -> System.out.println("Opción no válida");
                }
            }catch (InputMismatchException e){
                System.out.println("Error. Debe introducir un número.");
                sc.nextLine();
            }
        }while (opcion!=4);
    }
}

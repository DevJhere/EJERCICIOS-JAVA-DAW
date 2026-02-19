package ejercicio2;

import ejercicio2.model.Archivos;

import java.io.File;
import java.util.Scanner;

public class Main {
    /*## Ejercicio 2: Buscar palabra en un archivo
        Escribe un programa que busque cuántas veces aparece una palabra específica en un archivo de texto.
        El usuario debe introducir la ruta del archivo y la palabra a buscar.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo: ");
        String ruta = scanner.nextLine();
        File file = new File(ruta);

        System.out.print("Introduce la palabra a buscar: ");
        String buscarP = scanner.nextLine();

        Archivos gestion = new Archivos();

        //Aplicamos la función para leer el archivo
        if (file.exists() && file.isFile()){
            int numeroVeces = gestion.contarPalabra(file, buscarP);

            if (numeroVeces != -1 ){
                System.out.println("La palabra '" + buscarP + "' aparece " +numeroVeces + " veces en el archivo.");
            }else {
                System.out.println("La ruta no es válida");
            }
        }else {
            System.out.println("La ruta no es válida o no es un fichero");
        }

        scanner.close();
    }
}

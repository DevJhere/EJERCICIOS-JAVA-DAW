package ejercicio4;

import ejercicio4.model.Archivos;

import java.io.File;
import java.util.Scanner;

public class Main {
    /*## Ejercicio 4: Obtener información de un archivo
    Desarrolla un programa que obtenga y muestre información detallada sobre un archivo especificado por el usuario,
    como su tamaño, fecha de última modificación, permisos de lectura/escritura y si es un archivo oculto o no.*/
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo: ");
        String ruta = scanner.nextLine();
        File file =  new File(ruta);

        Archivos gestion =  new Archivos();

        gestion.informacionArchivo(file);

    }
}

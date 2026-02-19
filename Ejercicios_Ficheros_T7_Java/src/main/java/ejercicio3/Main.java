package ejercicio3;

import ejercicio3.model.Archivos;

import java.io.File;
import java.util.Scanner;

public class Main {
    /*## Ejercicio 3: Copiar un archivo
        Crea un programa que copie el contenido de un archivo a otro. El programa debe solicitar al usuario la ruta del
        archivo de origen y la ruta del archivo de destino.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce ruta de origen: ");
        String origen =  sc.nextLine();

        System.out.println("Introduce ruta de destino: ");
        String destino =  sc.nextLine();

        File file1 = new File(origen);
        File file2 = new File(destino);

        Archivos gestion = new Archivos();

        gestion.copiarArchivo(file1, file2);

    }
}

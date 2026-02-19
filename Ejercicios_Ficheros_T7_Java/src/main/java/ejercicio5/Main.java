package ejercicio5;

import ejercicio5.model.Archivos;

import java.io.File;
import java.util.Scanner;

public class Main {
    /*## Ejercicio 5: Contar líneas de un archivo
    Desarrolla un programa que cuente el número de líneas que contiene un archivo de texto. El programa debe solicitar
    al usuario la ruta del archivo a analizar.*/
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Archivos gestion = new Archivos();

        System.out.print("Indice la ruta del archivo: ");
        String ruta = sc.nextLine();

        File file =  new File(ruta);

        if (file.exists() && file.isFile()){
            int totalLineas = gestion.contarLineasArchivo(file);
            System.out.println("El archivo contiene: " + totalLineas + " líneas.");
        } else {
            System.out.println("La ruta no es válida o no es un fichero");
        }


    }
}

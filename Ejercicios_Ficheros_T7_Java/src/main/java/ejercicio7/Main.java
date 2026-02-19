package ejercicio7;

import ejercicio7.model.Archivos;

import java.io.File;
import java.util.Scanner;

public class Main {
    /*## Ejercicio 7: Exploración básica con la clase File
    Crea un programa que solicite al usuario una ruta de directorio y muestre una lista de todos los archivos y
    subdirectorios contenidos en él. Para cada elemento, indica si es un archivo o un directorio, su tamaño en bytes
    (si es un archivo) y la fecha de última modificación.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Introduce la ruta a buscar: ");
        String ruta = sc.nextLine();

        File file = new File(ruta);

        Archivos gestion =  new Archivos();

        if (file.isDirectory() && file.exists()){
            gestion.exploradorArchivos(file);
        }else {
            System.out.println("Erro en la ruta. No existe");
        }
    }
}

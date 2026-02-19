package ejercicio1;

import ejercicio1.model.Archivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    /*## Ejercicio 1: Leer un archivo de texto
        Escribe un programa que lea el contenido de un archivo de texto existente y lo muestre por consola.
        El programa debe solicitar al usuario la ruta del archivo a leer.
     */

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        //Pedimos los datos al usuario
        System.out.print("Introduce la ruta del archivo: ");
        String ruta = sc.nextLine();

        File file = new File(ruta);

        //Instancia mos Objeto Archivo
        Archivos gestion = new Archivos();

        //Aplicamos la función para leer el archivo
        if (file.exists() && file.isFile()){
            gestion.leerArchivo(file);
        }else {
            System.out.println("La ruta no es válida o no es un fichero");
        }
    }
}

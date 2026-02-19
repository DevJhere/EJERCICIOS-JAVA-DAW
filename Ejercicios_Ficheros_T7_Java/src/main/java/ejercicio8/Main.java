package ejercicio8;

import ejercicio8.model.Archivos;

import java.io.File;
import java.util.Scanner;

public class Main {

    /*## Ejercicio 8: Contador de palabras
    Desarrolla una aplicación que lea un archivo de texto y cuente cuántas palabras contiene. El programa debe mostrar
    también cuáles son las 5 palabras más frecuentes y cuántas veces aparece cada una. Ignora signos de puntuación y
    trata las palabras sin distinguir entre mayúsculas y minúsculas.*/

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Introduce ruta");
        String ruta = sc.nextLine();

        Archivos gestion = new Archivos();

        File file =  new File(ruta);

        gestion.analizarTexto(file);
    }
}

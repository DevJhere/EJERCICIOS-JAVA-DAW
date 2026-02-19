package ejercicio6;

import ejercicio6.model.Archivos;

import java.io.File;

public class Main {
    /*## Ejercicio 6: Crear un archivo CSV simple
    Escribe un programa que cree un archivo CSV (valores separados por comas) con información de 3 estudiantes.
    Para cada estudiante, guarda su nombre, edad y calificación. Luego, lee el archivo y muestra su contenido en la consola.*/

    public static void main(String[] args) {

        //Instanciamos objeto
        Archivos gestion = new Archivos();

        File rutaArchivoDestino = new File("src/main/java/ejercicio6/resources/estudiantes.csv");

        gestion.crearArchivoCSV(rutaArchivoDestino);
        System.out.println("Archivo CSV creado Correctamente");

        System.out.println("Leyendo contendido...");
        gestion.leerArchivoCSV(rutaArchivoDestino);

    }
}

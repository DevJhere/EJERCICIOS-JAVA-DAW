package ejercicio1.model;

import java.io.*;

public class Archivos {

    public Archivos() {
    }

    public void leerArchivo(File file) throws IOException {

       //Empleamos BufferedReader para leer las líneas del archivo
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

                //Variable para almacenar cada String de cada linea
                String linea;
                System.out.println("Contenido del archivo: ");

                //Mientras no sea null la linea que se va a leer se lee la linea
                while ((linea = bufferedReader.readLine()) != null) {
                    System.out.println(linea);
                }
            //Control de flujo
        } catch (FileNotFoundException e) {
                System.out.println("La ruta introducida es incorrecta");
        } catch (IOException e) {
                System.out.println("Error de lectura de fichero. No tienes los permisos suficientes.");
        }
    }
}

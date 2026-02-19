package ejercicio6.model;

import java.io.*;

public class Archivos {
    public Archivos() {
    }

    public void crearArchivoCSV(File destino){
        //Datos Estudiantes
        String[] datosEstudiantes = {
                "Nombre,Edad,Calificación",
                "Juan,20,8.5",
                "Maria,22, 9.0",
                "Pedro,19,7.5"
        };

        //Escribimos dentro del archivo destino
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destino))){

            //Recorremos el array de estudiante con un for
            for (String item:datosEstudiantes){
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }

        }catch (IOException | NullPointerException e){
            System.out.println(e.getMessage());
        }

    }

    public void leerArchivoCSV(File destino){

        try(BufferedReader bufferedReader = new BufferedReader( new FileReader(destino))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null){
                System.out.println(linea);
            }

        }catch (IOException | NullPointerException e){
            System.out.println("Error en la lectura del archivo.");
        }
    }
}

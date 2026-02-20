package ejercicio10.model;

import java.io.*;

public class Archivo {

    public Archivo() {
    }

    public void asignarTareas(File archivo, String tarea) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivo, true))) {

            // Al usar true (modo append), si el archivo no existe, lo crea. Si existe, añade al final.
            bufferedWriter.write(tarea);
            bufferedWriter.newLine(); // Escribe linea por linea.
            System.out.println("Tarea creada correctamente");

        } catch (IOException | NullPointerException e) {
            System.out.println("Error al guardar la tarea: "+e.getMessage());
        }
    }

    public void verTareas(File archivo){

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int contadorLinea=0;

            while ((linea = bufferedReader.readLine()) != null){
                contadorLinea++;
                System.out.println(contadorLinea + ". " + linea);

            }

            if (contadorLinea == 0) {
                System.out.println("¡Genial! No tienes tareas pendientes.");
            }

        }catch (FileNotFoundException e){
            System.out.println("Aún no tienes ninguna tarea registrada. ¡Añade una con la opción 1!");
        }catch (IOException | NullPointerException e){
            System.out.println("Error de lectura del archivo");
        }
    }

    public void eliminarTareas(File archivo){

        try (FileWriter fileWriter = new FileWriter(archivo)){

            System.out.println("¡Todas las tareas han sido borradas con éxito!");

        }catch (IOException | NullPointerException e){
            System.out.println("Error. No se pudo borrar tareas");
        }


    }
}

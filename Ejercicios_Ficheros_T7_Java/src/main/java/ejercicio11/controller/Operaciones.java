package ejercicio11.controller;

import ejercicio11.model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Operaciones {

    //Exportar Usuario
    public void exportarUsuarios(Usuario usuario){
        File file = new File("src/main/java/ejercicio11/resources/usuarios.csv");

        boolean archivoYaExiste = file.exists();

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))){

            //Si el fichero no existe se crea
            if (!archivoYaExiste){
                printWriter.println("nombre,apellido,dni");
            }

            String lineCSV = usuario.getNombre() + "," + usuario.getApellido() + "," + usuario.getDni();
            printWriter.println(lineCSV);


        }catch (IOException | NullPointerException e){
            System.out.println("Error de creación de fichero." + e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

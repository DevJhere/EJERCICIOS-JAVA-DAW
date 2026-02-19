package ejercicio5.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Archivos {

    public Archivos() {
    }

    public int contarLineasArchivo(File path){
        //Variable auxiliar
        int contadorLineas = 0;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String linea;
            while((linea = bufferedReader.readLine() )!= null){

                contadorLineas++;
            }

        }catch (IOException | NullPointerException e){
            System.out.println("Error de lecturaa del archivo.");
        }

        return contadorLineas;
    }
}

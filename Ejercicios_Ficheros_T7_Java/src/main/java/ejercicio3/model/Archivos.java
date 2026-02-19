package ejercicio3.model;

import java.io.*;

public class Archivos {

    public Archivos() {
    }

    public void copiarArchivo(File rutaOrigen, File rutaDestino){

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaOrigen));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(rutaDestino))) {

            String linea;
            while ((linea = bufferedReader.readLine()) != null){
                //Copiamos la linea en el archivo destino
                bufferedWriter.write(linea);

                //Aplicamos el salto de linea de readLine()
                bufferedWriter.newLine();
            }

            System.out.println("el archivo se ha copiado correctamente");

        }catch (IOException | NullPointerException e){
            System.out.println("Error de lectura del archivo");
        }
    }
}

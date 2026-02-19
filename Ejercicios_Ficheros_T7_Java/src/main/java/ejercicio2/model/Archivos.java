package ejercicio2.model;

import java.io.*;

public class Archivos {
    public Archivos() {
    }

    public int contarPalabra(File path, String palabra){

        int contador = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            //Leemos linea por linea el archivo
            String linea;

            while ((linea = bufferedReader.readLine()) != null){
                //System.out.println(linea);

                //reemplazamos culaquier cos que no se una letra/número por espacio
                String lineaLimpia = linea.replaceAll("[^a-zA-Z0-9áéíóúÁÉÍÓÚñÑ ]", " ");

                //Almacenamos cada palabra en un array
                String[] palabras = lineaLimpia.split("\\s+");

                for (String item: palabras){
                    if (item.equalsIgnoreCase(palabra)){
                        contador++;
                    }
                }
            }

        }catch (IOException | NullPointerException e){
            System.out.println("Error al leer el archivo " + e.getMessage());
            return -1; //Devolvemos -1
        }

        return contador;
    }
}

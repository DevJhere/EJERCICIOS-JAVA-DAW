package ejercicio8.model;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class Archivos {

    public Archivos() {
    }

    public void analizarTexto(File path){
        //Leemos el Archivo
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String linea;
            int contadorPalabras = 0;

            //Hashmap para almecenar los datos
            HashMap<String, Integer> mapaFrecuencias = new HashMap<>();

            while ((linea = bufferedReader.readLine()) != null){
                //Limpieza de lineas
                String lineaLimpia = linea.toLowerCase().replaceAll("[^a-zA-Z0-9áéíóúÁÉÍÓÚñÑ ]", " ");

                //Almacenamos cada palabra en un Array
                String[] palabras = lineaLimpia.split("\\s+");
                for (String item:palabras){
                    if (!item.trim().isEmpty()){
                        contadorPalabras++;
                        /*if (!mapaFrecuencias.containsKey(item)){
                            mapaFrecuencias.put(item, 1);
                        }else {
                            //Almacenamos las cantidades anteriores
                            int cantidadAnterior = mapaFrecuencias.get(item);
                            //Agregamos +1  a la cantidad
                            mapaFrecuencias.put(item, cantidadAnterior+1);
                        }*/

                        //Metodo pro
                        mapaFrecuencias.put(item, mapaFrecuencias.getOrDefault(item, 0) + 1);
                    }
                }

            }

            System.out.println("Número total de palabras: " + contadorPalabras);
            System.out.println("Las 5 palabras más frecuentes: ");

            //Utilizamos Stream
            mapaFrecuencias.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(5)
                    .forEach(entrada -> {
                        System.out.println("- " + entrada.getKey() + ": " + entrada.getValue() + " veces");
                    });

        }catch (FileNotFoundException e){
            System.out.println("Archivo no existe");
        }catch (IOException | NullPointerException e){
            System.out.println("Error de lectura del archivo");
        }
    }
}

package ejercicio9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    /*⏭️ Ejercicio 9: El Gestor de Configuraciones (Properties)
    * Crea a mano (Click derecho > Nuevo Archivo) un archivo llamado config.properties en tu carpeta de recursos.
    Escribe dentro estas dos líneas:
    * usuario=admin
    idioma=es
    * Crea un programa en Java que lea ese archivo, extraiga el valor de usuario y el valor de idioma, y los imprima por consola.*/

    public static void main(String[] args) throws IOException {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Ruta archivos: ");
        String ruta = sc.nextLine();

        Properties properties = new Properties();

        try (FileReader reader = new FileReader(ruta)){

            //Cargamod archivo Propierties
            properties.load(reader);

            //Exatreamos y guardamos valores
            String usuario = properties.getProperty("usuario");
            String idioma = properties.getProperty("idioma");

            System.out.println("Configuración cargada: ");
            System.out.println("- Usuario: " + usuario);
            System.out.println("- Idioma: " + idioma);

        }catch (FileNotFoundException e){
            System.out.println("Error. Archivo no existe.");
        }catch (IOException | NullPointerException e){
            System.out.println("Error lectura archivo de configuración.");
        }
    }
}

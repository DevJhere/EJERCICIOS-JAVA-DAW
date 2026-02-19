package ejercicio7.model;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Archivos {
    public Archivos() {
    }

    public void exploradorArchivos(File path){

        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy HH:mm");

        if (path.isDirectory()){
            //Almacenamos todo lo que hay en el directorio en un array
            File[] contenido = path.listFiles();

            //Validación en caso de se null
            if (contenido != null){

                //Recorremos todo el contenido con un forEach
                for (File item:contenido){

                    String fechaFormateada = sdf.format(new Date(item.lastModified()));
                    if (item.isFile()){
                        System.out.println("-" + " [ARCHIVO] " + item.getName() + "("+item.length()+" bytes)" + " - Última modificación: " + fechaFormateada );
                    } else if (item.isDirectory()) {
                        System.out.println("-" + " [DIRECTORIO] " + item.getName() + " - Última modificación: " + fechaFormateada );

                        exploradorArchivos(item);
                    }
                }
            }
        }else {
            System.out.println("Error: la ruta no existe o no es un directorio.");
        }
    }
}

package ejercicio4.model;

import java.io.File;

import java.util.Date;

public class Archivos {

    public Archivos() {
    }

    public void informacionArchivo(File path) {

        if (path.isFile() && path.exists()){

            // Tamaño archivo
            long tamanioArchivo = path.length();

            //Última modificación
            long modificacion = path.lastModified();
            Date fecha = new Date(modificacion);

            //Permisos
            boolean lectura = path.canRead();
            boolean escritura = path.canWrite();
            boolean ejecucion = path.canExecute();

            //Archivo oculto
            boolean oculto = path.isHidden();

            //Ruta Absoluta
            String rutaAbsoluta = path.getAbsolutePath();

            //Nombre ruta
            String nombreRuta = path.getPath();
            System.out.println("Información del archivo: " + nombreRuta + ": ");

            System.out.printf("""
                    - Tamaño: %d
                    - Última modficiación: %s
                    - Permisos: Lectura(%b), Escritura(%b), Ejecución(%b)
                    - Archivo Oculto: %b
                    - Ruta Absoluta: %s
                    """, tamanioArchivo, fecha, lectura, escritura, ejecucion, oculto, rutaAbsoluta);
        }
    }
}

package ejercicios.ficheros;

import java.io.File;

public class Main {
    public static void main(String[] args) {


        File ls = new File("src/main/resources/mis_documentos");

        // --- ZONA DE DIAGNÓSTICO ---
        System.out.println("--- DIAGNÓSTICO ---");
        System.out.println("1. Ruta que busca Java: " + ls.getAbsolutePath());
        System.out.println("2. ¿Existe el fichero?: " + ls.exists());
        System.out.println("3. ¿Es un directorio?:  " + ls.isDirectory());
        System.out.println("-------------------");

        if (!ls.exists()){
            System.out.println("Directorio no existe. Se creó con éxito");
            boolean creado = ls.mkdirs(); //true
            if(creado) System.out.println("✅ Carpeta 'mis_documentos' creada. ¡Métele archivos y vuelve a ejecutar!");

        }

        listarDirectorio(ls, "");
    }

    public static void listarDirectorio(File directorio, String tabulacion) {
        if (directorio.isDirectory()) {
            //Se obtiene todo lo que hay dentro del directorio en un array
            File[] contenido = directorio.listFiles();

            //Validamos en caso de ser null -> Evitamos NullPointer en caso de no tener permisos
            if (contenido != null){
                //Recorremos el contenido con un forEach
                for (File item : contenido) {
                    if (item.isFile()) {
                        //IMPRIMIMOS su nombre si es un fichero.
                        System.out.println(tabulacion + "Fichero : " + item.getName());
                    } else if (item.isDirectory()) {
                        //Es un DIRECTORIO entramos en ella (Nombre)
                        System.out.println(tabulacion + "Directorio: " + item.getName());

                        //Llamamos a la función recursiva
                        listarDirectorio(item,tabulacion + "\t"); //Método se llama a sí mismo con la subcarpeta
                    }
                }
            }

        }
    }
}

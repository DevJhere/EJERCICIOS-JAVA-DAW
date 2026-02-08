package ejercicio2;

import ejercicio2.controller.Coleccion;
import ejercicio2.model.Audio;
import ejercicio2.model.Libro;
import ejercicio2.model.Multimedia;
import ejercicio2.model.Video;

import java.util.ArrayList;
import java.util.Scanner;

/*
    * Desarrollar una aplicación para la gestión de una colección multimedia. Todo
    elemento multimedia tiene 5 características; identificador, titulo, autor, tamaño,
    formato. Adicionalmente cada uno de los elementos tendrán:
    a. Libro (ISBN, número de páginas)
    b. Video (director, actores)
    c. Audio (duración, soporte)
    La aplicación deberá poder manejar cualquier tipo de objeto, dando la posibilidad de:
    1. Añadir a la colección (preguntara que tipo de objeto y los elementos
    correspondientes) a. Los datos serán pedidos por consola b. Una vez añadido el
    programa mostrará una confirmación de que el elemento está bien añadido
    2. Eliminar de la colección a. Se pedirá el identificador del elemento a eliminar b.
    Una vez eliminado el programa mostrará una confirmación de que el elemento
    está bien eliminado
    3. Listar elementos a. Video b. Audio c. Todos
    4. Salir
    Los listados mostrarán información completa de los elementos en cuestión. La
    restricción que se pone a la colección es que no se pueden añadir elementos con el
    mismo id.
    (MODIFICACION)
    Dentro del menú, poner tres opciones nuevas:
    1. Buscar por autor: introduciré el nombre de un autor y me dirá el título de todos
    los libros de tenga
    2. Buscar por actor: se introducirá el nombre de un actor y se mostrará el título de
    todas las películas donde aparezca
    3. Buscar por director: se introducirá el nombre de un director y s emostarán todas
    las películas que tenga */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Coleccion coleccion = new Coleccion();
        int opcion;

        //Menú
        do {
            System.out.println("===== GESTOR MULTIMEDIA ====");
            System.out.println("1. Agregar  a la colección: ");
            System.out.println("2. Eliminar elemento: ");
            System.out.println("3. Listado y búsqueda de elementos: ");
            System.out.println("4. Salir: ");
            System.out.println("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); //Limpiamos Buffer

            switch (opcion) {
                case 1 -> {
                    System.out.println("¿Que tipo de elemento es: ?");
                    System.out.println("1. Video");
                    System.out.println("2. Audio");
                    System.out.println("3. Libro");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Introduce ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Formato: ");
                    String formato = sc.nextLine();

                    //Creamos objeto con datos especificos
                    Multimedia nuevoElemento = null;

                    if (tipo == 1) { //Video
                        System.out.println("Director: ");
                        String director = sc.nextLine();
                        System.out.print("Actores (separados por comas): ");
                        String actoresEntrada = sc.nextLine();
                        //Como agregamos una lista de elementos separados por comas vamos a transformar esa lista en un ArraList
                        ArrayList<String> listaActores = new ArrayList<>();

                        //Cortamos el texto separados por comas usando split
                        String[] actores = actoresEntrada.split(",");

                        //Iteramos con un for para ir agregando los actores a la lista
                        for (String actor: actores){
                            listaActores.add(actor.trim()); // .trim() elimina los espacios desde el principio hasta el final
                        }

                        //Pasamos todos lo elementos a Video
                        nuevoElemento = new Video(id, titulo, autor, formato, director, listaActores);

                    }else if (tipo == 2) { //Audio
                        System.out.println("Duración: ");
                        String duracion = sc.nextLine();
                        System.out.println("Soporte: ");
                        String soporte = sc.nextLine();
                        nuevoElemento = new Audio(id, titulo, autor, formato, duracion, soporte);

                    }else if (tipo == 3) {
                        System.out.println("ISBN: ");
                        String isbn = sc.nextLine();
                        System.out.println("Número de páginas: ");
                        int paginas = sc.nextInt();
                        nuevoElemento = new Libro(id, titulo, autor, formato, paginas, isbn);
                    }

                    //Agregamos a la Coleccion
                    if (nuevoElemento != null){
                        boolean exito =  coleccion.agregar(nuevoElemento);
                        if (exito){
                            System.out.println("Elemento agregado correctamente");
                        }else {
                            System.out.println("Error. Elemento no se agregó correctamente");
                        }
                    }else {
                        System.out.println("Error. Elemento no existe");
                    }

                }

                case 2 -> {
                    System.out.println("Introduce ID del elemento a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();

                    if (coleccion.eliminar(idEliminar)){
                        System.out.println("Elemento eliminado correctamente");
                    }else {
                        System.out.println("Error. Elemento no se eliminó correctamente. ID no existe");
                    }
                }

                case 3 -> {
                    // SUB-MENÚ para listados y búsquedas
                    System.out.println("\n--- LISTADOS Y BÚSQUEDAS ---");
                    System.out.println("1. Listar Videos");
                    System.out.println("2. Listar Audios");
                    System.out.println("3. Listar Libros");
                    System.out.println("4. Buscar Libros por Autor");
                    System.out.println("5. Buscar Películas por Director");
                    System.out.println("6. Buscar Películas por Actor");
                    System.out.println("7. Listar videos por Titulos");
                    System.out.println("8. Listar toda la coleccion");
                    int subOpcion = sc.nextInt();
                    sc.nextLine(); // Limpieza buffer

                    switch (subOpcion) {
                        case 1 -> coleccion.listarVideo();
                        case 2 -> coleccion.listarAudio();
                        case 3 -> coleccion.listarLibro();
                        case 4 -> {
                            System.out.println("Ingresa nombre Autor: ");
                            String autorBuscar = sc.nextLine();
                            coleccion.buscarPorAutor(autorBuscar);
                        }
                        case 5 -> {
                            System.out.println("Ingresa nombre Director: ");
                            String directorBuscar = sc.nextLine();
                            coleccion.buscarPorDirector(directorBuscar);
                        }
                        case 6 -> {
                            System.out.println("Ingresa nombre Actor: ");
                            String actorBuscar = sc.nextLine();
                            coleccion.buscarPorActor(actorBuscar);
                        }

                        case 7 -> coleccion.listarVideoPorTitulo();
                        case 8 -> coleccion.listarTodoColeccion();

                        default -> System.out.println("Opcion incorrecta");

                    }
                }

                case 4 -> {
                    System.out.println("Saliendo... ¡Hasta pronto! 👋");
                }

                default -> System.out.println("Opción no valida");
            }

        }while(opcion != 4);

    }
}

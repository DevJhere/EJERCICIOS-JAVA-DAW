package ejercicio2.controller;

import ejercicio2.model.Audio;
import ejercicio2.model.Libro;
import ejercicio2.model.Multimedia;
import ejercicio2.model.Video;

import java.util.HashMap;
import java.util.Set;

public class Coleccion implements IGestor {
    private HashMap<Integer, Multimedia> listaMultimedia;

    //Constructor
    public Coleccion() {
        listaMultimedia = new HashMap<>();
    }


    @Override
    public boolean agregar(Multimedia multimedia) {
        if (listaMultimedia.containsKey(multimedia.getId())){
            return false;
        }
        listaMultimedia.put(multimedia.getId(), multimedia);
        return true;
    }

    @Override
    public boolean eliminar(int id) {
        return listaMultimedia.remove(id) !=null; //true
    }

    @Override
    public void listarVideo() {
        System.out.println("==== LISTA DE VIDEOS ====");
        for (Multimedia multimedia: listaMultimedia.values()){
            // ¿Es de tipo Video?
            if (multimedia instanceof Video){
                multimedia.mostrardDatos();
                System.out.println("--------------------------");
            }

        }
    }

    public void listarVideoPorTitulo(){
        System.out.println("==== LISTA DE VIDEOS - TITULO ====");
        listaMultimedia.values().stream() // 1. Convertimos la lista en un flujo de datos
                .filter(multimedia -> multimedia instanceof Video) //Filtramos datos que sean tipo Video (Lambda)
                .map(Multimedia::getTitulo) //3. Obtenemos solo el titulo
                .forEach(System.out::println); //Imprimimos con forEach + referencia
    }

    @Override
    public void listarAudio() {
        System.out.println("==== LISTA DE AUDIO ====");
        for (Multimedia multimedia: listaMultimedia.values()){
            if (multimedia instanceof Audio){
                multimedia.mostrardDatos();
                System.out.println("-------------------------");
            }
        }
    }

    public void listarTodoColeccion(){
        System.out.println("==== LISTA DE TODA LA COLECCION ====");
        listaMultimedia.values()
                .forEach(Multimedia::mostrardDatos);

    }

    @Override
    public void listarLibro() {
        System.out.println("==== LISTA DE LIBRO ====");
        for (Multimedia multimedia: listaMultimedia.values()){
            if (multimedia instanceof Libro){
                multimedia.mostrardDatos();
                System.out.println("-----------------------");
            }
        }

    }

    @Override
    public void buscarPorAutor(String autor) {

        listaMultimedia.values().stream() //Ponemos en fila los elementos
                .filter(multimedia -> multimedia instanceof Libro) //Es un Libro
                .filter(multimedia -> multimedia.getAutor().equalsIgnoreCase(autor)) //Buscamos autor
                .forEach(Multimedia::mostrardDatos); //Imprimimos resultados

    }

    @Override
    public void buscarPorDirector(String director) {
        for (Multimedia multimedia: listaMultimedia.values()){
            if (multimedia instanceof Video){
                if (((Video) multimedia).getDirector().equals(director)){
                    multimedia.mostrardDatos();
                }
            }
        }
    }

    @Override
    public void buscarPorActor(String actor) {
        for (Multimedia multimedia: listaMultimedia.values()){
            if (multimedia instanceof Video){
                if (((Video) multimedia).getActores().contains(actor)){
                    multimedia.mostrardDatos();
                }
            }
        }
    }

}

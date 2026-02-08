package ejercicio2.controller;

import ejercicio2.model.Multimedia;

public interface IGestor {
    //Métodos interfaz
    boolean agregar(Multimedia multimedia);
    boolean eliminar(int id);
    void listarVideo();
    void listarAudio();
    void listarLibro();
    void buscarPorAutor(String autor);
    void buscarPorDirector(String director);
    void buscarPorActor(String actor);

}

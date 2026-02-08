package ejercicio2.model;

import java.util.ArrayList;

public class Video extends Multimedia{
    private String director;
    private ArrayList<String> actores;

    //Constructor
    public Video() {
    }

    public Video(int id, String titulo, String autor, String tamanioFormato, String director, ArrayList<String> actores) {
        super(id, titulo, autor, tamanioFormato);
        this.director = director;
        this.actores = actores;
    }

    //getters and setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    //Funcionalidades

    @Override
    public void mostrardDatos() {
        super.mostrardDatos();
        System.out.println("Director: " + director);
        System.out.println("Actores: " + actores);
    }
}

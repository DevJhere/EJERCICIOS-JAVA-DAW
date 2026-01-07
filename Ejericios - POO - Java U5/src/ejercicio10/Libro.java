package ejercicio10;

public class Libro {

    //Atributos
    private String titulo, autor, ISBN;

    private boolean disponible = true;

    //Constructor
    public Libro(){

    }
    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "(" + autor + ")" + " ISBN: " + ISBN;
    }

    //Metodos Auxiliares
    public void prestar(){
        this.disponible = false;
    }

    public void devolver(){
        this.disponible = true;
    }

    public boolean estaDisponible(){
        return disponible;
    }
}

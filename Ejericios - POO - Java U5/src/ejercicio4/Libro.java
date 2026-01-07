package ejercicio4;

public class Libro {

    //Atributos
    private String titulo = "Sin titulo", autor = "Desconocido";
    private int numeroPaginas = 0;

    //Constructor
    public Libro () {

    }

    public Libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro (String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}

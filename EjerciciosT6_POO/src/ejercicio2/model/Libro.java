package ejercicio2.model;

public class Libro extends  Multimedia{
    //Atributos
    private String isbn;
    private int numPaginas;

    //Constructor
    public Libro(){}

    public Libro(int id, String titulo, String autor, String tamanioFormato, int numPaginas, String isbn) {
        super(id, titulo, autor, tamanioFormato);
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    //Getters y Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrardDatos() {
        super.mostrardDatos();
        System.out.println("ISBN: " + isbn);
        System.out.println("Numero de paginas: " + numPaginas);
    }
}

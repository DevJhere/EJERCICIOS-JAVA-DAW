package ejercicio2.model;

public abstract class  Multimedia {
    //Atributos
    private int id;
    private String titulo, autor, tamanioFormato;

    //Constructores
    public Multimedia() {
    }

    public Multimedia(int id, String titulo, String autor, String tamanioFormato) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tamanioFormato = tamanioFormato;
    }

    //Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getTamanioFormato() {
        return tamanioFormato;
    }

    public void setTamanioFormato(String tamanioFormato) {
        this.tamanioFormato = tamanioFormato;
    }

    //Funcionalidades
    public void mostrardDatos(){
        System.out.printf("""
                Id: %d
                Titulo: %s
                Autor: %s
                Formato: %s
                """, id, titulo, autor, tamanioFormato);
        System.out.println("---------------------");
    }
}

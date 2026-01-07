package ejercicio10;

public class Prestamo {

    //Atributos
    private Libro libro;
    private Usuario usuario;
    private String fechaPrestamo;

    //Constructor

    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString() {
        return "✓ Préstamo realizado el " + fechaPrestamo +
                " | Libro: " + libro.getTitulo() +
                " | Usuario " + usuario.getNombre();
    }
}

package ejercicio2.model;

public class Audio extends Multimedia{
    private String duracion, soporte;

    //Constructor.
    public Audio() {
    }

    public Audio(int id, String titulo, String autor, String tamanioFormato, String soporte, String duracion) {
        super(id, titulo, autor, tamanioFormato);
        this.soporte = soporte;
        this.duracion = duracion;
    }

    //Getters y setters
    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    //Funcionalidades
    @Override
    public void mostrardDatos() {
        super.mostrardDatos();
        System.out.println("Soporte: " + soporte);
        System.out.println("Duracion: " + duracion);
    }
}

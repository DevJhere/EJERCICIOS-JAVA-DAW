package ejercicio1.model;

public abstract class Llamada {

    //Atributos
    private long numeroOrigen, numeroDestino;
    private int duracion;
    private double costeSegundo, coste;

    //Constructores
    public Llamada() {
    }

    public Llamada(long numeroOrigen, long numeroDestino, int duracion) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
    }

    //Getters y Setters
    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCosteSegundo() {
        return costeSegundo;
    }

    public void setCosteSegundo(double costeSegundo) {
        this.costeSegundo = costeSegundo;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }


    //Metodos - Funcionalidades
    public abstract void costeTotal();

    public void mostrarDatos(){
        System.out.printf("""
                Numero Origen: %d
                Numero Destino: %d
                Duracion: %d
                Coste: %.2f
                """, getNumeroOrigen(), getNumeroDestino(), getDuracion(), getCoste());    }
}

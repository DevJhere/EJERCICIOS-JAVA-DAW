package ejercicio1.model;

public class Provincial extends Llamada{
    //Constructor
    public Provincial() {
    }

    public Provincial(long numeroOrigen, long numeroDestino, int duracion) {
        super(numeroOrigen, numeroDestino, duracion);
        setCosteSegundo(0.15);
        costeTotal();
    }

    //Funcionalidades
    @Override
    public void costeTotal() {
        setCoste(getDuracion() * getCosteSegundo());
    }
}

package ejercicio1.model;

public class Local extends Llamada{
    //Atributos

    //Constructor
    public Local() {
    }

    public Local(long numeroOrigen, long numeroDestino, int duracion) {
        super(numeroOrigen, numeroDestino, duracion);
        setCosteSegundo(0);
        //Automatizamos la ejecución del coste total.
        costeTotal();
    }

    //Metodos - Funcionalidades
    @Override
    public void costeTotal() {
        setCoste(getDuracion() * getCosteSegundo());
    }

}

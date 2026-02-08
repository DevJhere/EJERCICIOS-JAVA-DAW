package ejercicio1.model;

public class Nacional extends Llamada{
    //Atributos
    private int franja;

    //Constructor
    public Nacional() {
    }

    public Nacional(long numeroOrigen, long numeroDestino, int duracion, int franja) {
        super(numeroOrigen, numeroDestino, duracion);
        //Validamos cuando se introducen número fuera de rango
        if (franja <= 0 || franja > 3){
            this.franja = 3;
        }else {
            this.franja = franja;
        }

        costeTotal();
    }

    //Funcionalidades
    @Override
    public void costeTotal() {
        //En funcion de la franja se aplica un coste u otro
        switch (franja){
            case 1 -> {
                setCosteSegundo(0.20);
                setCoste( getCosteSegundo()* getDuracion());
            }
            case 2 -> {
                setCosteSegundo(0.25);
                setCoste(getCosteSegundo() * getDuracion());
            }
            case 3 -> {
                setCosteSegundo(0.30);
                setCoste(getCosteSegundo() * getDuracion());
            }
        }
    }
}

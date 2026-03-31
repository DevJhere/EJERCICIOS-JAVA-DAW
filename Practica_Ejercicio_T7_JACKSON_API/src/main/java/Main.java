
import controller.Gestor;
import model.Pokemon;



public class Main {
    public static void main(String[] args) {
        Gestor gestorPokemon = new Gestor();

        Pokemon miPokemon = gestorPokemon.obtenerPokemon("Pikachu");
        System.out.println(miPokemon);
    }
}

import controller.GestorPokemon;
import model.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        GestorPokemon gestorPokemon =  new GestorPokemon();

        System.out.println("====== BUSCADOR DE POKÉMON ========");

        gestorPokemon.buscarPokemon("gengar");


        //Lista Pokémon
        List<String> misNombresPokemon = Arrays.asList("pikachu", "charizard", "mewtwo", "gengar", "snorlax", "bulbasaur", "squirtle", "ditto", "eevee", "lucario");


        System.out.println();
        System.out.println("====== MI EQUIPO POKÉMON ======");
       for (Pokemon item: gestorPokemon.equipoAleatorioPokemon(misNombresPokemon)){
           System.out.println(item);
       }
    }
}


import controller.GestorPokemon;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        GestorPokemon gestorPokemon =  new GestorPokemon();

        System.out.println("====== BUSCADOR DE POKÉMON ========");

        gestorPokemon.buscarPokemon("pikachu");
    }
}


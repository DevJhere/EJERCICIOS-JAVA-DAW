package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Pokemon;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorPokemon {

    private String urlPokeAPI = "https://pokeapi.co/api/v2/pokemon/";

    public void buscarPokemon(String nombrePokemon) {
        String url = urlPokeAPI + nombrePokemon.toLowerCase(); // Accedemos a la URL API + el nombre pokemon (Controlando Mayúsculas)

        try {

            //Realizamos petición
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                //Obtenemos el texto JSON
                String json = response.body();

                //Instanciamos GSON
                Gson gson = new Gson();
                Pokemon miPokemon = gson.fromJson(json, Pokemon.class);

                System.out.println("Has atrapado un: " + miPokemon.getName() + "!");
                System.out.println("Datos técnicos: " + miPokemon.toString());

                //Almacenamos la información obtenida en el JSON devuelto

                Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create(); // 1. Configuramos Gson para que escriba el JSON "bonito" (con tabulaciones y saltos de línea)

                try (FileWriter writer = new FileWriter(miPokemon.getName() + ".json")) {

                    //Pasamos el objeto a invertir y flujo de escritura
                    gsonPretty.toJson(miPokemon, writer);
                    System.out.println("¡" + miPokemon.getName() + " ha sido capturado y guardado en " + miPokemon.getName()+ ".json!");
                    System.out.println("Tipo principal: " + miPokemon.getTypes().getFirst().getType().getName());
                } catch (IOException e) {
                    System.out.println("Error al guardar en el PC: " + e.getMessage());
                }


            } else {
                // Si el código NO es 200 (ej: 404), mostramos qué nos ha devuelto la API realmente
                System.out.println("❌ Error de la API. Código de estado: " + response.statusCode());
                System.out.println("La API nos ha respondido esto: " + response.body());
            }

        } catch (
                IOException | InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Error al buscar el Pókemon: " + e.getMessage());
        }
    }

    public Pokemon obtenerPokemon(String nombrePokemon) {
        String url = urlPokeAPI + nombrePokemon.toLowerCase();
        Gson gson = new Gson();
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200){
                String json = response.body();
                return gson.fromJson(json, Pokemon.class);
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    //Método Equipo Pokémon
    public List<Pokemon> equipoAleatorioPokemon(List<String> candidatosPokemon){
        List<Pokemon> miEquipo = new ArrayList<>();

        //Lista candidatos desordenada
        Collections.shuffle(candidatosPokemon);

        for (int i = 0; i < 6; i++) {
            //Sacamos el nombre de la lista de candidatos (usando la 'i')
            String nombreCandidato = candidatosPokemon.get(i);

            //Llamamos a la API y GUARDAMOS el Pokémon en una variable
            Pokemon pokemonCapturado = obtenerPokemon(nombreCandidato);
            if ( pokemonCapturado != null){
                miEquipo.add(pokemonCapturado);
            }
        }

        return miEquipo;
    }
}

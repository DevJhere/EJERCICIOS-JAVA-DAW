package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Pokemon;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Gestor {
    private String urlPokeAPI = "https://pokeapi.co/api/v2/pokemon/";

    public Pokemon obtenerPokemon(String nombrePokemon) {
        String url = urlPokeAPI + nombrePokemon.toLowerCase();

        //Instanciamos Objeto Jackson
        ObjectMapper mapper = new ObjectMapper();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200){
                String json = response.body();

                //MAGIA DE JACKSON: Leemos el JSON y lo convertimos a Objeto
                return mapper.readValue(json, Pokemon.class);

            }



        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Error al buscar el Pókemon: " + e.getMessage());
        }

        return null;
    }

    public void guardarPokemon(Pokemon pokemon){
        ObjectMapper mapper = new ObjectMapper();

        // Escribe el objeto directamente en un archivo con formato bonito
        try {
            File archivo = new File(pokemon.getName() + "_jackson.json");
            mapper.writerWithDefaultPrettyPrinter().writeValue(archivo, pokemon);

            System.out.println("¡ " + pokemon.getName() + " guardado con éxito!");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}

package controller;

import com.google.gson.Gson;
import model.Pokemon;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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

            if (response.statusCode() == 200){
                //Obtenemos el texto JSON
                String json = response.body();

                //Instanciamos GSON
                Gson gson = new Gson();
                Pokemon miPokemon = gson.fromJson(json, Pokemon.class);

                System.out.println("Has atrapado un: " + miPokemon.getName() + "!");
                System.out.println("Datos técnicos: " + miPokemon.toString());
            }else {
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
}

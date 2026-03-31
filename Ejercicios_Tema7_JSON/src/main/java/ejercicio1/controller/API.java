package ejercicio1.controller;


import ejercicio1.model.RandomUser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class API {

    private String urlBase = "https://randomuser.me/api/";

    public void consultaAPI() {

        ObjectMapper mapper = new ObjectMapper();

        try {
            //Conexion con el cliente Http
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(urlBase))
                    .GET()
                    .build();

            //Obtenemos respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200){
                RandomUser miRandomUser = mapper.readValue(response.body(), RandomUser.class);
                miRandomUser.getResults().getFirst().mostrarDatos();
            }else {
                System.out.println("Error en la conexión. Código: " + response.statusCode());
            }


        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

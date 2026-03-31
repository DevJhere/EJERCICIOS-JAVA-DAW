package ejercicio6.controller;

import com.google.gson.Gson;
import ejercicio6.model.Result;
import ejercicio6.model.Trivial;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GestionAPI {

    public void consultaTrivial(){
        String urlAPI = "https://opentdb.com/api.php?amount=3&type=multiple";
        Gson gson = new Gson();
        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlAPI))
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200){
                Trivial trivial = gson.fromJson(response.body(), Trivial.class);

                System.out.println("Respuesta a pregunta: ");

                for (Result item:trivial.getResults()){
                    item.mostrarPreguntaLimpia();
                }
            }



        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

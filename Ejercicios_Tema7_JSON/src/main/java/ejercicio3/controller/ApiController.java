package ejercicio3.controller;

import com.google.gson.Gson;
import ejercicio2.model.Producto;
import ejercicio3.model.ProductoRespuesta;

import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiController {

    private String urlBase = "https://dummyjson.com/products/";

    public void buscarProductoID(int id){

        String urlDinamica = urlBase + id;
        Gson gson = new Gson();

        try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlDinamica))
                .GET()
                .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200){

                Producto producto = gson.fromJson(response.body(), Producto.class);

                System.out.println("=== PRODUCTO ENCONTRADO ===");
                System.out.println("- Titulo: " + producto.getTitle());
                System.out.println("- Descripción: " + producto.getDescription());
                System.out.println("- Categoria: " + producto.getCategory());

            } else if (response.statusCode() == 404) {
                System.out.println("El producto con el ID " + id + " no existe.");
            } else {
                System.out.println("Error en la conexión. Código: " + response.statusCode());
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}

package ejercicio2.controller;

import com.google.gson.Gson;

import ejercicio2.model.Producto;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GestorApi {

    private String urlBase = "https://dummyjson.com/products?limit=5";

    public void listarProductos() {

        Gson gson = new Gson();

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlBase))
                    .GET()
                    .build();


            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JSONObject objetoListaProductos = new JSONObject(response.body());
                JSONArray arrayProductos = objetoListaProductos.getJSONArray("products");

                for (int i = 0; i < arrayProductos.length(); i++) {
                    JSONObject listaJSON = arrayProductos.getJSONObject(i);

                    Producto producto = gson.fromJson(
                            listaJSON.toString(),
                            Producto.class
                    );

                    producto.mostrarInformacion();
                }
            }else {
                System.out.println("Error en la conexión. Código: " + response.statusCode());
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

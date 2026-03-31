package ejercicio4.controller;

import com.google.gson.Gson;
import ejercicio4.model.Post;
import ejercicio4.model.User;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    //Peticiones al clientes
    public void mostrarPostYUsuario(){
        String urlPost = "https://jsonplaceholder.typicode.com/posts/2";
        Gson gson = new Gson();
        HttpClient cliente = HttpClient.newHttpClient();

        try {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlPost))
                    .GET().build();
            HttpResponse<String> response = cliente.send(request,HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200){
                Post post = gson.fromJson(response.body(), Post.class);

                //variables IdUsuario y Tittle
                long idUsuario = post.getUserId();
                String tituloPost = post.getTitle();

                //Petición a userID
                String urlUserId = "https://jsonplaceholder.typicode.com/users/" + idUsuario;


                HttpRequest newRequest = HttpRequest.newBuilder()
                        .uri(URI.create(urlUserId))
                        .GET().build();
                HttpResponse<String> newResponse = cliente.send(newRequest, HttpResponse.BodyHandlers.ofString());

                if (newResponse.statusCode() == 200){

                    User user = gson.fromJson(newResponse.body(), User.class);

                    System.out.println("=== BÚSQUEDA ENCONTRADA ===");
                    System.out.printf("""
                            Título Post: %s
                            Nombre del Usuario: %s
                            Ciudad del Usuario: %s
                            """, post.getTitle(), user.getName(), user.getAddress().getCity() );
                }
            }

        }catch (IOException | InterruptedException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


}

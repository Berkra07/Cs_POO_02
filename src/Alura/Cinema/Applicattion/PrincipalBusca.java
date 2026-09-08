package Alura.Cinema.Applicattion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?i=tt3896198&apikey=de09bb7f"))
                .build();

        HttpResponse<String > response = client
                .send (request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

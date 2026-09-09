package Alura.Cinema.Applicattion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o filme que voce deseja buscar");
        var busca = sc.nextLine();
        String endereco ="https://www.omdbapi.com/?t=" + busca + "&apikey=de09bb7f";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String > response = client
                .send (request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

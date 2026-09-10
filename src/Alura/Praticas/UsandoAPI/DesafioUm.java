package Alura.Praticas.UsandoAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner pesquisa = new Scanner(System.in);
        System.out.println("Digite o nome do Livro: ");
        var livro = pesquisa.nextLine();

        var chave = "AIzaSyD-1xGvIhBzo8udSOyvAA0ZkNSDqgfqbGQ";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + livro + "&key=" + chave;


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();

        HttpResponse <String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}

package Alura.Praticas.UsandoAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Nome da cripto que deseja fazer a cotação ");
        var nomeCripto = sc.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl&ids=" + nomeCripto + "&x_cg_demo_api_key=CG-VeHCniR3fp4K4g5Qckz4EaAr";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();

        HttpResponse <String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());


    }
}

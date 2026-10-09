package Alura.Cinema.Applicattion;

import Alura.Cinema.entities.Titulo;
import Alura.Cinema.entities.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);


        try {
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Seu Titulo convertido: ");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e){
            System.out.println("Ocorreu um erro: ");
            System.out.println(e.getMessage());
        }

        System.out.println("Programa finalizado!");
    }
}

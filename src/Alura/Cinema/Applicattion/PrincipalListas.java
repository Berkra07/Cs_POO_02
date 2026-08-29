package Alura.Cinema.Applicattion;

import Alura.Cinema.entities.Filme;
import Alura.Cinema.entities.Series;
import Alura.Cinema.entities.Titulo;

import java.util.ArrayList;

import java.util.Collections;

public class PrincipalListas {
    public static void main(String[] args) {


        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(5);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);

        var filmeFavorito = new Filme("Django Livre", 2020);
        filmeFavorito.avalia(10);

        Series lost = new Series("Lost", 2000);
        lost.avalia(5);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeFavorito);
        lista.add(lost);

        for(Titulo item: lista){
            System.out.println("\n" + item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificação " + filme.getClassificacao() + "\n");
            }
            else if (item instanceof Series ){
                System.out.println(" --> Isso é uma serie");
            }
        }



        ArrayList <String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Kioto");
        buscaPorArtista.add("Zendaia");
        buscaPorArtista.add("Pascal");

        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
    }
}

package Alura.Cinema.Applicattion;

import Alura.Cinema.entities.Filme;
import Alura.Cinema.entities.Series;
import Alura.Cinema.entities.Titulo;

import java.util.ArrayList;

public class PrincipalListas {
    public static void main(String[] args) {


        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeFavorito = new Filme("Django Livre", 2020);
        Series lost = new Series("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeFavorito);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item: lista){
            System.out.println(item);
        }
    }
}

package Alura.Cinema.Applicattion;

import Alura.Cinema.entities.Calculos.CalculadoraDeTempo;
import Alura.Cinema.entities.Filme;
import Alura.Cinema.entities.Series;

public class Principal {
     static void main() {
         Filme poderosoChefao = new Filme();
         System.out.println("********************************************************************");
         System.out.println("--------DADOS DO FILME-------");
         poderosoChefao.setNome("O poderoso chefão");
         poderosoChefao.setAnoDeLancamento(1970);
         poderosoChefao.setDuracaoEmMinutos(120);


         poderosoChefao.exibeFichaTecnica();
         poderosoChefao.avalia(8);
         poderosoChefao.avalia(5);
         poderosoChefao.avalia(10);
         System.out.println("Total de avaliações: " + poderosoChefao.getTotalDeAvaliacoes());
         System.out.printf("Média de avaliações : %.1f%n ", poderosoChefao.pegaMedia());

         CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
         calculadora.inclui(poderosoChefao);

         Series lost = new Series();
         System.out.println("--------DADOS DA SERIE-------");
         lost.setNome("Lost");
         lost.setAnoDeLancamento(1992);
         lost.setTemporadas(6);
         lost.setEpisodiosPorTemporada(5);
         lost.setMinutosPorEpisodio(20);


                 lost.exibeFichaTecnica();
         lost.avalia(4);
         lost.avalia(4);
         lost.avalia(4);
         System.out.println("Total de avaliações: " + lost.getTotalDeAvaliacoes());
         System.out.printf("Média de avaliações : %.1f%n ", lost.pegaMedia());

         calculadora.inclui(lost);
         System.out.println("********************************************************************");

     }
}
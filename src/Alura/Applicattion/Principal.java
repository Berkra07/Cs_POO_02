package Alura.Applicattion;

import Alura.entities.Filme;
import Alura.entities.Series;
import java.util.Scanner;

public class Principal {
     static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você vai cadastrar um (1) Filme ou uma (2) Série?");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1) {
            Filme meuFilme = new Filme();

            System.out.println("Nome do filme:");
            meuFilme.setNome(scanner.nextLine());

            System.out.println("Ano de lançamento:");
            meuFilme.setAnoDeLancamento(scanner.nextInt());

            System.out.println("Duração em minutos:");
            meuFilme.setDuracaoEmMinutos(scanner.nextInt());

            System.out.println("Diretor:");
            scanner.nextLine();
            meuFilme.setDiretor(scanner.nextLine());

            meuFilme.exibeFichaTecnica();

            System.out.println("Digite uma avaliação:");
            meuFilme.avalia(scanner.nextDouble());
            System.out.println("Digite outra avaliação:");
            meuFilme.avalia(scanner.nextDouble());
            System.out.println("Digite mais uma avaliação:");
            meuFilme.avalia(scanner.nextDouble());

            System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        } else {
            Series minhaSerie = new Series();

            System.out.println("Nome da série:");
            minhaSerie.setNome(scanner.nextLine());

            System.out.println("Ano de lançamento:");
            minhaSerie.setAnoDeLancamento(scanner.nextInt());

            System.out.println("Número de temporadas:");
            minhaSerie.setTemporadas(scanner.nextInt());

            System.out.println("Episódios por temporada:");
            minhaSerie.setEpisodiosPorTemporada(scanner.nextInt());

            System.out.println("Minutos por episódio:");
            minhaSerie.setMinutosPorEpisodio(scanner.nextInt());

            minhaSerie.exibeFichaTecnica();

            System.out.println("Digite uma avaliação:");
            minhaSerie.avalia(scanner.nextDouble());
            System.out.println("Digite outra avaliação:");
            minhaSerie.avalia(scanner.nextDouble());
            System.out.println("Digite mais uma avaliação:");
            minhaSerie.avalia(scanner.nextDouble());

            System.out.println("Média das avaliações: " + minhaSerie.pegaMedia());
        }

        scanner.close();
    }
}
package Alura.Praticas.Implementacao.LojaVirtual.Application;

import Alura.Praticas.Implementacao.LojaVirtual.Entities.Livro;
import Alura.Praticas.Implementacao.LojaVirtual.Entities.Produto;

import java.util.Scanner;

public class App extends Produto {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Livro livro1 = new Livro();

        System.out.println("Digite o nome do Livro");
        livro1.setNome(sc.nextLine());

        System.out.println("Digite o autor do livro");
        livro1.setAutor(sc.nextLine());

        System.out.println("Digite o preço do livro");
        livro1.setPrice(sc.nextDouble());


        livro1.Descricao();

        System.out.printf("Preço final do Livro: R$ %.2f%n" ,livro1.calcularPrecoFinal());

    }
}

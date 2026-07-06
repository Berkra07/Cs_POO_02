package Alura.Praticas.Implementacao.LojaVirtual.Application;

import Alura.Praticas.Implementacao.LojaVirtual.Entities.Livro;
import Alura.Praticas.Implementacao.LojaVirtual.Entities.ProdutoFisico;
import java.util.Scanner;

public class App {
     static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CADASTRO ===");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Cadastrar Produto Físico");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        // Limpa o "Enter" que sobrou após ler o número da opção
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("\n--- CADASTRO DE LIVRO ---");
                Livro livro1 = new Livro();

                System.out.println("Digite o nome do Livro:");
                livro1.setTitulo(sc.nextLine());

                System.out.println("Digite o autor do livro:");
                livro1.setAutor(sc.nextLine());

                System.out.println("Digite o preço do livro:");
                livro1.setPrice(sc.nextDouble());

                livro1.Descricao();
                System.out.printf("Preço final do Livro: R$ %.2f%n", livro1.calcularPrecoFinal());
                break;

            case 2:
                System.out.println("\n--- CADASTRO DE PRODUTO FÍSICO ---");
                ProdutoFisico produtoFisico1 = new ProdutoFisico();

                System.out.println("Digite o tipo do produto: ");
                produtoFisico1.setTipoProduto(sc.nextLine());

                System.out.println("Digite a marca do produto: ");
                produtoFisico1.setMarca(sc.nextLine());

                System.out.println("Digite o peso do objeto:");
                produtoFisico1.setPeso(sc.nextDouble());

                System.out.println("Digite o valor do Produto:");
                produtoFisico1.setPrice(sc.nextDouble());

                produtoFisico1.Descricao();
                System.out.printf("Preço final do Produto: R$ %.2f%n", produtoFisico1.calcularPrecoFinal());
                break;

            default:
                System.out.println("Opção inválida! Encerrando o programa.");
                break;
        }

        sc.close();
    }
}
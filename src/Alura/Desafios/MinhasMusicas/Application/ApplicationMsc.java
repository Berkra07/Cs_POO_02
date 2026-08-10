package Alura.Desafios.MinhasMusicas.Application;

import Alura.Desafios.MinhasMusicas.Entities.Audio;
import Alura.Desafios.MinhasMusicas.Entities.Musica;
import Alura.Desafios.MinhasMusicas.Entities.PodCast;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationMsc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar nova música");
            System.out.println("2 - Cadastrar novo Podcast");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = sc.nextInt();
                sc.nextLine(); // Limpa o buffer do teclado

                switch (opcao) {
                    case 1:
                        System.out.println("\n--- Nova Música ---");
                        Musica musica1 = new Musica();

                        System.out.println("Digite o nome da música:");
                        musica1.setTitulo(sc.nextLine());

                        System.out.println("Digite o nome do álbum:");
                        musica1.setAlbum(sc.nextLine());

                        System.out.println("Digite o Cantor/Banda da música:");
                        musica1.setCantor(sc.nextLine());

                        System.out.println("\nMúsica cadastrada: " + musica1.getTitulo());
                        System.out.println("Cantor: " + musica1.getCantor());
                        System.out.println("Álbum: " + musica1.getAlbum());

                        executarAcaoPosCadastro(sc, musica1);
                        break;

                    case 2:
                        System.out.println("\n--- Novo Podcast ---");
                        PodCast podCast1 = new PodCast();

                        System.out.println("Digite o nome do Podcast:");
                        podCast1.setTitulo(sc.nextLine());

                        System.out.println("Digite o nome do(s) apresentador(es):");
                        podCast1.setApresentador(sc.nextLine());

                        System.out.println("Descrição do Podcast:");
                        podCast1.setDescricao(sc.nextLine());

                        System.out.println("\nPodcast salvo com sucesso: " + podCast1.getTitulo());
                        System.out.println("Apresentador: " + podCast1.getApresentador());
                        System.out.println("Descrição: " + podCast1.getDescricao());

                        executarAcaoPosCadastro(sc, podCast1);
                        break;

                    case 0:
                        System.out.println("Saindo do sistema...");
                        executando = false;
                        break;

                    default:
                        System.out.println("⚠️ Opção inválida! Digite um número do menu.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("⚠️ Entrada inválida! Por favor, digite apenas números.");
                sc.nextLine(); // Limpa a entrada incorreta que ficou no buffer
            }
        }
        sc.close();
    }

    private static void executarAcaoPosCadastro(Scanner sc, Audio audio) {
        boolean emAcao = true;

        while (emAcao) {
            System.out.println("\n--- Gerenciar: " + audio.getTitulo() + " ---");
            System.out.println("1 - Escutar");
            System.out.println("2 - Curtir ❤️");
            System.out.println("3 - Ver Estatísticas");
            System.out.println("0 - Voltar ao menu de cadastro");
            System.out.print("Escolha uma opção: ");

            try {
                int subOpcao = sc.nextInt();
                sc.nextLine();

                switch (subOpcao) {
                    case 1:
                        audio.reproduz();
                        System.out.println("\n▶️ Reproduzindo: " + audio.getTitulo() + "...");
                        System.out.println("Total de reproduções: " + audio.getTotalReproducoes());
                        break;

                    case 2:
                        audio.curte();
                        System.out.println("\n❤️ Você curtiu " + audio.getTitulo() + "!");
                        System.out.println("Total de curtidas: " + audio.getTotalCurtidas());
                        break;

                    case 3:
                        System.out.println("\n📊 Estatísticas de " + audio.getTitulo() + ":");
                        System.out.println("• Reproduções: " + audio.getTotalReproducoes());
                        System.out.println("• Curtidas: " + audio.getTotalCurtidas());
                        System.out.println("• Classificação: " + audio.getClassificacao() + " / 10 ⭐");
                        break;

                    case 0:
                        System.out.println("\nVoltando ao menu principal...");
                        emAcao = false;
                        break;

                    default:
                        System.out.println("⚠️ Opção inválida! Digite uma das opções numéricas informadas.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("⚠️ Entrada inválida! Por favor, digite apenas números.");
                sc.nextLine(); // Limpa o texto digitado incorretamente para evitar loop infinito
            }
        }
    }
}
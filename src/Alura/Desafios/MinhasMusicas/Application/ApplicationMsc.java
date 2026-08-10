package Alura.Desafios.MinhasMusicas.Application;

import Alura.Desafios.MinhasMusicas.Entities.Audio;
import Alura.Desafios.MinhasMusicas.Entities.Favoritos;
import Alura.Desafios.MinhasMusicas.Entities.Musica;
import Alura.Desafios.MinhasMusicas.Entities.PodCast;

import java.util.Scanner;


public class ApplicationMsc {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CADASTRO ===");
        System.out.println("1 - Logar nova musica");
        System.out.println("2 - Logar novo Podcast");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        sc.nextLine();


        switch (opcao){
            case 1:
                System.out.println("\n--- Nova Musica ---");
                Musica Musica1 = new Musica();

                System.out.println("Digite o nome da musica:");
                Musica1.setTitulo(sc.nextLine());

                System.out.println("Digite o nome do album :");
                Musica1.setAlbum(sc.nextLine());

                System.out.println("Digite o Cantor/Banda da musica:");
                Musica1.setCantor(sc.nextLine());

                System.out.println("Música: " + Audio.getTitulo());
                System.out.println("Album:" + Musica1.getAlbum());

                break;

            case 2:
                System.out.println("Novo Podcast");
                PodCast podCast1 = new PodCast();

                System.out.println("Digite o nome do PodCast:");
                podCast1.setTitulo(sc.nextLine());

                System.out.println("Digite o nome do(s) apresentadores :");
                podCast1.setApresentador(sc.nextLine());

                System.out.println("descrição do Podcast:");
                podCast1.setDescricao(sc.nextLine());
                System.out.println("Podcast salvo com sucesso: " + Audio.getTitulo());
                System.out.println("Apresentador: " + podCast1.getApresentador());
                System.out.println("descrição :" + podCast1.getDescricao());

                break;






        }
    }
}

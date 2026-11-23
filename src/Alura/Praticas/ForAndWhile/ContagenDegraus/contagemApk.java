package Alura.Praticas.ForAndWhile.ContagenDegraus;

import java.util.Scanner;

public class contagemApk {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus:");
        int degraus = sc.nextInt();

        for (int i= 1; i <= degraus; i ++){
            System.out.printf("subindo degraus %d%n", i);
        }
        System.out.println("voce chegou ao topo!");
    }
}

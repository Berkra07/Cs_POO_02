package Alura.Praticas.Implementacao.Tabuada.Application;

import Alura.Praticas.Implementacao.Tabuada.Entities.TabuadaMultiplicacao;

import java.util.Scanner;

public class TabuadaApk extends TabuadaMultiplicacao {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Olá, Digite o numero da tabuada que deseja saber!");
        numero = sc.nextInt();

        TabuadaMultiplicacao tabuada1 = new TabuadaMultiplicacao();
        tabuada1.mostrarTabuada(numero);

        sc.close();


    }
}

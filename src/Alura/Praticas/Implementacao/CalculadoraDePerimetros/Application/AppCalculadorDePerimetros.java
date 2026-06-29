package Alura.Praticas.Implementacao.CalculadoraDePerimetros.Application;

import Alura.Praticas.Implementacao.CalculadoraDePerimetros.Entities.CalculadoraSalaRetangular;

import java.util.Scanner;

public class AppCalculadorDePerimetros extends CalculadoraSalaRetangular {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double altura,largura;

        CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular();
        System.out.print("Olá. digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite a metragem de altura da sala: ");
        altura = sc.nextDouble();
        System.out.println("Digite a metragem da largura da sala: ");
        largura = sc.nextDouble();
        System.out.println("  Olá " + nome + ", aqui estão os dados da sua casa: \n " +
                "--------------------------------------------------------------------------------------------------- \n" +
                " DADOS DA CASA:");

        sala1.calcularArea(altura,largura);
        sala1.calcularPerimetro(altura,largura);

        System.out.println("--------------------------------------------------------------------------------------------------- \nb");

        sc.close();
    }
}

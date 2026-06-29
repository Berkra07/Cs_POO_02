package Alura.Praticas.Implementacao.CalculadoraDePerimetros.Application;

import Alura.Praticas.Implementacao.CalculadoraDePerimetros.Entities.CalculadoraSalaRetangular;

import java.util.Scanner;

public class AppCalculadorDePerimetros extends CalculadoraSalaRetangular {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double altura,largura;

        CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular();

        System.out.println("Digite a metragem de altura da sala: ");
        altura = sc.nextDouble();
        System.out.println("Digite a metragem da largura da sala: ");
        largura = sc.nextDouble();

        sala1.calcularArea(altura,largura);
        sala1.calcularPerimetro(altura,largura);


        sc.close();
    }
}

package Alura.Praticas.Implementacao.ConversorDeTemperatura.application;

import Alura.Praticas.Implementacao.ConversorDeTemperatura.Entities.ConversorTemperaturaPadrao;

import java.util.Scanner;

public class ApkConversor extends ConversorTemperaturaPadrao {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcoes, grausCelsius, grausfahrenheit ;
        System.out.println("Seja bem vindo ao Thermos ");
        System.out.println("--> 1 para converter de C° para F° \n \n--> 2 para converter de F° para C°");
        System.out.println("Digite a baixo:");
        ConversorTemperaturaPadrao C1 = new ConversorTemperaturaPadrao();
        opcoes = sc.nextInt();

        switch (opcoes){
            case 1:
                System.out.print("Digte o C° para ser convertido:");
                grausCelsius = sc.nextInt();
                C1.celsiusParaFahrenheit(grausCelsius);
                break;
            case 2:
                System.out.print("Digte o F° para ser convertido:");
                grausfahrenheit = sc.nextInt();
                C1.fahrenheitParaCelsius(grausfahrenheit);
                break;
        }

     sc.close();
    }
}

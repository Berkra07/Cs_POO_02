package Alura.Praticas.Implementacao.ConversorDeMoedas.Applicattion;

import Alura.Praticas.Implementacao.ConversorDeMoedas.entities.conversorDeMoeda;

import java.util.Scanner;

public class ConversorDeMoedasApp  {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double valorEmDolar;
        double cotacaoDoDolar;



        conversorDeMoeda conversor = new conversorDeMoeda();

        System.out.print("Olá. digite seu nome: ");
        String nome = sc.next();

        System.out.print("Digite o valor em dólar que deseja converter para real: ");
        valorEmDolar = sc.nextDouble();

        System.out.print("Digite a cotação do dólar hoje:");
        cotacaoDoDolar = sc.nextDouble();

        System.out.println("Olá " + nome);
        conversor.converterParaReal(valorEmDolar,cotacaoDoDolar);



       sc.close();
    }
}

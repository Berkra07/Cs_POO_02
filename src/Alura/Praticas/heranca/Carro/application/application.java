package Alura.Praticas.heranca.Carro.application;

import Alura.Praticas.heranca.Carro.entities.ModeloCarro;

import java.util.Scanner;

public class application {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Seja bem vindo ao Seu CarInfo!!\n");

        ModeloCarro MeuCarro1 = new ModeloCarro();

        System.out.println("digite o Modelo do Seu carro:");
        MeuCarro1.definirModelo(sc.nextLine());

        System.out.println("Digite o valor dos Seus 3 carros: \n");
        MeuCarro1.definirPreco(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.print("O carro é automático? (s/n): ");
        String respostaTeclado = sc.next(); // Captura o texto digitado

        boolean resultadoCambio;

        // Fazemos a conversão de String para Boolean aqui no controle do programa
        if (respostaTeclado.equalsIgnoreCase("n")) {
            resultadoCambio = false;
        } else {
            resultadoCambio = true;
        }

        // Agora, sim, enviamos o booleano puro (true/false) para o método do objeto
        MeuCarro1.cambioCarro(resultadoCambio);

        System.out.println("\n--- Informações Completas do Veículo ---");
        MeuCarro1.exibirInfo();

        sc.close();
    }
}

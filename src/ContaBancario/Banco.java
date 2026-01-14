package ContaBancario;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int opcao = 0;

        System.out.println("Digite o numero da conta:");
        int numeroConta = sc.nextInt();
        System.out.println("Digite o numero CPF do titular:");
        int titular = sc.nextInt();


        ContaBancaria contaBancaria = new ContaBancaria(numeroConta,titular);
        System.out.println("Seja bem vindo , seu saldo é de: " + contaBancaria.getSaldo() );

        System.out.println("Oque Deseja fazer?");

        while (opcao != 4){

            System.out.println("1- Depositar");
            System.out.println("2- sacar");
            System.out.println("3- Mostrar Saldo");
            System.out.println("4- Sair");

            opcao= sc.nextInt();

            if (opcao == 1){
                System.out.println("Valor para deposito: ");
                double valor= sc.nextDouble();
                contaBancaria.adicionarSaldo(valor);

            }
            if (opcao == 2){
                System.out.println("Valor para saque: ");
                double valor = sc.nextDouble();
                contaBancaria.resgatarSaldo(valor);

            }
            if (opcao == 3){
                System.out.println("Seu saldo é de: " + contaBancaria.getSaldo());
            }

        }

    }
}


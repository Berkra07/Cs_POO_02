package ContaBancario;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("Seja bem vindo ao seu banco! ");
        System.out.println("vamos criar uma conta:");
        System.out.println("Digite seu nome:");
        String titular = sc.nextLine();

        ContaBancaria contaUm = new ContaBancaria(titular);
        System.out.println("Olá  " + titular + ", o numero da sua conta é : " + contaUm.getNumeroConta());

        System.out.println("Saldo Disponivel: " + contaUm.getSaldo());

        System.out.println();

        int menu;
        double valor;
        do {

            System.out.println("=================Menu=================");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - sair");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Digite um valor para Depositar:");
                    valor = sc.nextDouble();
                    contaUm.depositar(valor);
                    System.out.println("Saldo atual: " + contaUm.getSaldo());
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja Sacar:");
                    valor = sc.nextDouble();
                    contaUm.sacar(valor);
                    System.out.println("Saldo atual: " + contaUm.getSaldo());
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (menu != 3);
    }
}
package BancoDigital.application;

import BancoDigital.entities.AplicativoBancario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double valor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao banco BK, vamos Criar uma conta: ");

        System.out.println("Enter account number: ");
        int numeroConta = sc.nextInt();

        System.out.println("Enter account holder: ");
        String nomeTitular = sc.next();

        AplicativoBancario appBK = new AplicativoBancario(numeroConta,nomeTitular);

        System.out.println("Account data:\n acont " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + valor );

        System.out.println("Is there na initial deposit (y/n)? ");
        String resposta = sc.next();

        if (resposta.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            valor = sc.nextInt();
            appBK.saldoInicial(valor);
        }

    }
}

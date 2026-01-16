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
        System.out.println("seu numero da conta é : " + contaUm.getNumeroConta());

    }
}
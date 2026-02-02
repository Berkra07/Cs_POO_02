package BancoDigital.application;

import BancoDigital.entities.AplicativoBancario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double valor ;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: "); //Numero da conta
        int numeroConta = sc.nextInt();

        System.out.println("Enter account holder: ");//Name
        String nomeTitular = sc.next();

        AplicativoBancario appBK = new AplicativoBancario(numeroConta,nomeTitular);


        System.out.println("Is there na initial deposit (y/n)? ");
        sc.nextLine(); // limpar buffer
        String resposta = sc.nextLine();

        if (resposta.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            valor = sc.nextInt();
            appBK.saldoInicial(valor);
        }

    }
}

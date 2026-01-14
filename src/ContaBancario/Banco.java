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

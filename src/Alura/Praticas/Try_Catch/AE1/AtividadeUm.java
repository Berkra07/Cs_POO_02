package Alura.Praticas.Try_Catch.AE1;

import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("vamos Dividir numeros !!");


            System.out.println("Digite o numero que deseja dividir:");
            int numeroUm = sc.nextInt();

            System.out.println("digite o numero de vezes que deseja dividir esse numero");
            int numeroDois = sc.nextInt();

            int divisao =  numeroUm / numeroDois;

            System.out.println("O numero " + numeroUm + " dividido por " + numeroDois + " resultara em : \n" + divisao);
        }
        catch (ArithmeticException e){
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("!! Não dá pra dividir um numero zero vezes né porra !!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");


        }
    }
}

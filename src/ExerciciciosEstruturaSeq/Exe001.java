package ExerciciciosEstruturaSeq;

import java.util.Scanner;

public class Exe001 {
    public static void main(String[] args) {

        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos
        Scanner scNum = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um numero para a soma: ");
        int numUm = scNum.nextInt();
        System.out.println("Digite o segundo numero ");
        int numDois=scNum.nextInt();

        int soma = numUm + numDois;
        System.out.println("SOMA = " + soma);

    }
}

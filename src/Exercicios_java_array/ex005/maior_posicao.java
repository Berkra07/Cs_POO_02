package Exercicios_java_array.ex005;

import java.util.Locale;
import java.util.Scanner;





/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
 */





public class maior_posicao {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n;

        n = sc.nextInt();

        Double [ ] vetor = new Double[n];

        for(int i = 0 ; i < n; i ++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        for ( int i = 0)



     sc.close();
    }
}
package Exercicios_java_array.ex004;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, quantPares;
        System.out.println("Quantos numeros voce vai digitar?: ");
         n = sc.nextInt();


        int [] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        quantPares= 0;
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < n; i++){
            if (vect[i] % 2 == 0){
                System.out.printf("%d  ", vect[i]);
                quantPares++;
            }
        }

        System.out.printf("\n QUANTIDADE DE PARES =  %d", quantPares);

        sc.close();
    }
}

package Exercicios_java_array.Ex001;

import java.util.Locale;
import java.util.Scanner;

public class numeros_negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");

        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("digite um numero menos que 10");
            return;
        }

        int[] vect = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            vect[i] = sc.nextInt();//laço for que faz com que seja salvo as alturas para serem usadas nas médias
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < n; i++) {
            if (vect [i] < 0 ){
                System.out.printf("%d\n", vect[i] );
            }
        }
        sc.close();
    }
}

package Exercicios_java_array.ex003;

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    static void main(String[] ignoredArgs) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n ,nmenores;
       double  alturaTotal,percentualMenores ;
        n = sc.nextInt();


        String [] name = new String[n];
        int [] idade= new int[n];
        Double [] Altura = new Double[n];

        for (int i = 0 ; i < n ; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1 );

            System.out.print("Nome: ");
                name[i] = sc.nextLine();

            System.out.print("Idade: ");
                idade[i] = sc.nextInt();

            System.out.print("Altura: ");
                Altura[i] = sc.nextDouble();
        }

        nmenores = 0;
        alturaTotal = 0.0;

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                nmenores++;}
        }

            for (double valor : Altura){
            alturaTotal += valor;
        }

        double media = alturaTotal / n;


        percentualMenores = ((double)nmenores / n) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for(int i=0; i<n; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", name[i]);
            }
        }

        sc.close();
    }
}

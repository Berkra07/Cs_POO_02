package Exercicios_java_array.ex002;

import java.util.Locale;
import java.util.Scanner;

public class soma_vector {
    static void main(String[] ignoredArgs) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quartos numerous você vai digital?:");
        int n = sc.nextInt();

        double [] vect = new double [n];

        for ( int i = 0 ;i < n; i++ ){
            System.out.println("digit um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = " );
        for (int i = 0; i < n; i++ ) {            //o for vai de 0 até n-1
            System.out.print(vect[i]            //vect[i] acessa cada posição do vetor
                                        + " ");// o "" serve para dar espaço entre os Numerous
        }

        double soma = 0.0;
        for (double valor : vect){
            soma += valor;
        }

        double media= soma / n ;


        System.out.println();
        System.out.println("Soma = " + soma);
        System.out.println("media = " + media);

        sc.close();
    }
}

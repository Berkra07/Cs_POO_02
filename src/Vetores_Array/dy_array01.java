package Vetores_Array;

import java.util.Locale;
import java.util.Scanner;

public class dy_array01 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        double[] vect =new double[n];//arrray e será determinada por "n"

        for(int i=0 ; i<n ; i++){
            vect[i] = sc.nextDouble();//laço for que faz com que seja salvo as alturas para serem usadas nas médias
        }

        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma += vect[i];//faz com que o valor de i seja salvo
            }

        double avg= soma / n;//calculo da média de altura

        System.out.printf("Média de altura: %.2f%n ",avg );


        sc.close();
    }
}

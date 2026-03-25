package Exercicios_java_array.ex006;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, numH, numF;
        double contAlturasMaior, contAlturasMenos, alturaTotal, alturaMedia;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            sc.nextLine();

            System.out.printf("Genero da %da pessoa (M ou F): ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        contAlturasMaior = alturas[0];
        contAlturasMenos = alturas[0];

        for (int i = 0; i < n; i++) {
            if (alturas[i] > contAlturasMaior) {
                contAlturasMaior = alturas[i];
            }
            if (alturas[i] < contAlturasMenos) {
                contAlturasMenos = alturas[i];
            }
        }

        numH = 0;
        numF = 0;
        alturaTotal = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i]== 'M' || genero[i]=='m') {
                numH++;
            }
            else {
                numF ++;
                alturaTotal += alturas[i] ;
            }
        }

        alturaMedia = alturaTotal / numF;

        System.out.printf("\nMenor altura = %.2f\n", contAlturasMenos);
        System.out.printf("Maior altura = %.2f\n", contAlturasMaior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturaMedia);
        System.out.printf("Numero de homens = %d\n", numH);


        sc.close();

    }
}

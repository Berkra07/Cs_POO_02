package Vetores_Array.ciotres;

import java.util.Scanner;
import java.util.Locale;
public class tictres {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        int n= sc.nextInt();
        sc.nextLine();

        product[] vect = new product[n];

        for (int i=0; i< vect.length; i++){
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Preço: ");
            double price = sc.nextDouble();
            sc.nextLine();
            vect[i]= new product(name,price);
        }

        double soma =0.0;
            for (int i=0; i<n; i++){
            soma += vect[i].getPrice();
        }

        double media = soma / vect.length;

        System.out.printf("Média de compras: %.2f%n", media);

        sc.close();
    }
}

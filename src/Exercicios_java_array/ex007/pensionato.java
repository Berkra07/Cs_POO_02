package Exercicios_java_array.ex007;

import java.util.Locale;
import java.util.Scanner;


import Exercicios_java_array.ex007.entites.Rent;

public class pensionato {
     static void main(String[] ignoredArgs) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;


        System.out.print("How many room will be rented? ");
        n = sc.nextInt();

        Rent[] vetor = new Rent[10];

        for (int i = 0; i < n; i++) {
            System.out.printf("\nRent #%d:\n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int nRoom = sc.nextInt();

            vetor[nRoom] = new Rent(name, email);
        }

        System.out.print("\n Busy rooms:\n");
        for(int i = 0; i < 10; i ++){
            if (vetor[i] != null){
                System.out.println(i + ": " + vetor[i]);
            }
        }

        sc.close();
    }
}

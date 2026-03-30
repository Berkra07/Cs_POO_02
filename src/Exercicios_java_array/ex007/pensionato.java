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

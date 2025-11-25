package Introducao_POO.application;

import Introducao_POO.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        Triangle x,y;
        x=new Triangle();
        y=new Triangle();

        System.out.println(" Enter the measures of triangle X:");
        x.a= sc.nextDouble();
        x.b= sc.nextDouble();
        x.c= sc.nextDouble();
        System.out.println(" Enter the measures of triangle Y:");
        y.a= sc.nextDouble();
        y.b= sc.nextDouble();
        y.c= sc.nextDouble();

        double areaX=x.area(); //Raiz quadrada para descobrir a area X
        double areaY= y.area(); //Raiz quadrada para descobrir a area Y

        System.out.printf("triangle X area: %.4f%n", areaX);
        System.out.printf("triagle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: Y");
        }
        else {
            System.out.println("Large area: Y");
        }
        sc.close();
    }
}

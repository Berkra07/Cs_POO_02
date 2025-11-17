package ExerciciciosEstruturaSeq;
import java.util.Locale;
import java.util.Scanner;

public class Exe002Raio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scraio=new Scanner(System.in);

        double R,A,pi=3.14159;

        System.out.println("Digite o raio para descobrir a àrea do circulo");
        R=scraio.nextDouble();

        A=pi * R * R;

        System.out.printf("A= %.4f\n", A);


    }
}

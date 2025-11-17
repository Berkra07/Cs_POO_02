package ExerciciciosEstruturaSeq;
import java.util.Locale;
import java.util.Scanner;

public class Exe002Raio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scraio=new Scanner(System.in);

        System.out.println("Digite o raio para descobrir a àrea do circulo");
        float raio= scraio.nextFloat();

        float area = 3.14159f *(raio*raio) ;

        System.out.printf("A área do círculo é: %.4f\n", area);


    }
}

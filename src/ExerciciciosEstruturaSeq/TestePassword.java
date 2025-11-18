package ExerciciciosEstruturaSeq;

import javax.xml.transform.Source;
import java.util.Scanner;

public class TestePassword {
    public static void main(String[] args) {

        Scanner scPassword = new Scanner(System.in);
        System.out.println("Digite a senha correta" );
        int senhaC=scPassword.nextInt();


        if (senhaC != 1107){
            System.out.println("not");
        }
        else {
            System.out.println("ok ");
        }
    }
}

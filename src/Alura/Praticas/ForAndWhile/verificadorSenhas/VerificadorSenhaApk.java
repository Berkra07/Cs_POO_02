package Alura.Praticas.ForAndWhile.verificadorSenhas;

import java.util.Scanner;

public class VerificadorSenhaApk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SENHA_CORRETA = "1290";




        for (int tentavias = 3; tentavias >0; tentavias --){
            System.out.println("Digite a senha:");
            String senha = sc.next();
            
            if (senha.equals(SENHA_CORRETA)){
                System.out.println("senha correta!");
            } else if (tentavias > 1) {
                System.out.println("senha incorreta voce tem " + (tentavias - 1) + " tentativas tente novamente");
            }
            else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }








    }
}

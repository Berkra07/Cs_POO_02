package Alura.Desafios.LeitorCEP;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite o cef da sua cidade sem pontuação:");
        var cep =sc.nextLine();


        BuscaCep consultaCep = new BuscaCep();
        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
        }catch (RuntimeException e
        ) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}

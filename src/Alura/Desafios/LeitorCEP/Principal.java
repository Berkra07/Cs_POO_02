package Alura.Desafios.LeitorCEP;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite o cef da sua cidade sem pontuação:");
        int cep =sc.nextInt();


        BuscaCep consultaCep = new BuscaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco(cep);
        System.out.println(novoEndereco);

    }
}

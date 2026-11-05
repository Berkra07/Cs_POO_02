package Alura.Desafios.LeitorCEP;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        BuscaCep consultaCep = new BuscaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("87970000");
        System.out.println(novoEndereco);

    }
}

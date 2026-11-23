package Alura.Praticas.ForAndWhile.NomeValido;

import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        do {
            System.out.println("Digite seu nome");
            nome = sc.nextLine();
            if (nome.length() < 3){
                System.out.println("digite um nome com pelomenos 3 caracteres");
            }
        }while (nome.length() < 3);
        System.out.println("Nome \""+ nome +"\" cadastrado com sucesso");
    }
}

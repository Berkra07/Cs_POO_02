package Alura.Desafios.AplicacaoDeCompras.Application;

import Alura.Desafios.AplicacaoDeCompras.Entities.CartaoCredito;
import Alura.Desafios.AplicacaoDeCompras.Entities.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble();

        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;

        while (sair != 0 ){
            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.next();

            System.out.println("Digite o valor: ");
            double valor = sc.nextDouble();

            Compra compra = new Compra(descricao,valor );
            Boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = sc.nextInt();
            } else  {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getCompras());
        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " +c.getValor());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }
}



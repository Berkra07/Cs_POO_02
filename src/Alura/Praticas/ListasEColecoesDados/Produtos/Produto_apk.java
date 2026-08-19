package Alura.Praticas.ListasEColecoesDados.Produtos;

import java.util.ArrayList;

public class Produto_apk {
    public static void main(String[] args) {

        Produto produto1 = new Produto("SSD");
        produto1.setPreco(250.00);
        produto1.setQuantidade(3);


        Produto produto2 = new Produto("Memoria RAM");
        produto2.setPreco(300.00);
        produto2.setQuantidade(5);


        Produto produto3 = new Produto("Processador");
        produto3.setPreco(1200.00);
        produto3.setQuantidade(2);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        System.out.println("Tamanho da lista " + listaProdutos.size());
        System.out.println("Primerio Produto " + listaProdutos.getFirst().toString());
        System.out.println(listaProdutos);
    }
}

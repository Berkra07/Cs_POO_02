package Alura.Praticas.ListasEColecoesDados.Produtos;

import java.util.ArrayList;

public class ProdutosApk {
    public static void main(String[] args) {


        Produto refrigerante = new Produto("Refrigerante");
        refrigerante.setPreco(12.00);
        Produto salgado = new Produto("Salgado");
        salgado.setPreco(6.00);
        Produto farinha = new Produto("Refrigerante");
        farinha.setPreco(8.55);
        Produto fruta = new Produto("Refrigerante");
        fruta.setPreco(11.23);
        Produto tempero = new Produto("Refrigerante");
        tempero.setPreco(3.68);

        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(refrigerante);
        lista.add(salgado);
        lista.add(farinha);
        lista.add(fruta);
        lista.add(tempero);

        double soma = 0;
        for (Produto item : lista) {
            soma += item.getPreco();
        }

        double media = soma / lista.size();

        System.out.println("o Total da compra foi de : R$" + soma);
        System.out.println("A media de valor gasto por produto na compra é : R$" + media);
    }
}

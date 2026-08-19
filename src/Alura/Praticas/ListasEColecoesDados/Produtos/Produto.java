package Alura.Praticas.ListasEColecoesDados.Produtos;

public class Produto {
    private final String produto;
    private double preco;
    private int quantidade;

    public Produto(String produto) {
        this.produto = produto;
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return "Produto : " + this.getProduto() + "(" + "Preço= " +  this.getPreco() + ")" ;
    }
}

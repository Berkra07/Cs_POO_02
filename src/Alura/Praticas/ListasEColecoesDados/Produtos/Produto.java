package Alura.Praticas.ListasEColecoesDados.Produtos;

public class Produto {
    private double preco;
    private final String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
}

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

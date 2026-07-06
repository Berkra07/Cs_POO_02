package Alura.Praticas.Implementacao.LojaVirtual.Entities;

public class Produto implements Calculavel {

    private String nome;
    private double price;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calcularPrecoFinal() {
        return price;
    }

}

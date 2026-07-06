package Alura.Praticas.Implementacao.LojaVirtual.Entities;

public class Produto implements Calculavel {

    private double price;


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

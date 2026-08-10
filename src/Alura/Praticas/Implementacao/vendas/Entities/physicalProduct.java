package Alura.Praticas.Implementacao.vendas.Entities;

public class physicalProduct extends Products   {
    public int peso;

    public double calcularPrecoFinal() {
        double taxaFrete = peso * 1.8;
        return priceBase + taxaFrete ;
    }
}

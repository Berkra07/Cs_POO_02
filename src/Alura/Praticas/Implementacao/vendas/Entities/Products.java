package Alura.Praticas.Implementacao.vendas.Entities;

public class Products implements Calculavel{
     String name;
     double priceBase;

    @Override
    public double calcularPrecoFinal() {
        return priceBase ;
    }
}

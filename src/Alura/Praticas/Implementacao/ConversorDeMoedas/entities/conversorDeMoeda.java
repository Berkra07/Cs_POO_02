package Alura.Praticas.Implementacao.ConversorDeMoedas.entities;

public class conversorDeMoeda implements ConversaoFinanceira {

    @Override
    public void converterParaReal(double valorDolar, double cotacaoDolar) {

        double valorEmReal = valorDolar * cotacaoDolar;
        System.out.println("O valor digitado em dólar foi de: $" + valorDolar + "\nEste valor em real é de: R$" + valorEmReal );

    }

}

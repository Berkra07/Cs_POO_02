package cotacaoDolar.entities;

public class CurrencyConverter {

    //Atributos
    public static final double IOF = 6.00;
    public static double DOLLAR_PRICE;
    public double dollars;


    //Metodos

    public double IOF_calculator(){
        return DOLLAR_PRICE * dollars * IOF /100;
    }

    public double valorTotal(){
        return (dollars * DOLLAR_PRICE)+ IOF_calculator();
    }
}

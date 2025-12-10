package cotacaoDolar.application;

import cotacaoDolar.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter currence = new CurrencyConverter();

        System.out.println("What is the dollar price? " );
        CurrencyConverter.DOLLAR_PRICE = sc.nextDouble();

        System.out.println("How many dollars wuill be bought? ");
        currence.dollars = sc.nextDouble();

        double total = currence.valorTotal();
        System.out.printf("Amount to be paid i reais = $%.2f%n", total);

        sc.close();
    }
}

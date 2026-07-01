package Alura.Praticas.Implementacao.ConversorDeTemperatura.Entities;

public class ConversorTemperaturaPadrao implements ConversorDeTemperatura {

    @Override
    public void celsiusParaFahrenheit(int celsius) {
        double CalculoFahrenheit = celsius *  1.8 + 32;
        System.out.println("O C° convetido para F° é: " + CalculoFahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(int fahrenheit) {
        double CalculoCelsius =( fahrenheit - 32) / 1.8;
        System.out.println("O F° convetido para C° é: " + CalculoCelsius);


    }
}

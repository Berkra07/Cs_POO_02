package Alura.Praticas.Implementacao.CalculadoraDePerimetros.Entities;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura) {
        double calculoArea  = altura *  largura ;
        System.out.println("A area da sua sala é : " + calculoArea + "m²");
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double caluloPerimetro = altura * 2 + largura * 2;
        System.out.println("O perímetro da sua sala é :" + caluloPerimetro + " metros");

    }
}

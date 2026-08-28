package Alura.Praticas.ListasEColecoesDados.Formas;

public class Quadrado implements Forma {

    private final double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

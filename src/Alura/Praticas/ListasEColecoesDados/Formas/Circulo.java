package Alura.Praticas.ListasEColecoesDados.Formas;

public class Circulo implements Forma {

    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

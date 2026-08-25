package Alura.Praticas.ListasEColecoesDados.Garagem;

public class Automovel {
    private final double valor;
    private final String modelo;
    private int kmRodado;
    private String tipoDeCombustivel;

    public Automovel(String modelo, double valor, int kmRodado) {
        this.modelo = modelo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKmRodado() {
        return kmRodado;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
}

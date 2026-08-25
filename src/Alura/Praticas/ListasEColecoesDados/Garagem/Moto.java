package Alura.Praticas.ListasEColecoesDados.Garagem;

public class Moto extends Automovel{
    private boolean freioAbs;
    private int cilindradas;


    public Moto(String modelo, double valor, int kmRodados) {
        super(modelo, valor,kmRodados);
    }

    public boolean isFreioAbs() {
        return freioAbs;
    }

    public void setFreioAbs(boolean freioAbs) {
        this.freioAbs = freioAbs;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void relatorioMoto(){
        System.out.println("relatório de Moto");
        System.out.println("modelo: " + getModelo());
        System.out.println("Valor : R$" + getValor());
        System.out.println("Quilômetros rodados: " + getKmRodado());
        System.out.println("Tipo de combustível:");


    }
}

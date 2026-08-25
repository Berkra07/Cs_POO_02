package Alura.Praticas.ListasEColecoesDados.Garagem;

public class Carro extends Automovel{
    private boolean arCondicionado;
    private boolean automatico;
    private int cavalosDePotencia;


    public Carro(String modelo, double valor, int kmRodado) {
        super(modelo, valor, kmRodado);
    }
}

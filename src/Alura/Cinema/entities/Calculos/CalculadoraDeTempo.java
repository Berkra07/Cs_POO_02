package Alura.Cinema.entities.Calculos;

import Alura.Cinema.entities.Titulo;

public class CalculadoraDeTempo extends Titulo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui (Titulo titulo){
        this.tempoTotal = titulo.getDuracaoEmMinutos() / 60;
        System.out.println("--> O tempo total para assistir a todos os filmes é de " + getTempoTotal() + " Horas.");
    }
}

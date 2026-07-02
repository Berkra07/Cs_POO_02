package Alura.Cinema.entities;

import Alura.Cinema.entities.Calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Series serie;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {

        return 0;
    }
}

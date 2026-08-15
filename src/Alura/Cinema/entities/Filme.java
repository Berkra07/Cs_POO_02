package Alura.Cinema.entities;
import Alura.Cinema.entities.Calculos.Classificavel;


public class Filme extends Titulo implements Classificavel {


    public Filme(String nome) {
        this.setNome(nome);
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "filme : " + this.getNome() + "(" + this.getAnoDeLancamento() + ")" ;
    }
}
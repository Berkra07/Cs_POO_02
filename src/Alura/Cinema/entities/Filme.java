package Alura.Cinema.entities;
import Alura.Cinema.entities.Calculos.Classificavel;


public class Filme extends Titulo implements Classificavel {
    private String diretor;
    


    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
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
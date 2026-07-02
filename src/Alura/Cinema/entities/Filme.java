package Alura.Cinema.entities;
import Alura.Cinema.entities.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia() / 2;
    }
}
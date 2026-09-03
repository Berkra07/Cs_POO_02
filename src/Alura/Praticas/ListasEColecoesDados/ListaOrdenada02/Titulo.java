package Alura.Praticas.ListasEColecoesDados.ListaOrdenada02;

public class Titulo implements Comparable<Titulo> {
     String nome;


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}

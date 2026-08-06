package Alura.Desafios.MinhasMusicas.Entities;

public class Audio {
    private static String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public static String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void curte(){
        this.totalCurtidas ++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }


}

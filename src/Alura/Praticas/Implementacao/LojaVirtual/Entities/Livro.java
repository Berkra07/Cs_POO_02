package Alura.Praticas.Implementacao.LojaVirtual.Entities;

public class Livro extends Produto{
    private String titulo;
    private String Autor;
    private static final double DESCONTO_FIXO = 0.30;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public  void Descricao(){
        System.out.println("Nome :" + (getTitulo()));
        System.out.println("Autor: " + getAutor());

    }

    @Override
    public double calcularPrecoFinal() {
        double valorDesconto = getPrice() * DESCONTO_FIXO;
        return getPrice() - valorDesconto;
    }
}

package Alura.Praticas.Implementacao.LojaVirtual.Entities;

public class Livro extends Produto{
    public String Autor;
    private static final double DESCONTO_FIXO = 0.30;


    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public  void Descricao(){
        System.out.println("Nome :" + getNome());
        System.out.println("Autor: " + getAutor());

    }

    @Override
    public double calcularPrecoFinal() {
        double valorDeconto = getPrice() * DESCONTO_FIXO;
        return getPrice() - valorDeconto;
    }
}

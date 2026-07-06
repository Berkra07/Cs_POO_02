package Alura.Praticas.Implementacao.LojaVirtual.Entities;

public class ProdutoFisico extends Produto{

    private String tipoProduto;
    private String marca;
    private double peso;


    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public  void Descricao(){
        System.out.println("Produto :" + getTipoProduto());
        System.out.println("Marca :" + getMarca());
        System.out.println("Peso :" + getPeso());

    }

    @Override
    public double calcularPrecoFinal() {
        double frete = getPeso() * 0.5;
        return getPrice() + frete;
    }
}

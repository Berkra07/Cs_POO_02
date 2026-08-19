package Alura.Praticas.ListasEColecoesDados.Produtos;

public class ProdutoPerecivel extends Produto{
    private int dataValidade;


    public ProdutoPerecivel(String produto) {
        super(produto);
    }

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }
}

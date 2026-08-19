package Alura.Praticas.ListasEColecoesDados.Produtos;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;


    public ProdutoPerecivel(String produto) {
        super(produto);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}

package Alura.Praticas.ListasEColecoesDados.Pessoa;

public record Pessoas(String nome, int idade) {

    @Override
    public String toString() {
        return "Pessoa : " + this.nome() + "(idade: " + this.idade() + ")";
    }
}

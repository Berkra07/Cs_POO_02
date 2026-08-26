package Alura.Praticas.ListasEColecoesDados.Animal;

public class Animal {
    private String nome;
    private final String sexo;
    private final boolean docil;

    public Animal(boolean docil, String sexo) {
        this.docil = docil;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDocil() {
        return docil;
    }

    public String getSexo() {
        return sexo;
    }
}

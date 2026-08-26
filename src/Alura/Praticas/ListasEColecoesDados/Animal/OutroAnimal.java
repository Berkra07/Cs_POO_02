package Alura.Praticas.ListasEColecoesDados.Animal;

public class OutroAnimal extends Animal{
    private String especie;

    public OutroAnimal(boolean docil, String sexo) {
        super(docil, sexo);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}

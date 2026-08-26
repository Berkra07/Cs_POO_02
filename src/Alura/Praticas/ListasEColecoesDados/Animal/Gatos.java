package Alura.Praticas.ListasEColecoesDados.Animal;

public class Gatos extends Animal{

    public Gatos(boolean docil, String sexo) {
        super(docil, sexo);
    }

    public void miar(){
        System.out.println("Miau miau!!");
    }
}

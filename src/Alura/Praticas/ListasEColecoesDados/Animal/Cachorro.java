package Alura.Praticas.ListasEColecoesDados.Animal;

public class Cachorro extends Animal{

    public Cachorro(boolean docil, String sexo) {
        super(docil, sexo);
    }

    public void sentar(){
        System.out.println("Sentado");
    }

    public void rlar(){
        System.out.println("Rolando");
    }
}

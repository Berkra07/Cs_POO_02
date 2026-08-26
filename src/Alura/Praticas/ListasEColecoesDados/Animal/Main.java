package Alura.Praticas.ListasEColecoesDados.Animal;

public class Main {
    public static void main(String[] args) {


        Cachorro dogUm = new Cachorro(true,"Macho");
        dogUm.setNome("tang");

        Animal Animal = (Animal) dogUm;

    }
}

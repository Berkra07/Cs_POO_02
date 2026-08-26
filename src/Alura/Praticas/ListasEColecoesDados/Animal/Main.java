package Alura.Praticas.ListasEColecoesDados.Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Cachorro dogUm = new Cachorro(true,"Macho");
        dogUm.setNome("tang");

        Cachorro dogDois = new Cachorro(true,"Fêmea");
        dogDois.setNome("Cacau");

        Gatos gatoUm = new Gatos(true, "Macho");
        gatoUm.setNome("Crianço");

        Gatos gatoDois = new Gatos(true, "Fêmea");
        gatoDois.setNome("Marrie");

        OutroAnimal AnimalUm = new OutroAnimal(false, "Macho");
        AnimalUm.setEspecie("Leão");


        ArrayList<Animal> lista = new ArrayList<>();
        lista.add(dogUm);
        lista.add(dogDois);
        lista.add(gatoUm);
        lista.add(gatoDois);
        lista.add(AnimalUm);

        for (Animal item : lista){



            if (item instanceof Cachorro){
                System.out.println("---------------------------------------- \nDados do animal: ");
                System.out.println("Nome: " + item.getNome());
                System.out.println("Sexo: " + item.getSexo());
                System.out.println("Animal é docil: " + item.isDocil());
                ((Cachorro) item).sentar();
                ((Cachorro) item).rolar();
            }
            else if (item instanceof Gatos){
                System.out.println("---------------------------------------- \nDados do animal: ");
                System.out.println("Nome: " + item.getNome());
                System.out.println("Sexo: " + item.getSexo());
                ((Gatos) item).miar();
            }
            else {
                System.out.println("---------------------------------------- \nDados do animal: ");
                System.out.println("Espécie: " + ((OutroAnimal) item).getEspecie());
                System.out.println("Sexo: " + item.getSexo());


            }
        }



    }
}

package Alura.Praticas.heranca.Animal.entities;

public class Cat extends Animal{

    @Override
    public void emitirSom(){
        super.emitirSom();
        System.out.println("miau miau");
    }

    public void arranharMovei(){
        System.out.println("Arranhar Moveis!");
    }

}
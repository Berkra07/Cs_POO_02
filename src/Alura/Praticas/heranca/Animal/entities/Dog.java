package Alura.Praticas.heranca.Animal.entities;

public class Dog extends Animal {

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Au,Au!");
    }

    public void abanarRabo(){
        System.out.println("abanando o rabo!");
    }
}

package Alura.Praticas.heranca.Animal.application;

import Alura.Praticas.heranca.Animal.entities.Cat;
import Alura.Praticas.heranca.Animal.entities.Dog;

public class Principal {
    static void main() {

        Cat cat = new Cat();
        cat.emitirSom();
        cat.arranharMovei();
        System.out.println("______________________________________________________");

        Dog dog = new Dog();
        dog.emitirSom();
        dog.abanarRabo();
    }
}

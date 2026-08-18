package Alura.Praticas.ListasEColecoesDados.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pessoas pessoa1 = new Pessoas("Leandro", 20);


        Pessoas pessoa2 = new Pessoas("Casablanca",20 );
//        pessoa2.setNome("Casablanca");
//        pessoa2.setIdade(20);

        Pessoas pessoa3 = new Pessoas("Juvandro", 39);
//        pessoa3.setNome("Juvandro");
//        pessoa3.setIdade(39);

        ArrayList<Pessoas> listaPessoas = new ArrayList<>();
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        System.out.println("tamanho da lista:" + listaPessoas.size());
        System.out.println("Primeira pessoa: " + listaPessoas.getFirst());
        System.out.println("lista de pessoas: " + listaPessoas);
    }
}

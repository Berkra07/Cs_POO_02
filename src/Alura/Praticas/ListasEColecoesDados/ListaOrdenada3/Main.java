package Alura.Praticas.ListasEColecoesDados.ListaOrdenada3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("F");
        listaPolimorfica.add("A");
        listaPolimorfica.add("K");
        System.out.println("ArrayList : " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Bernardo");
        listaPolimorfica.add("Akemi");
        listaPolimorfica.add("cleoceli");
        System.out.println("LinkedList: " + listaPolimorfica);


    }
}

package Alura.Praticas.ListasEColecoesDados.ListaOrdenada01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainListaOrdenada01 {
    public static void main(String[] args) {

        List <Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(12);
        lista.add(99);
        lista.add(3);
        lista.add(8);
        Collections.sort(lista);
        System.out.println(lista);
    }
}

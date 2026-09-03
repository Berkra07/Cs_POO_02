package Alura.Praticas.ListasEColecoesDados.ListaOrdenada02;

import java.util.ArrayList;
import java.util.List;

public class ApkListaOrdenadaTitulo {
    public static void main(String[] args) {

        Titulo titulo = new Titulo();
        titulo.setNome("zimbabuek");
        Titulo titulo1 = new Titulo();
        titulo1.setNome("Oasis");
        Titulo titulo2 = new Titulo();
        titulo2.setNome("Asa mortal");
        Titulo titulo3 = new Titulo();
        titulo3.setNome("Dead funk");



        List <Titulo> listaDeNomes = new ArrayList<>();
        listaDeNomes.add(titulo);
        listaDeNomes.add(titulo1);
        listaDeNomes.add(titulo2);
        listaDeNomes.add(titulo3);

        listaDeNomes.sort(Titulo::compareTo);
        System.out.println(listaDeNomes);
    }
}

package Alura.Praticas.API.DesafioDois;

import com.google.gson.Gson;

public class livroMain{
    public static void main(String[] args) {

        String livrosJson = """
                {
                   "titulo": "Admiravel mundo novo",
                   "autor": "Aldous Huxley",
                   "editora": "Biblioteca Azul"
                }
                """;

        Gson gsonLivro = new Gson();

        Livro livro = gsonLivro.fromJson(livrosJson , Livro.class);

        System.out.println("seu Livro:");
        System.out.println("Titulo: " + livro.titulo());
        System.out.println("Autor: " + livro.autor());
        System.out.println("Editora: " + livro.editora());


    }
}

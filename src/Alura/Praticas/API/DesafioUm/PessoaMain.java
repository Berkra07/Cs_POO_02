package Alura.Praticas.API.DesafioUm;

import com.google.gson.Gson;

public class PessoaMain {
    public static void main(String[] args) {

        String json = """
                {
                    "nome": "Nataly",
                    "idade": 21,
                    "cidade": "Nova Londrina"
                    }
                """;


        Gson gson = new Gson();

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println("Objeto Pessoa instanciado com sucesso:");
        System.out.println("Nome: " + pessoa.nome());
        System.out.println("Idade: " + pessoa.idade());
        System.out.println("Cidade: " + pessoa.cidade() );
    }
}

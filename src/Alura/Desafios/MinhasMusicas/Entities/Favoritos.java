package Alura.Desafios.MinhasMusicas.Entities;

public class Favoritos {


    public void inclui (Audio audio) {
        if (audio.getClassificacao() >= 10) {
            System.out.println(audio.getTitulo() + ", é considerado sucesso absoluto e preferido por todos!");
        }
        else if(audio.getClassificacao() >=5) {
            System.out.println(audio.getTitulo()  + ", tambem é um dos que está todo mundo ouvindo!");
        }
        else {
            System.out.println(audio.getTitulo() + ", Tem potencial de se tornar uma grande música no futuro!");
        }
    }


}

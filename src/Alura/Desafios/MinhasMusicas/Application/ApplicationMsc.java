package Alura.Desafios.MinhasMusicas.Application;

import Alura.Desafios.MinhasMusicas.Entities.Favoritos;
import Alura.Desafios.MinhasMusicas.Entities.Musica;


public class ApplicationMsc {
    static void main() {


        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("B.Y.B");
        minhaMusica.setCantor("System of a down");

        for (int i = 0; i < 10 ;i++ ){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 10; i ++){
            minhaMusica.curte();
        }


        Musica minhaMusica1 = new Musica();
        minhaMusica1.setTitulo("Senta e não para");
        minhaMusica1.setCantor("MC Don Ruan");

        for (int i = 0; i <100 ;i++ ){
            minhaMusica1.reproduz();
        }

        for (int i = 0; i < 100; i ++){
            minhaMusica1.curte();
        }

        Musica minhaMusica2 = new Musica();
        minhaMusica2.setTitulo("Bucetinha criminosa");
        minhaMusica2.setCantor("MC PH");

        for (int i = 0; i <1000 ;i++ ){
            minhaMusica2.reproduz();
        }

        for (int i = 0; i < 1000; i ++){
            minhaMusica2.curte();
        }


        Favoritos favoritos = new Favoritos();

        favoritos.inclui(minhaMusica);
        favoritos.inclui(minhaMusica1);
        favoritos.inclui(minhaMusica2);



    }
}

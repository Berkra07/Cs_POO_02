package Alura.Desafios.MinhasMusicas.Entities;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(getTotalReproducoes() > 20){
            return 10;
        }
        else if (getTotalReproducoes() > 10 ){
            return 5;
        }
        else {
            return 3;
        }
    }
}


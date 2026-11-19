package Alura.Praticas.Biblioteca.Entities;

public class Livros {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private char categoria;


    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public String OrganizarCategoria(char categoria) {
        if (categoria == 'F') {
            return "ficção";
        } else if (categoria == 'N') {
            return "Não-ficção";
        } else if (categoria == 'T') {
            return "Tecnologia";
        } else if (categoria == 'H') {
            return "Historia";
        } else{
            return "Sem opção";
        }
    }

    
}
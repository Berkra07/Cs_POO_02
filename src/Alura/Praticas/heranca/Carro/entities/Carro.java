package Alura.Praticas.heranca.Carro.entities;

public class Carro {

    private String modelo;
    private double precoUm;
    private double precoDois;
    private double precoTres;

    public void definirModelo (String modelo){
        this.modelo = modelo;
    }

    public void definirPreco (double precoUm, double precoDois, double precoTres){

        this.precoUm = precoUm;
        this.precoDois = precoDois;
        this.precoTres = precoTres;

    }



    private double calcularMenorPreco(){
        double menorPreco = precoUm;

        if (precoDois < menorPreco){
            menorPreco = precoDois;
        }
        if (precoTres <menorPreco){
            menorPreco = precoTres;
        }

        return menorPreco;
    }

    public double calcularMaiorPreco (){
        double maiorPreco = precoUm;

        if (precoDois > maiorPreco){
            maiorPreco = precoDois;
        }
        if (precoTres > maiorPreco){
            maiorPreco = precoTres;
        }

        return maiorPreco;

    }

    public void exibirInfo(){
        System.out.println("Modelo : " + modelo);
        System.out.println("Preço ano 1: " + precoUm);
        System.out.println("Preço ano 2: " + precoDois);
        System.out.println("Preço ano 3: " + precoTres);
        System.out.println("Menor valor dos 3 anos: " + calcularMenorPreco());
        System.out.println("Maior valor dos 3 anos: " + calcularMaiorPreco());


    }

}
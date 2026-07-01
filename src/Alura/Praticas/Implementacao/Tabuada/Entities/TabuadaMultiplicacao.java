package Alura.Praticas.Implementacao.Tabuada.Entities;

public class TabuadaMultiplicacao implements Tabuada {


    @Override
    public void mostrarTabuada(int numeroDaTabuada) {
        System.out.println("tabuada de multiplicação do " + numeroDaTabuada + " :");
        for (int i = 1 ; i <= 10 ; i++) {
            int resultado = numeroDaTabuada * i;
            System.out.println(numeroDaTabuada + " x " + i + " = " + resultado);
        }
    }
}
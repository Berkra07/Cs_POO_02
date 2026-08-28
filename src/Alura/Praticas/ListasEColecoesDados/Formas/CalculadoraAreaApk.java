package Alura.Praticas.ListasEColecoesDados.Formas;

import java.util.ArrayList;

public class CalculadoraAreaApk {
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(3.0));
        formas.add(new Quadrado(4.0));


        for (Forma forma : formas) {
            if (forma instanceof Circulo) {
                System.out.println("Área do Circulo: " + forma.calcularArea());
            } else if (forma instanceof Quadrado) {
                System.out.println("Área do Quadrado: " + forma.calcularArea());

            }

        }


    }
}

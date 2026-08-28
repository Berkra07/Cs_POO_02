package Alura.Praticas.ListasEColecoesDados.MaiorContaBancaria;

import java.util.ArrayList;

public class ContaBancariaApk {
    public static void main(String[] args) {

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria(1813, 19000.00));
        contas.add(new ContaBancaria(2726, 8000.00));
        contas.add(new ContaBancaria(2717, 50000.00));

        ContaBancaria contaMaiorSaldo = contas.getFirst();

        for (ContaBancaria maior : contas) {
            if (maior.saldoDaConta() > contaMaiorSaldo.saldoDaConta()) {
                contaMaiorSaldo = maior;
            }
        }


        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.numeroDaConta() +
                ", Saldo: " + contaMaiorSaldo.saldoDaConta());


    }
}

package Alura.Praticas.heranca.ContaBancaria.Application;

import Alura.Praticas.heranca.ContaBancaria.Entities.ContaBancaria;
import Alura.Praticas.heranca.ContaBancaria.Entities.ContaCorrente;

public class AplicationBanco {
    static void main() {

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();
        System.out.println("_____________________________________");
        // Realizando operações na conta-corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaBancaria();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();

    }
}

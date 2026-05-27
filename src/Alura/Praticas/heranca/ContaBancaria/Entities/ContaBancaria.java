package Alura.Praticas.heranca.ContaBancaria.Entities;

public class ContaBancaria {
    protected double saldo;

    public void sacar (double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado");
        }
        else {
            System.out.println("Valor indisponivel para saque");
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }




    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}


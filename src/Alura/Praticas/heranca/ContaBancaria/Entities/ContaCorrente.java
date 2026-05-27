package Alura.Praticas.heranca.ContaBancaria.Entities;

public class ContaCorrente extends ContaBancaria{

    private  double tarifaMensal;

    public void cobrarTarifaBancaria(){
        saldo -= tarifaMensal;
        System.out.println("tarifa mensal de : " + tarifaMensal + " cobrada. saldo atual " + saldo);
        }
    }


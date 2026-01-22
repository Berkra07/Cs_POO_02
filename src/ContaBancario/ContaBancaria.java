package ContaBancario;

import java.util.Random;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    //Construtores

    public ContaBancaria( String titular) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular inválido");
        }

        Random random = new Random();
        this.numeroConta = random.nextInt(4001) + 1000; // 1000 a 5000
        this.titular = titular.trim();
        this.saldo = 0.0;
    }

    //getters e setters

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular inválido");
        }
        this.titular = titular.trim();
    }

    public double getSaldo() {
        return saldo;
    }


    //METODOS

    public void depositar(double valor) {

        if (valor > 0) {
            this.saldo += valor;
        }
        else   {
            System.out.println("Valor incorreto");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
                this.saldo -= valor;
        }
        else  {
            System.out.println("Valor incorreto");
        }

    }
}
package ContaBancario;

public class ContaBancaria {
    private int numeroConta;
    private int titular;
    private double saldo;

    //Construtores

    public ContaBancaria(int numeroConta, int titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    //getters e setters

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getTitular() {
        return titular;
    }

    public void setTitular(int titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //METODOS

    public void adicionarSaldo(double saldo){
        this.saldo += saldo;
    }
    public void resgatarSaldo(double saldo){
        this.saldo -= saldo;
    }

}

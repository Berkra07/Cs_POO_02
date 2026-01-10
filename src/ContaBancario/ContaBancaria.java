package ContaBancario;

public class ContaBancaria {
    private int numeroConta;
    private int titular;
    private double saldo;

    //Construtores

    public ContaBancaria(double saldo, int numeroConta, int titular) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.titular = titular;
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

    public void AdcionarSaldo(int saldo){
        this.saldo =+ saldo;
    }
    public void resgatarSaldo(int saldo){
        this.saldo =- saldo;
    }

}

package BancoDigital.entities;

public class AplicativoBancario {

    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;

    public AplicativoBancario(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }


    public void saldoInicial (double valor){
        if (valor > 0) {
           this.saldoConta = valor;
        }
    }

    public void depositar (double valor){
        if (valor > 0){
        this.saldoConta += valor;
        }
    }

    public void Sacar(double valor){
        if (valor > 0 && valor <= saldoConta){
        this.saldoConta -= valor ;
        this.saldoConta -= 5;
        }
    }

}

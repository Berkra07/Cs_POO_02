package Udemy.Projects.BancoDigital.entities;

public class AplicativoBancario {

    private double saldoConta;


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

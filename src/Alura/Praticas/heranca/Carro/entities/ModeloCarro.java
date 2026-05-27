package Alura.Praticas.heranca.Carro.entities;

public class ModeloCarro extends Carro {
    private boolean automatico;

    public void cambioCarro (boolean automatico){
        this.automatico = automatico;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();// Chama o exibirInfo original da classe Carro

        if (this.automatico) {
            System.out.println("Câmbio: Automático");
        } else {
            System.out.println("Câmbio: Manual");
        }

    }
}

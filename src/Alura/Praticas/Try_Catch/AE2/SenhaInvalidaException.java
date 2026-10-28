package Alura.Praticas.Try_Catch.AE2;

public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }

}

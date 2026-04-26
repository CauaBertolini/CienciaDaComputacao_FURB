package exception;

public class PilhaVaziaException extends RuntimeException {
    public PilhaVaziaException() {
        super("Pilha está vazia");
    }
}

package exception;

public class FilaVaziaException extends RuntimeException {
    public FilaVaziaException() {
        super("Fila está vazia");
    }
}

package Exception;

public class MenorIgualAZeroException extends RuntimeException {
    public MenorIgualAZeroException() {
        super("O valor deve ser maior que zero");
    }
}

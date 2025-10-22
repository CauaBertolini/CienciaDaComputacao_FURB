package Exception;

public class ValorMenorIgualAZeroException extends RuntimeException {
    public ValorMenorIgualAZeroException() {
        super("Valor não pode ser menor que ou igual a zero.");
    }
}

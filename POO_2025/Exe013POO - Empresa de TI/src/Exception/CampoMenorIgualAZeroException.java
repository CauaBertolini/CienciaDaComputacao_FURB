package Exception;

public class CampoMenorIgualAZeroException extends RuntimeException {
    public CampoMenorIgualAZeroException() {
        super("Campo não pode ser menor igual a zero");
    }
}

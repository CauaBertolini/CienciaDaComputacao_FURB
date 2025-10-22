package Exception;

public class CampoVazioOuNuloException extends RuntimeException {
    public CampoVazioOuNuloException() {
        super("Campo não pode ser vazio ou nulo.");
    }
}

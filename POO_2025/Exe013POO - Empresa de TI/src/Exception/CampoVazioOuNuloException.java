package Exception;

public class CampoVazioOuNuloException extends RuntimeException {
    public CampoVazioOuNuloException() {
        super("O valor informado não pode ser nulo");
    }
}

package Exception;

public class CampoVazioException extends RuntimeException {

    public CampoVazioException(String campo) {
        super(campo + "não deve ser vazio");
    }
}

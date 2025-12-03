package exception;

public class ArgumentoNaoEhArquivoException extends IllegalArgumentException {
    public ArgumentoNaoEhArquivoException(String arquivo) {
        super("O caminho informado não é um arquivo: " + arquivo);
    }
}
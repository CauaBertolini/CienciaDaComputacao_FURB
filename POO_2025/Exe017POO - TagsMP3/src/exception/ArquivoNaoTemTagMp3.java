package exception;

public class ArquivoNaoTemTagMp3 extends IllegalArgumentException {
    public ArquivoNaoTemTagMp3(String arquivo) {
        super("O arquivo não possui metadados ID3v1 (TAG): " + arquivo);
    }
}

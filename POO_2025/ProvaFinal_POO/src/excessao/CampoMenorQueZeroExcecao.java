// Cauã Fernando Bertolini

package excessao;

public class CampoMenorQueZeroExcecao extends RuntimeException {
    public CampoMenorQueZeroExcecao() {
        super("Campo informado não pode ser menor que zero.");
    }
}

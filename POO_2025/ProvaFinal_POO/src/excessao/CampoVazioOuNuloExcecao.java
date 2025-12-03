// Cauã Fernando Bertolini

package excessao;

public class CampoVazioOuNuloExcecao extends RuntimeException {
    public CampoVazioOuNuloExcecao() {
        super("Campo não pode estar vazio");
    }
}

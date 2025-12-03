// Cauã Fernando Bertolini

package util;

import excessao.CampoMenorQueZeroExcecao;
import excessao.CampoVazioOuNuloExcecao;

public class ExcecaoUtil {

    public static boolean campoMenorQueZero(int valor) throws CampoMenorQueZeroExcecao {
        if (valor < 0) {
            throw new CampoMenorQueZeroExcecao();
        }
        return false;
    }

    public static boolean campoEstaVazioOuNulo(String campo) throws CampoVazioOuNuloExcecao {
        if (campo.isEmpty() || campo == null) {
            throw new CampoVazioOuNuloExcecao();
        } else {
            return false;
        }
    }

    public static boolean campoEstaVazioOuNulo(char campo) throws CampoVazioOuNuloExcecao {
        if (campo == ' ') {
            throw new CampoVazioOuNuloExcecao();
        } else {
            return false;
        }
    }
}

package Control;

import Exception.CampoVazioOuNuloException;
import Exception.CampoMenorIgualAZeroException;

public class Utilitario {

    public static boolean ValidarCampoVazioOuNulo(String campo) {
        if (campo == null || campo.isEmpty()) {
            throw new CampoVazioOuNuloException();
        }
        return true;
    }

    public static boolean CampoMenorIgualAZero(double campo) {
        if (campo <= 0) {
            throw new CampoMenorIgualAZeroException();
        }
        return true;
    }

}

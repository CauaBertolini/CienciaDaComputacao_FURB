package Exception;

public class Utilitario {

    public static boolean CampoVazioOuNulo(String campo) throws CampoVazioOuNuloException {
        if (campo.isEmpty() || campo == null) {
            throw new CampoVazioOuNuloException();
        }
        return false;
    }

    public static boolean ValorMenorIgualAZero(int valor) throws ValorMenorIgualAZeroException {
        if (valor <= 0) {
            throw new ValorMenorIgualAZeroException();
        }
        return false;
    }

    public static boolean ValorMenorIgualAZero(double valor) throws ValorMenorIgualAZeroException {
        if (valor <= 0) {
            throw new ValorMenorIgualAZeroException();
        }
        return false;
    }
}

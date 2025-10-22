package Exception;

public class Util {
    public static boolean campoMenorIgualAZero(double campo) throws MenorIgualAZeroException {
        if (campo <= 0) {
            throw new MenorIgualAZeroException();
        }
        return true;
    }
}

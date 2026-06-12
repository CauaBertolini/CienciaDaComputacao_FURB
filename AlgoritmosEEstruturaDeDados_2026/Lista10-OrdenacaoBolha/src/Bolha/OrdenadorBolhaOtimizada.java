package Bolha;

public class OrdenadorBolhaOtimizada<T extends Comparable<T>> extends OrdenadorAbstract<T> {

    @Override
    public void ordenar() {
        int i, j;
        int n = getInfo().length;
        T[] _info = getInfo();
        boolean trocou;

        for (i = (n-1); i >= 1; i--) {
            trocou = false;
            for (j = 0; j <= (i-1); j++) {
                if (getInfo()[j].compareTo(getInfo()[j+1])>0) {
                    trocar(j, (j+1));
                    trocou = true;
                }
            }
            if (!trocou) {
                return;
            }
        }
    }
}

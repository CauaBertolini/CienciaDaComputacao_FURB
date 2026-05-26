package Bolha;

public class OrdenadorBolha<T extends Comparable<T>> extends OrdenadorAbstract<T> {

    @Override
    public void ordenar() {
        int i, j;
        int n = getInfo().length;
        T[] _info = getInfo();

        for (i = (n-1); i >= 1; i--) {
            for (j = 0; j <= (i-1); j++) {
                if (getInfo()[j].compareTo(getInfo()[j+1])>0) {
                    trocar(j, (j+1));
                }
            }
        }
    }
}

package Bolha;

public class OrdenacaoQuickSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    private void quickSort(int inicio, int fim) {
        if (getInfo()[inicio].compareTo(getInfo()[fim]) < 0) {
            int idxPivo = particionar(inicio, fim);
            quickSort(inicio, idxPivo-1);
            quickSort(idxPivo+1, fim);
        }

    }

    private int particionar(int inicio, int fim) {
        int a = inicio;
        int b = (fim+1);
        T pivo = getInfo()[inicio];

        while (true) {

            do {
                a++;

            } while (a <= fim && (getInfo()[a].compareTo(pivo)<0));

            do {
                b--;

            } while (b >= inicio && (getInfo()[b].compareTo(pivo)>0));

            if (a >= b) {
                break;
            }

            trocar(a, b);
        }
        trocar(inicio, b);

        return b;

    }

    @Override
    public void ordenar() {
        int fim = getInfo().length;
        quickSort(0, fim);
    }
}

package Bolha;

public class OrdenadorMergesort<T extends Comparable<T>> extends OrdenadorAbstract<T> {

    @Override
    public void ordenar() {
        T info[] = getInfo();
        int fim = (info.length-1);
        mergeSort(0, fim);
    }

    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, fim, meio);
        }
    }

    private void merge(int inicio, int fim, int meio) {
        T[] info = getInfo();

        int tamanhoEsquerda = meio - inicio + 1;
        int tamanhoDireita = fim - meio;

        T[] esquerda = (T[]) new Comparable[tamanhoEsquerda];
        T[] direita = (T[]) new Comparable[tamanhoDireita];

        // Copiar dados
        for (int i = 0; i < tamanhoEsquerda; i++) {
            esquerda[i] = info[inicio + i];
        }

        for (int i = 0; i < tamanhoDireita; i++) {
            direita[i] = info[meio + 1 + i];
        }

        int i = 0, j = 0, k = inicio;

        // Merge
        while (i < tamanhoEsquerda && j < tamanhoDireita) {
            if (esquerda[i].compareTo(direita[j]) <= 0) {
                info[k] = esquerda[i];
                i++;
            } else {
                info[k] = direita[j];
                j++;
            }
            k++;
        }

        // Restante da esquerda
        while (i < tamanhoEsquerda) {
            info[k] = esquerda[i];
            i++;
            k++;
        }

        // Restante da direita
        while (j < tamanhoDireita) {
            info[k] = direita[j];
            j++;
            k++;
        }
    }
}

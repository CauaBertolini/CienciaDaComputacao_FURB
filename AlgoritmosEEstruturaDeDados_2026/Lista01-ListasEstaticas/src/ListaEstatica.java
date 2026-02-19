public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar() {
        int novoTamanho = info.length + 10;
        int[] novo = new int[novoTamanho];

        for (int i = 0; i < tamanho; i++ ) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(int valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        System.out.print("| ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(info[i] + " | ");
        }
        System.out.println();
    }

    public int buscar(int valor) {
        for(int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor) {

        int iRemove = buscar(valor);

        if (iRemove != -1) {
            for(int n = iRemove; n < tamanho; n++ ) {
                info[n] = info[n+1];
            }
            tamanho--;
        }

    }

    public void liberar() {
        info = new int[10];
        tamanho = 0;
    }

    public int obterElemento(int posicao) throws IndexOutOfBoundsException {
        try {
            return info[posicao];
        } catch (IndexOutOfBoundsException e) {
            throw  new IndexOutOfBoundsException();
        }
    }

    public boolean estaVazia() {
        return (tamanho == 0);
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getDimensão() {
        return info.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < tamanho; i++) {
            stringBuilder.append(info[i]);
            if (i == tamanho-1) {
                stringBuilder.append(".");
            } else {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}

public class ListaEstatica <T> {
    private Object[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new Object[10];
        tamanho = 0;
    }

    private void redimensionar() {
        int novoTamanho = info.length + 10;
        Object[] novo = new Object[novoTamanho];

        for (int i = 0; i < tamanho; i++ ) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(T valor) {
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

    public int buscar(T valor) {
        for(int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(T valor) {

        int iRemove = buscar(valor);

        if (iRemove != -1) {
            for(int n = iRemove; n < tamanho; n++ ) {
                info[n] = info[n+1];
            }
            tamanho--;
        }

    }

    public void liberar() {
        info = new Object[10];
        tamanho = 0;
    }

    @SuppressWarnings("unchecked")
    public T obterElemento(int posicao) throws IndexOutOfBoundsException {
        try {
            return (T)info[posicao];
        } catch (IndexOutOfBoundsException e) {
            throw  new IndexOutOfBoundsException();
        }
    }

    @SuppressWarnings("unchecked")
    public void inverter() {
        ListaEstatica<T> listaAuxiliar = new ListaEstatica<>();

        for (int i = tamanho-1; i >= 0; i--) {
            listaAuxiliar.inserir((T)info[i]);
        }

        info = listaAuxiliar.info;
    }

    public boolean estaVazia() {
        return (tamanho == 0);
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getDimensão() {
        return (int) info.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < tamanho; i++) {
            stringBuilder.append(info[i].toString());
            if (i == tamanho-1) {
                stringBuilder.append(".");
            } else {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}

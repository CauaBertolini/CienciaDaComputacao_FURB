package listaEncadeada;

public class ListaEncadeada<T> {

    private NoLista primeiro;

    public ListaEncadeada() {
        primeiro = new NoLista<T>();
        primeiro = null;

    }

    public void inserir(T valor) {
        NoLista<T> novoNoLista = new NoLista<>();
        novoNoLista.setInfo(valor);
        novoNoLista.setProximo(primeiro);
        this.primeiro = novoNoLista;
    }

    public void liberar() {
        NoLista noAtual = primeiro;
        while (noAtual.getProximo() != null) {
            NoLista proximo = noAtual.getProximo();
            noAtual.setProximo(null);
            noAtual = proximo;
        }
        primeiro = null;
    }

    public void retirar(T valor) {
        NoLista<T> noAtual = primeiro;
        NoLista<T> noAnterior = null;

        while(noAtual.getProximo() != null && !noAtual.getInfo().equals(valor)) {
            noAnterior = noAtual;
            noAtual = noAtual.getProximo();
        }

        if (!noAtual.equals(null)) {
            if (noAtual.equals(primeiro)) {
                this.primeiro = primeiro.getProximo();
            } else {
                noAnterior.setProximo(noAtual.getProximo());
            }
        }
    }

    public void exibir() {
        NoLista<T> primeiro = getPrimeiro();
        while (primeiro.getProximo() != null) {
            System.out.println(primeiro.getInfo());
            primeiro = primeiro.getProximo();
        }
    }

    public boolean estaVazia() {
        return (primeiro == null);
    }

    public NoLista<T> buscar(T valor) {
        NoLista<T> no = getPrimeiro();
        while (no.getProximo() != null) {
            if (no.getInfo().equals(valor)) {
                return no;
            }
        }
        return null;
    }

    public int obterComprimento() {
        int cont = -1;
        NoLista<T> no = getPrimeiro();
        while (no.getProximo() != null) {
            cont++;
            no = no.getProximo();
        }
        return cont;
    }

    public NoLista<T> obterNo(int idx) {
        int comprimento = obterComprimento();

        if (idx > comprimento || idx < -1) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + comprimento);
        }

        NoLista<T> no = getPrimeiro();

        if (idx >= 0) {
            int cont = 0;

            while (no.getProximo() != null) {
                if (cont == idx) {
                    return no;
                }

                cont++;
                no = no.getProximo();
            }
        } else {
            no = getPrimeiro();

            while (no.getProximo() != null) {
                no = no.getProximo();
            }

            return no;
        }

        return null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> no = primeiro;
        while (no != null) {
            sb.append(no.getInfo());
            sb.append(", ");
            no = no.getProximo();
        }
        return sb.toString();
    }
}

package listaEncadeada;

public class ListaEncadeada<T> {

    private NoLista primeiro;

    public ListaEncadeada() {
        primeiro = null;
    }

    public NoLista getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(valor);

        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public void retirar(T valor) {
        NoLista<T> noAtual = primeiro;
        NoLista<T> noAnterior = null;

        while(noAtual != null && !noAtual.getInfo().equals(valor)) {
            noAnterior = noAtual;
            noAtual = noAtual.getProximo();
        }

        if (noAtual != null) {
            if (noAtual == primeiro) {
                this.primeiro = primeiro.getProximo();
            } else {
                noAnterior.setProximo(noAtual.getProximo());
            }
        }
    }

    public void exibir() {
        NoLista<T> primeiro = getPrimeiro();
        while (primeiro != null) {
            System.out.println(primeiro.getInfo());
            primeiro = primeiro.getProximo();
        }
    }

    public boolean estaVazia() {
        return (primeiro == null);
    }

    public NoLista<T> buscar(T valor) {
        NoLista<T> no = getPrimeiro();
        while (no != null) {
            if (no.getInfo().equals(valor)) {
                return no;
            }
            no = no.getProximo();
        }
        return null;
    }

    public int obterComprimento() {
        int cont = -1;
        NoLista<T> no = getPrimeiro();
        while (no != null) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> no = primeiro;
        while (no.getProximo() != null) {
            sb.append(no.getInfo());
            sb.append(", ");
            no = no.getProximo();
        }
        return sb.toString();
    }
}

package ListaEncadeada;

public class ListaEncadeada<T> {

    private NoLista<T> primeiro;
    private NoLista<T> ultimo;

    public ListaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public NoLista<T> getUltimo() {
        return ultimo;
    }

    public void inserir(T valor) {
        NoLista<T> novoNoLista = new NoLista<T>();
        novoNoLista.setInfo(valor);

        novoNoLista.setProximo(primeiro);
        this.primeiro = novoNoLista;

        if (this.ultimo == null) {
            this.ultimo = novoNoLista;
        }
    }

    public void inserirFinal(T valor) {
        NoLista<T> novoNoLista = new NoLista<T>();
        novoNoLista.setInfo(valor);
        novoNoLista.setProximo(null);

        if (estaVazia()) {
            primeiro = novoNoLista;
        } else {
            ultimo.setProximo(novoNoLista);
        }
        ultimo = novoNoLista;
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
                if (this.primeiro == null) {
                    this.ultimo = null;
                }
            } else {
                noAnterior.setProximo(noAtual.getProximo());
                if (noAtual == ultimo) {
                    this.ultimo = noAnterior;
                }
            }
        }
    }

    public void retirarDoInicio() {
        if (primeiro != null) {
            primeiro = primeiro.getProximo();
            if (primeiro == null) {
                ultimo = null;
            }
        }
    }

    public void exibir() {
        NoLista<T> atual = getPrimeiro();
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getProximo();
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
        int cont = 0;
        NoLista<T> no = getPrimeiro();
        while (no != null) {
            cont++;
            no = no.getProximo();
        }
        return cont;
    }

    public NoLista<T> obterNo(int idx) {
        if (idx == -1) {
            return ultimo;
        }

        int comprimento = obterComprimento();

        if (idx >= comprimento || idx < -1) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + comprimento);
        }

        NoLista<T> no = getPrimeiro();
        int cont = 0;

        while (no != null) {
            if (cont == idx) {
                return no;
            }

            cont++;
            no = no.getProximo();
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> no = primeiro;
        while (no != null) {
            sb.append(no.getInfo());
            if (no.getProximo() != null) {
                sb.append(", ");
            }
            no = no.getProximo();
        }
        return sb.toString();
    }
}

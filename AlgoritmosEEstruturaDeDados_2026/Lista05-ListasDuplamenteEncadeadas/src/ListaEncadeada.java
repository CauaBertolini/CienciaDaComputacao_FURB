public class ListaEncadeada<T> {

    private NoListaDupla primeiro;

    public ListaEncadeada() {
        primeiro = new NoListaDupla<>();
        primeiro.setProximo(null);
        primeiro.setAnterior(null);

    }

    public NoListaDupla getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla novoNo = new NoListaDupla();

        novoNo.setInfo(valor);

        novoNo.setProximo(primeiro);
        novoNo.setAnterior(null);

        if (primeiro != null) {
            primeiro.setAnterior(novoNo);
        }
        primeiro = novoNo;
    }

    public void retirar(T valor) {
        NoListaDupla<T> noAtual = primeiro;
        NoListaDupla<T> noAnterior = null;

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
        NoListaDupla<T> primeiro = getPrimeiro();
        while (primeiro.getProximo() != null) {
            System.out.println(primeiro.getInfo());
            primeiro = primeiro.getProximo();
        }
    }

    public boolean estaVazia() {
        return (primeiro == null);
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> no = getPrimeiro();
        while (no.getProximo() != null) {
            if (no.getInfo().equals(valor)) {
                return no;
            }
        }
        return null;
    }

    public int obterComprimento() {
        int cont = -1;
        NoListaDupla<T> no = getPrimeiro();
        while (no.getProximo() != null) {
            cont++;
            no = no.getProximo();
        }
        return cont;
    }

    public NoListaDupla<T> obterNo(int idx) {
        int comprimento = obterComprimento();

        if (idx > comprimento || idx < -1) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + comprimento);
        }

        NoListaDupla<T> no = getPrimeiro();

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
        NoListaDupla<T> no = primeiro;
        while (no.getProximo() != null) {
            sb.append(no.getInfo());
            sb.append(", ");
            no = no.getProximo();
        }
        return sb.toString();
    }
}

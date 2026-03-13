public class ListaEncadeada<T> {

    private NoLista primeiro;

    public ListaEncadeada() {
        primeiro = new NoLista<>();
        primeiro.setProximo(null);

    }

    public NoLista getPrimeiro() {
        return primeiro;
    }


    public void inserir(T valor) {
        NoLista<T> novoNoLista = new NoLista<>();
        novoNoLista.setInfo(valor);

        if (estaVazia()) {
            primeiro = novoNoLista;
            novoNoLista.setProximo(novoNoLista);
            return;
        }

        NoLista<T> ultimo = primeiro;

        // Aqui ele vai inteirar sobre um start dele mesmo. Consideramos
        // que o ultimo seja o primeiro, então, pegamos o próximo do primeiro
        // e enquanto esse próximo não for igual ao primeiro, continuamos
        // avançando até que cheguemos no de fato no último da lista.
        // A ideia de achar o último é poder redirecionar ele para o novoNo
        // que acaba de chegar.
        while (ultimo.getProximo() != primeiro) {
            ultimo = ultimo.getProximo();
        }

        // Aqui, o último (recém encontrado) irá apontar para o primeiro
        // e na sequência, o novoNo irá apontar para o antigo primeiro.
        ultimo.setProximo(novoNoLista);
        novoNoLista.setProximo(primeiro);

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

        if (primeiro.getProximo() == null) {
            return;
        }

        NoLista<T> primeiro = getPrimeiro();

        do  {
            System.out.println(primeiro.getInfo());
            primeiro = primeiro.getProximo();
        } while (primeiro != getPrimeiro());

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

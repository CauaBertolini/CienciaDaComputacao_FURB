public class ListaDupla<T> {

    private NoListaDupla primeiro;

    public ListaDupla() {
        primeiro = new NoListaDupla<>();
        primeiro = null;
    }

    public NoListaDupla getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla novoNo = new NoListaDupla<T>();

        novoNo.setInfo(valor);
        novoNo.setProximo(primeiro);
        novoNo.setAnterior(null);

        if (estaVazia()) {
            primeiro.setAnterior(novoNo);
        }
        this.primeiro = novoNo;
    }

    public void retirar(T valor) {
        NoListaDupla noRemocao = buscar(valor);

        if (noRemocao != null) { // Existe?
            if (primeiro == noRemocao) { // É o primeiro?
                primeiro = noRemocao.getProximo(); // Se for o primeiro, o novo primeiro se torna o próximo dele e...
            } else { // Não é o primeiro então o próximo do anterior recebe o próximo do atual
                noRemocao.getAnterior().setProximo(noRemocao.getProximo()); //
            }
        }
        if (noRemocao.getProximo() != null) { // Se não for o último...
            noRemocao.getProximo().setAnterior(noRemocao.getAnterior()); // Então o anterior do próximo recebe o anterior dele
        }
    }

    public void liberar() {
        NoListaDupla noAtual = primeiro;
        while (noAtual.getProximo() != null) {
            NoListaDupla proximo = noAtual.getProximo();
            noAtual.setAnterior(null);
            noAtual.setProximo(null);
            noAtual = proximo;
        }
        primeiro = null;
    }

    public void exibir() {
        NoListaDupla<T> primeiro = getPrimeiro();
        while (primeiro.getProximo() != null) {
            System.out.println(primeiro.getInfo());
            primeiro = primeiro.getProximo();
        }
    }

    public void exibirOrdemInversa() {
        NoListaDupla ultimo = obterNo(obterComprimento());
        while (ultimo.getAnterior() != null) {
            System.out.println(ultimo.getInfo());
            ultimo = ultimo.getAnterior();
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

    public int obterComprimento() {
        int cont = -1;
        NoListaDupla<T> no = getPrimeiro();
        while (no.getProximo() != null) {
            cont++;
            no = no.getProximo();
        }
        return cont;
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

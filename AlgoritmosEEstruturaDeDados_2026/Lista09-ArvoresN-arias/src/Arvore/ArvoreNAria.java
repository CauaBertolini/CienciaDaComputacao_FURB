package Arvore;

public class ArvoreNAria<T> {
    private NoArvore<T> _raiz;

    public ArvoreNAria() {
        _raiz = null;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this._raiz = raiz;
    }

    public NoArvore<T> getRaiz() {
        return _raiz;
    }

    @Override
    public String toString() {
        return obterRepresentacaoTextual(_raiz);
    }

    private String obterRepresentacaoTextual(NoArvore<T> no) {
        StringBuilder string = new StringBuilder();

        if (no == null) {
            return string.toString();
        }
        string.append("<"+no.getInfo());
        no = no.getPrimeiro();
        while (no != null) {
            string.append(obterRepresentacaoTextual(no));
            no = no.getProximo();
        }
        string.append(">");
        return string.toString();
    }

    public Boolean pertence(T info) {
        return pertence(_raiz, info);
    }

    private Boolean pertence(NoArvore<T> no, T info) {
        if (no == null) {
            return (Boolean) false;
        }
        System.out.println(no.getInfo());
        if (no.getInfo().equals(info)) {
            return (Boolean) true;
        } else {
            NoArvore<T> aux = (NoArvore<T>) no.getPrimeiro();
            while(aux != null) {

                if (pertence(aux, info)) {
                    return (Boolean) true;
                }
                aux = aux.getProximo();
            }
        }

        return (Boolean) false;
    }

    public int contarNos() {
        return contarNos(_raiz);
    }

    private int contarNos(NoArvore<T> no) {
        int cont = 0;

        if (no == null) {
            return cont;
        }
        cont++;

        no = no.getPrimeiro();
        while (no != null) {
            cont += contarNos(no);
            no = no.getProximo();
        }

        return cont;
    }
}

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

        string.append(obterRepresentacaoTextual(no.getPrimeiro()));

        string.append(obterRepresentacaoTextual(no.getProximo()));
        string.append(">");

        return string.toString();
    }

    public Boolean pertence(T info) {
        return pertence(_raiz, info);
    }

    private Boolean pertence(NoArvore<T> no, T info) {
        if (no == null) {
            return false;
        }

        if (no.getInfo() == info) {
            return true;
        }

        if (pertence(no.getPrimeiro(), info)) {
            return true;
        }

        if (pertence(no.getProximo(), info)) {
            return true;
        }

        return false;
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

        cont += contarNos(no.getPrimeiro());
        cont += contarNos(no.getProximo());

        return cont;
    }
}

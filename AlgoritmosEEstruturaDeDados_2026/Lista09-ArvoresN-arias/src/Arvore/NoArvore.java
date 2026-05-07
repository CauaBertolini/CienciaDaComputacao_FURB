package Arvore;

public class NoArvore<T> {
    private T info;
    private NoArvore<T> _primeiro;
    private NoArvore<T> _proximo;

    public NoArvore(T info) {
        setInfo(info);
        setPrimeiro(null);
        setProximo(null);
    }

    public void inserirFilho(NoArvore<T> filho) {
        filho.setProximo(this.getProximo());
        this.setPrimeiro(filho);
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setPrimeiro(NoArvore<T> no) {
        this._primeiro = no;
    }

    public NoArvore<T> getPrimeiro() {
        return this._primeiro;
    }

    public void setProximo(NoArvore<T> no) {
        this._proximo = no;
    }

    public NoArvore<T> getProximo() {
        return this._proximo;
    }

}

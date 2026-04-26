package ListaEncadeada;

public class NoLista<T> {
    private T info;
    private NoLista<T> next;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoLista<T> getProximo() {
        return next;
    }

    public void setProximo(NoLista<T> proximo) {
        next = proximo;
    }

}

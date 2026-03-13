public class NoListaDupla<T> {
    private T info;
    private NoListaDupla<T> next;
    private NoListaDupla<T> before;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoListaDupla<T> getProximo() {
        return next;
    }

    public NoListaDupla<T> getAnterior() {
        return before;
    }

    public void setProximo(NoListaDupla<T> proximo) {
        next = proximo;
    }

    public void setAnterior(NoListaDupla<T> anterior) {
        before = anterior;
    }

}

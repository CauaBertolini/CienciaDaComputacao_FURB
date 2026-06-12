package buscas;

public abstract class BuscaAbstract<T> {
    private T[] info;

    public BuscaAbstract(T[] info) {
        setInfo(info);
    }

    public T[] getInfo() {
        return info;
    }

    public void setInfo(T[] info) {
        this.info = info;
    }
}

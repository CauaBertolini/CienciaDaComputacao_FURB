package Bolha;

public abstract class OrdenadorAbstract<T extends Comparable<T>> {
    protected T info[];

    public T[] getInfo() {
        return info;
    }

    public void setInfo(T info[]) {
        this.info = info;
    }

    public void trocar(int a, int b) {
        T aux = info[a];
        info[a] = info[b];
        info[b] = aux;
    }

    public void ordenar() {

    }
}

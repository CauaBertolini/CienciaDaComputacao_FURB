package arvoreBinaria;

public class NoArvoreBinaria<T> {

    private T _info;
    private NoArvoreBinaria<T> _esquerda;
    private NoArvoreBinaria<T> _direita;

    public NoArvoreBinaria(T info) {
        setInfo(info);
        setEsquerda(null);
        setDireita(null);
    }

    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
        setInfo(info);
        setDireita(dir);
        setEsquerda(esq);
    }

    public void setInfo(T info) {
        this._info = info;
    }

    public T getInfo() {
        if (_info == null) {
            return null;
        }
        return _info;
    }

    public void setDireita(NoArvoreBinaria<T> direita) {
        this._direita = direita;
    }

    public NoArvoreBinaria<T> getDireita() {
        return _direita;
    }

    public void setEsquerda(NoArvoreBinaria<T> esquerda) {
        this._esquerda = esquerda;
    }

    public NoArvoreBinaria<T> getEsquerda() {
        return _esquerda;
    }

}

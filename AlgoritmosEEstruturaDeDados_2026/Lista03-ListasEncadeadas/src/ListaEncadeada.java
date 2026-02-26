public class ListaEncadeada<T> {

    private NoLista primeiro;

    public ListaEncadeada() {
        primeiro = new NoLista<>();
    }

    public NoLista getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {

    }

    public boolean estaVazia() {
        return (primeiro == null);
    }

    public NoLista<T> buscar(T valor) {
        return null;
    }

}

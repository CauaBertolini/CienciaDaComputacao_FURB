package pilha;

import listaEncadeada.ListaEncadeada;
import listaEncadeada.NoLista;

public class PilhaListaEncadeada<T> implements Pilha<T> {
    private ListaEncadeada<T> lista;

    public PilhaListaEncadeada() {
        lista = new ListaEncadeada<>();
    }

    @Override
    public void push(T info) {
        lista.inserir(info);
    }

    @Override
    public T pop() {
        T topo =  lista.getPrimeiro().getInfo();
        lista.retirar(lista.getPrimeiro().getInfo());
        return topo;
    }

    @Override
    public T peek() {
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return (lista.getPrimeiro() == null);
    }

    @Override
    public void liberar() {
        lista.liberar();
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}

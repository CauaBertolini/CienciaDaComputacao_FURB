package pilha;

import exception.PilhaVaziaException;
import listaEncadeada.ListaEncadeada;

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
    public T pop() throws PilhaVaziaException {
        try {
            T topo =  lista.getPrimeiro().getInfo();
            lista.retirar(lista.getPrimeiro().getInfo());
            return topo;
        }
        catch (Exception e) {
            throw new PilhaVaziaException();
        }
    }

    @Override
    public T peek() throws PilhaVaziaException {
        try {
            return lista.getPrimeiro().getInfo();
        }
        catch (Exception e) {
            throw new PilhaVaziaException();
        }
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

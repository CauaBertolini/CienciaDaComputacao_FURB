package Fila;

import ListaEncadeada.ListaEncadeada;
import exception.FilaVaziaException;

public class FilaEncadeada<T> implements Fila<T> {

    private ListaEncadeada<T> lista;

    public FilaEncadeada() {
        lista = new ListaEncadeada<T>();
    }

    @Override
    public void inserir(T valor) {
        lista.inserirFinal(valor);
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public T retirar() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        T valor = lista.getPrimeiro().getInfo();
        lista.retirarDoInicio();
        return valor;
    }

    @Override
    public void liberar() {
        lista = new ListaEncadeada<T>();
    }
}

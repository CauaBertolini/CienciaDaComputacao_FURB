package Fila;

import exception.FilaCheiaException;
import exception.FilaVaziaException;

public class FilaVetor<T> implements Fila<T> {
    private T info [];
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
        inicio = 0;
        tamanho = 0;
    }

    public FilaVetor<T> criarFilaVetorConcatenada (FilaVetor<T> outraFilaVetor) {
        FilaVetor<T> novaFilaVetor = new FilaVetor<T>((getLimite() + outraFilaVetor.getLimite()));

        FilaVetor<T> filaVetorAuxiliarAtual = new FilaVetor<T>(getLimite());
        FilaVetor<T> outraFilaVetorAuxiliar = new FilaVetor<T>(outraFilaVetor.getLimite());

        int tamanhoFilaAtual = getTamanho();
        int tamanhoOutraFila = outraFilaVetor.getTamanho();

        for (int i = 0; i < tamanhoFilaAtual; i++) {
            T valor = retirar();
            novaFilaVetor.inserir(valor);
            filaVetorAuxiliarAtual.inserir(valor);
        }
        for (int i = 0; i < tamanhoOutraFila; i++) {
            T valor = outraFilaVetor.retirar();
            novaFilaVetor.inserir(valor);
            outraFilaVetorAuxiliar.inserir(valor);
        }
        for (int i = 0; i < tamanhoFilaAtual; i++) {
            inserir(filaVetorAuxiliarAtual.retirar());
        }
        for (int i = 0; i < tamanhoOutraFila; i++) {
            outraFilaVetor.inserir(outraFilaVetorAuxiliar.retirar());
        }
        return novaFilaVetor;
    }

    @Override
    public void inserir(T valor) throws FilaCheiaException {
        try {
            if (tamanho < limite) {
                int novaPosicao = (inicio + tamanho) % limite;
                info[novaPosicao] = valor;
                tamanho++;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new FilaCheiaException();
        }
    }

    @Override
    public T retirar() throws FilaVaziaException {
        if (tamanho > 0) {
            T valor = peek();
            inicio = (inicio + 1) % limite;
            tamanho--;
            return valor;
        } else {
            throw new FilaVaziaException();
        }
    }

    @Override
    public T peek() throws FilaCheiaException {
        if (tamanho > 0) {
            return info[inicio];
        } else {
            throw new FilaVaziaException();
        }
    }

    @Override
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    @Override
    public void liberar() {
        tamanho = 0;
        inicio = 0;
    }

    public int getLimite() {
        return limite;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        FilaVetor<T> filaVetorAuxiliar = new FilaVetor<T>(limite);
        int tamanhoFila = getTamanho();

        for (int i = 0; i < tamanhoFila; i++) {
            T valor = retirar();
            stringBuilder.append(valor);
            filaVetorAuxiliar.inserir(valor);
            if (i == tamanhoFila-1) {
                stringBuilder.append(".");
            } else {
                stringBuilder.append(", ");
            }
        }
        for (int i = 0; i < tamanhoFila; i++) {
            inserir(filaVetorAuxiliar.retirar());
        }

        return stringBuilder.toString();
    }
}

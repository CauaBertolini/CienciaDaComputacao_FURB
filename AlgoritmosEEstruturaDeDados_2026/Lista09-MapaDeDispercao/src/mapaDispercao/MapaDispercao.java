package mapaDispercao;

import listaEncadeada.ListaEncadeada;

public class MapaDispercao <T> {
    private ListaEncadeada<NoMapa<T>> info[];
    private int tamanho;
    private int quantidadeElementos;

    public MapaDispercao(int tamanho) {
        info = new ListaEncadeada[tamanho];
    }

    private int calcularHash(int chave) {
        tamanho = info.length;
        return (chave % tamanho);
    }

    public void inserir(int chave, T dado) {
        int indice = calcularHash(chave);
        if (info[indice] == null) {
            info[indice] = new ListaEncadeada();
        }

        NoMapa<T> noMapa = new NoMapa<T>();
        noMapa.setChave(chave);
        noMapa.setValor(dado);

        info[indice].inserir(noMapa);
    }

    public void remover(int chave) {
        int indice = calcularHash(chave);
        if (info[indice] != null) {
            NoMapa<T> procurado = new  NoMapa<T>();
            procurado.setChave(chave);

            if (info[indice].buscar(procurado) != null) {
                info[indice].retirar(procurado);
            }
        }
    }

    public T buscar(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<T> noMapa = new NoMapa<T>();
            noMapa.setChave(chave);

            NoMapa<T> no = info[indice].buscar(noMapa).getInfo();

            return no.getValor();
        }

        return null;
    }

    public double calcularFatorCarga() {
        return (quantidadeElementos / tamanho);
    }
}

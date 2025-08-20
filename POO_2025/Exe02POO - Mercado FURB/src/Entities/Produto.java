package Entities;

import Enums.Unidade;

public class Produto {
    private String nome;
    private Unidade unidade;

    public Produto(String nome, Unidade unidade) {
        this.nome = nome;
        this.unidade = unidade;
    }

    @Override
    public String toString() {
        return "Produto" +
                "\nNome: " + this.nome +
                "\nUnidade: " + unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty())
            throw new IllegalArgumentException("Nome não pode ser vazio");

        this.nome = nome;
    }
}


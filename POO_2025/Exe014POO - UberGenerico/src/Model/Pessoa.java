package Model;

import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private ArrayList<Viagem> listaViagens = new ArrayList<>();

    public Pessoa(String nome) {
        setNome(nome);
    }

    public boolean incluirViagem(Viagem v) {
        return true;
    }

    public boolean removerViagem(Viagem v) {
        return false;
    }

    public void listarViagens() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

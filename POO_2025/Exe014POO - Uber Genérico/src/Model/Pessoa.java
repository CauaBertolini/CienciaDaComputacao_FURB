package Model;

import java.util.ArrayList;
import Exception.ValorMenorIgualAZeroException;
import Exception.CampoVazioOuNuloException;
import Exception.Utilitario;


public abstract class Pessoa {
    private String nome;
    private ArrayList<Viagem> listaViagens;

    public Pessoa(String nome) {
        setNome(nome);
        listaViagens = new ArrayList<>();
    }

    public boolean incluirViagem(Viagem v) {
        if (!Utilitario.CampoVazioOuNulo(v)) {
            listaViagens.add(v);
        }
        return true;
    }

    public boolean removerViagem(Viagem v) {
        for (Viagem vi : listaViagens) {
            if (vi.equals(v)) {
                listaViagens.remove(vi);
            }
        }
        return false;
    }

    public String listarViagens() {
        String retorno = "";
        for (Viagem vi : listaViagens) {
            retorno += vi.toString();
        }
        return retorno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws CampoVazioOuNuloException {
        if (Utilitario.CampoVazioOuNulo(nome)) {
            this.nome = nome;
        }
    }
}

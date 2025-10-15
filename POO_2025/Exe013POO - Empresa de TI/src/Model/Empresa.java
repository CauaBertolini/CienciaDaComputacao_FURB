package Model;

import Control.Utilitario;
import Exception.CampoVazioOuNuloException;
import Exception.CampoMenorIgualAZeroException;

import java.util.ArrayList;

public class Empresa {
    private String nome;

    private ArrayList<Funcionario> quadroDeColaboradores = new ArrayList<>();



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws CampoVazioOuNuloException {
        if (Utilitario.ValidarCampoVazioOuNulo(nome)) {
            this.nome = nome;
        }
    }

    public boolean incluirFuncionario(Funcionario novoFuncionario) {
        for (Funcionario f : quadroDeColaboradores) {
            if (f.equals(novoFuncionario));
            return false;
        }
        quadroDeColaboradores.add(novoFuncionario);
        return true;
    }

    public ArrayList<Funcionario> getQuadroDeColaboradores() {
        return quadroDeColaboradores;
    }
}

package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import Exception.ValorMenorIgualAZeroException;
import Exception.CampoVazioOuNuloException;
import Exception.Utilitario;

public class Motorista extends Pessoa {
    private String numCNH;
    private Veiculo veiculo;

    public Motorista(String nome, String numCNH, Veiculo veiculo) {
        super(nome);
        setNumCNH(numCNH);
        setModeloCarro(veiculo);
    }

    public String getNumCNH() {
        return numCNH;
    }

    public void setNumCNH(String numCNH) throws CampoVazioOuNuloException {
        if (!Utilitario.CampoVazioOuNulo(numCNH)) {
            this.numCNH = numCNH;
        }
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setModeloCarro(Veiculo veiculo) throws IllegalArgumentException {
        if (veiculo != null) {
            this.veiculo = veiculo;
        } else {
            throw new IllegalArgumentException("Modelo carro não informado ou inválido");
        }
    }
}

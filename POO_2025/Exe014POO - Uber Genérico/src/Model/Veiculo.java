package Model;

import Enum.*;
import Exception.ValorMenorIgualAZeroException;
import Exception.CampoVazioOuNuloException;
import Exception.Utilitario;

public class Veiculo {
    private String modeloVeiculo;
    private EnumMarcaCarro marcaCarro;

    public Veiculo(String modeloVeiculo, EnumMarcaCarro marcaCarro) {
        setMarcaCarro(marcaCarro);
        setModeloVeiculo(modeloVeiculo);
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) throws CampoVazioOuNuloException{
        if (Utilitario.CampoVazioOuNulo(modeloVeiculo)) {
            this.modeloVeiculo = modeloVeiculo;
        }
    }

    public EnumMarcaCarro getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(EnumMarcaCarro marcaCarro) {
        this.marcaCarro = marcaCarro;
    }
}

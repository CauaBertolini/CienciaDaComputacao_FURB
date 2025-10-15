package Model;

import Control.Utilitario;
import Exception.CampoMenorIgualAZeroException;


public class Venda {
    private double valor;

    public Venda(double valor) throws CampoMenorIgualAZeroException {
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
       if (Utilitario.CampoMenorIgualAZero(valor)) {
           this.valor = valor;
       }
    }
}

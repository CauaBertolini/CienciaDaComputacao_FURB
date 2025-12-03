// Cauã Fernando Bertolini

package modelo;

import excessao.CampoMenorQueZeroExcecao;
import util.ExcecaoUtil;

public class VanDeEntrega extends Veiculo{
    private int combustivelGasto;
    private int ocorrenciaDeAtraso;

    public VanDeEntrega(char tag, String nome, String rota, int kmPercorridos, int combustivelGasto, int ocorrenciaDeAtraso) {
        super(tag, nome, rota, kmPercorridos);
        setCombustivelGasto(combustivelGasto);
        setOcorrenciaDeAtraso(ocorrenciaDeAtraso);
    }

    /*
        MÉTODOS PERSONALIZADOS
    */

    public double calcularTaxaProblema() {
        double taxaProblema = (double) this.getOcorrenciaDeAtraso() / this.getKmPercorridos();
        return taxaProblema;
    }

    /*
        GETTERS AND SETTERS
     */

    public int getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(int combustivelGasto) throws CampoMenorQueZeroExcecao {
        if (!ExcecaoUtil.campoMenorQueZero(combustivelGasto)) {
            this.combustivelGasto = combustivelGasto;
        }
    }

    public int getOcorrenciaDeAtraso() {
        return ocorrenciaDeAtraso;
    }

    public void setOcorrenciaDeAtraso(int ocorrenciaDeAtraso) throws CampoMenorQueZeroExcecao {
        if (!ExcecaoUtil.campoMenorQueZero(ocorrenciaDeAtraso)) {
            this.ocorrenciaDeAtraso = ocorrenciaDeAtraso;
        }
    }

    @Override
    public String toString() {
        return getTag() + "," + getNome() + "," + getRota() + "," + getKmPercorridos() + "," + getCombustivelGasto() + "," + getOcorrenciaDeAtraso();
    }
}

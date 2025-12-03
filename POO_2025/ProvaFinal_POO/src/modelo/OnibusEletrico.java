// Cauã Fernando Bertolini

package modelo;

import excessao.CampoMenorQueZeroExcecao;
import util.ExcecaoUtil;

public class OnibusEletrico extends Veiculo {
    private int totalkWhConsumido;
    private int paradasNaoProgramadas;

    public OnibusEletrico(char tag, String nome, String rota, int kmPercorridos, int totalkWhConsumido, int paradasNaoProgramadas) {
        super(tag, nome, rota, kmPercorridos);
        setTotalkWhConsumido(totalkWhConsumido);
        setParadasNaoProgramadas(paradasNaoProgramadas);
    }


    /*
        MÉTODOS PERSONALIZADOS
    */

    public double calcularTaxaProblema() {
        double taxaProblema = (double) this.getParadasNaoProgramadas() / this.getKmPercorridos();
        return taxaProblema;
    }

    /*
        GETTERS AND SETTERS
     */

    public int getTotalkWhConsumido() {
        return totalkWhConsumido;
    }

    public void setTotalkWhConsumido(int totalkWhConsumido) throws CampoMenorQueZeroExcecao {
        if (!ExcecaoUtil.campoMenorQueZero(totalkWhConsumido)) {
            this.totalkWhConsumido = totalkWhConsumido;
        }
    }

    public int getParadasNaoProgramadas() {
        return paradasNaoProgramadas;
    }

    public void setParadasNaoProgramadas(int paradasNaoProgramadas) throws CampoMenorQueZeroExcecao {
        if (!ExcecaoUtil.campoMenorQueZero(paradasNaoProgramadas)) {
            this.paradasNaoProgramadas = paradasNaoProgramadas;
        }
    }

    @Override
    public String toString() {
        return getTag() + "," + getNome() + "," + getRota() + "," + getKmPercorridos() + "," + getTotalkWhConsumido() + "," + getParadasNaoProgramadas();
    }
}

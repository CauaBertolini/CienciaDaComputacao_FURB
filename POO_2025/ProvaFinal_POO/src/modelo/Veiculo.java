// Cauã Fernando Bertolini

package modelo;

import excessao.CampoMenorQueZeroExcecao;
import excessao.CampoVazioOuNuloExcecao;
import util.ExcecaoUtil;

public abstract class Veiculo {
    private char tag;
    private String nome;
    private String rota;
    private int kmPercorridos;

    public Veiculo(char tag, String nome, String rota, int kmPercorridos) {
        setTag(tag);
        setNome(nome);
        setRota(rota);
        setKmPercorridos(kmPercorridos);
    }

    /*
        MÉTODOS PERSONALIZADOS
    */

    public abstract double calcularTaxaProblema();

    /*
        GETTERS AND SETTERS
     */

    public char getTag() {
        return tag;
    }

    public void setTag(char tag) throws CampoVazioOuNuloExcecao {
        if (!ExcecaoUtil.campoEstaVazioOuNulo(tag)) {
            this.tag = tag;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws CampoMenorQueZeroExcecao {
        if (!ExcecaoUtil.campoEstaVazioOuNulo(nome)) {
            this.nome = nome;
        }
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) throws CampoVazioOuNuloExcecao {
        if (!ExcecaoUtil.campoEstaVazioOuNulo(rota)) {
            this.rota = rota;
        }
    }

    public int getKmPercorridos() {
        return kmPercorridos;
    }

    public void setKmPercorridos(int kmPercorridos) throws CampoMenorQueZeroExcecao {
        if (!ExcecaoUtil.campoMenorQueZero(kmPercorridos)) {
            this.kmPercorridos = kmPercorridos;
        }
    }
}

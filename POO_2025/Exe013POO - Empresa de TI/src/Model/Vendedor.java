package Model;

import java.util.ArrayList;

import Control.Utilitario;
import Exception.CampoMenorIgualAZeroException;
import Exception.CampoVazioOuNuloException;

public class Vendedor extends Funcionario {
    private ArrayList<Venda> vendas = new ArrayList<>();

    private double percentualComissao;

    public Vendedor(String nome, double salarioBase, double percentualComissao) throws CampoMenorIgualAZeroException, CampoVazioOuNuloException {
        super(nome, salarioBase);
        setPercentualComissao(percentualComissao);
    }

    @Override
    public double calcularSalario() {
        double salario = getSalarioBase();

        for (Venda v : vendas) {
            salario += (v.getValor()*(getPercentualComissao()/100));
        }

        return salario;
    }

    public void incluirVenda(Venda venda) throws CampoMenorIgualAZeroException {
        if (Utilitario.CampoMenorIgualAZero(venda.getValor())) {
            vendas.add(venda);
        }
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) throws CampoMenorIgualAZeroException {
        if (Utilitario.CampoMenorIgualAZero(percentualComissao)) {
            this.percentualComissao = percentualComissao;
        }
    }

}

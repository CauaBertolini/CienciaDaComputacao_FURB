package Model;

import Control.Utilitario;
import Exception.CampoVazioOuNuloException;
import Exception.CampoMenorIgualAZeroException;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) throws CampoVazioOuNuloException, CampoMenorIgualAZeroException {
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws CampoVazioOuNuloException {
        if (Utilitario.ValidarCampoVazioOuNulo(nome)) {
            this.nome = nome;
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws CampoMenorIgualAZeroException {
        if (Utilitario.CampoMenorIgualAZero(salarioBase)) {
            this.salarioBase = salarioBase;
        }
    }
}

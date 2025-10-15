package Model;

import java.util.ArrayList;
import Control.Utilitario;
import Exception.CampoVazioOuNuloException;
import Exception.CampoMenorIgualAZeroException;

public class Programador extends Funcionario {
    private ArrayList<String> linguagens = new ArrayList<>();


    public Programador(String nome, double salarioBase) throws CampoVazioOuNuloException, CampoMenorIgualAZeroException {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double salario = getSalarioBase();
        for (String l : linguagens) {
            if (l.equalsIgnoreCase("java")) {
                salario += getSalarioBase() + (getSalarioBase()*0.2);
                return salario;
            }
        }
        return salario;
    }

    public boolean incluirLinguagem(String linguagem) {
        if (Utilitario.ValidarCampoVazioOuNulo(linguagem)) {
            for (String l : linguagens) {
                if (l.equalsIgnoreCase(linguagem)) {
                    return false;
                }
            }
            linguagens.add(linguagem);
            return true;
        }
        return false;
    }

    public void removerLinguagem(String linguagem) {
        if (Utilitario.ValidarCampoVazioOuNulo(linguagem)) {
            for (String l : linguagens) {
                if (l.equalsIgnoreCase(linguagem)) {
                    linguagens.remove(l);
                }
            }
        }
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }
}

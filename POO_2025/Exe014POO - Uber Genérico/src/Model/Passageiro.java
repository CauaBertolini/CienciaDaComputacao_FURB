package Model;

import Enum.EnumFormaPagamento;
import Exception.Utilitario;
import Exception.ValorMenorIgualAZeroException;
import Exception.CampoVazioOuNuloException;

public class Passageiro extends Pessoa {
    private String telefone;
    private EnumFormaPagamento formaPagamento;

    public Passageiro(String nome, String telefone, EnumFormaPagamento formaPagamento) {
        super(nome);
        setTelefone(telefone);
        setFormaPagamento(formaPagamento);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws CampoVazioOuNuloException {

        if (!Utilitario.CampoVazioOuNulo(telefone)) {
            this.telefone = telefone;
        }
    }

    public EnumFormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(EnumFormaPagamento formaPagamento) throws IllegalArgumentException {
        if (formaPagamento != null) {
            this.formaPagamento = formaPagamento;
        } else {
            throw new IllegalArgumentException("Forma de pagamento não pode ser vazia");
        }

    }
}

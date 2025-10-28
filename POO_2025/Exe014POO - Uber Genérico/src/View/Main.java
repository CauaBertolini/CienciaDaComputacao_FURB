package View;

import Model.Passageiro;
import Model.Pessoa;
import Model.Veiculo;
import Model.Viagem;
import Exception.ValorMenorIgualAZeroException;
import Exception.CampoVazioOuNuloException;
import Exception.Utilitario;
import javax.swing.*;
import java.util.ArrayList;
import Enum.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pessoa> users = new ArrayList<Pessoa>();
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

        JOptionPane.showMessageDialog(null, "Bem vindo ao UBER FURB");

        char option = '0';

        String mainMenu = "Menu Principal \n" +
                "[ 1 ] Nova Viagem \n" +
                "[ 2 ] Listas \n" +
                "[ 3 ] Cadastrar Pessoa \n" +
                "[ 4 ] Cadastrar Veiculo \n" +
                "[ 5 ] Sair";

        do {
            option = JOptionPane.showInputDialog(null, mainMenu).charAt(0);

            switch (option) {
                case '1':

                    break;

                case '2':

                    break;

                case '3':
                    char optionCadastroPessoa = '0';
                    do {
                        optionCadastroPessoa = JOptionPane.showInputDialog(null, "Cadastrando Pessoa\n" +
                                "[ 1 ] Novo Passageiro \n" +
                                "[ 2 ] Novo Motorista \n" +
                                "[ 3 ] Voltar").charAt(0);

                        switch (optionCadastroPessoa) {
                            case '1':
                                cadastrarPassageiro();
                                break;

                            case '2':
                                cadastrarMotorista();
                                break;

                            case '3':
                                JOptionPane.showMessageDialog(null, "Voltando...");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opção Inválida, tente novamente");
                        }

                    } while (optionCadastroPessoa != '3');

                    break;

                case '4':

                    break;

                case '5':
                    JOptionPane.showMessageDialog(null, "Encerrando programa...");
                    break;

                default:
                    JOptionPane.showInputDialog(null, "Opção inválida, tente novamente!");
                    break;

            }
        } while (option == '5');



    }
    public static boolean cadastrarViagem() {
        return false;
    }

    public static boolean cadastrarPassageiro() {
        boolean telefoneValido = false;
        boolean formaPagamentoValido = false;

        String telefone = "";
        String nome = coletarNome();

        while (!telefoneValido) {

            try {
                telefone = JOptionPane.showInputDialog(null, "Informe o telefone: ");
                if (!Utilitario.CampoVazioOuNulo(telefone)) {
                    telefoneValido = true;
                }

            } catch (CampoVazioOuNuloException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Telefone precisa ser um número válido.");
            }
        }

        try {
            Pessoa pessoa = new Passageiro(nome, telefone, EnumFormaPagamento.PIX);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar passageiro");
            return false;
        }
        return true;
    }

    public static boolean cadastrarMotorista() {
        boolean cnhValida = false;
        boolean veiculoValido = false;

        String nome = coletarNome();



        return false;
    }

    private static String coletarNome() {
        boolean nomeValido = false;
        String nome = "";

        while (!nomeValido) {

            try {
                nome = JOptionPane.showInputDialog(null, "Informe o nome: ");
                if (!Utilitario.CampoVazioOuNulo(nome)) {
                    nomeValido = true;
                }

            } catch (CampoVazioOuNuloException ex) {
                JOptionPane.showMessageDialog(null, ex);

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Nome precisa ser um texto válido.");
            }
        }
        return nome;
    }

    public boolean cadastrarVeiculo() {
        return false;
    }

    public boolean menuListar() {
        return false;
    }

}

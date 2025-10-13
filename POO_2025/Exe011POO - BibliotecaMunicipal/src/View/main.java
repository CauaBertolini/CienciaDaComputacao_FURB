package View;

import Control.Biblioteca;
import Model.Dvd;
import Model.ItemBiblioteca;
import Model.Livro;
import Model.Revista;

import javax.swing.*;

public class main {

    public static void main(String args[]) {
        Biblioteca biblioteca = new Biblioteca();
        char opcao = '0';

        JOptionPane.showMessageDialog(null, "Bem vindo á Biblioteca!");

        do {
            opcao = JOptionPane.showInputDialog(null, "Qual ação deseja fazer:\n" +
                    "1 - Listar Acervo\n" +
                    "2 - Novo Empréstimo\n" +
                    "3 - Devolver Livro\n" +
                    "4 - Adicionar Livro\n" +
                    "5 - Sair").charAt(0);

            switch (opcao) {
                case '1':
                    JOptionPane.showMessageDialog(null, "Acervo Biblioteca\n" + biblioteca.listar());
                    break;

                case '2':
                    char codigoEmprestimo = JOptionPane.showInputDialog(null, biblioteca.listar() + "\n----------------" +
                            "\nEscolha o item pelo código.").charAt(0);

                    int intCodigoEmprestimo = Integer.parseInt(String.valueOf(codigoEmprestimo));

                    if(intCodigoEmprestimo >= 0 && intCodigoEmprestimo < biblioteca.getItensBiblioteca().size()) {
                        if (biblioteca.getItensBiblioteca().get(intCodigoEmprestimo).emprestar()) {
                            JOptionPane.showMessageDialog(null, "Item do acervo emprestado com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null,"Não foi possível emprestar o item escolhido.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Código inválido!");
                    }
                    break;

                case '3':
                    char codigoDevolucao = JOptionPane.showInputDialog(null, biblioteca.listarEmprestados() + "\n----------------" +
                            "\nEscolha o item pelo código.").charAt(0);
                    int intCodigoDevolucao = Integer.parseInt(String.valueOf(codigoDevolucao));

                    if (intCodigoDevolucao >= 0 && intCodigoDevolucao < biblioteca.getItensBiblioteca().size()) {
                        if (biblioteca.getItensBiblioteca().get(intCodigoDevolucao).isEmprestado()) {
                           float multa = biblioteca.getItensBiblioteca().get(intCodigoDevolucao).devolver();
                           JOptionPane.showMessageDialog(null, "Item do acervo devolvido! Multa de R$" + multa);
                        } else {
                            JOptionPane.showMessageDialog(null, "Este exemplar não está emprestado!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Código inválido!");
                    }
                    break;

                case '4':
                    char opcaoAdicionarAcervo = 'N';
                    do {
                        JOptionPane.showMessageDialog(null, "Adicionando exemplar ao Acervo");
                        opcaoAdicionarAcervo = JOptionPane
                                .showInputDialog(null, "Que tipo de item gostaria de cadastrar:\n" +
                                        "L - Livro\n" +
                                        "R - Revista\n" +
                                        "D - DVD\n" +
                                        "O - Outro\n" +
                                        "S - Sair")
                                .toUpperCase().charAt(0);
                        String tituloItem = "";

                        if (biblioteca.validarOpcaoInserida(opcaoAdicionarAcervo)) {
                            tituloItem = JOptionPane.showInputDialog("Título do novo item: ");
                        }

                        switch (opcaoAdicionarAcervo) {
                            case 'L':
                                Livro novoLivro = new Livro(tituloItem);
                                biblioteca.adicionarItem(novoLivro);
                                break;

                            case 'R':
                                Revista novaRevista = new Revista(tituloItem);
                                biblioteca.adicionarItem(novaRevista);
                                break;

                            case 'D':
                                Dvd novoDvd = new Dvd(tituloItem);
                                biblioteca.adicionarItem(novoDvd);
                                break;

                            case 'O':
                                String prazoDevolucaoNovoItem = String.valueOf(JOptionPane.showInputDialog(null, "Qual será o prazo para devolução deste item?").charAt(0));
                                int intPrazoDevolucaoNovoItem = Integer.parseInt(prazoDevolucaoNovoItem);

                                ItemBiblioteca novoItemBiblioteca = new ItemBiblioteca(tituloItem, intPrazoDevolucaoNovoItem);
                                biblioteca.adicionarItem(novoItemBiblioteca);
                                break;

                            case 'S':
                                JOptionPane.showMessageDialog(null, "Voltando ao menu");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
                                break;
                        }
                    } while (opcaoAdicionarAcervo != 'S');

                    break;

                case '5':
                    JOptionPane.showMessageDialog(null, "Saindo do sistema. Volte sempre!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
                    break;


            }

        } while (opcao != '5');


    }
}

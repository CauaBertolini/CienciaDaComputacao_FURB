// Cauã Fernando Bertolini

package visualizacao;

import controle.GerenciadorVeiculos;
import excessao.CampoMenorQueZeroExcecao;
import excessao.CampoVazioOuNuloExcecao;
import util.JOptionPaneUtil;

public class ProgramaVeiculos {

    private GerenciadorVeiculos gerenciadorVeiculos;

    private StringBuilder menu = new StringBuilder();
    private StringBuilder menuCriacao1 = new StringBuilder();

    public ProgramaVeiculos() {
        gerenciadorVeiculos = new GerenciadorVeiculos();

        menu.append("Bem vindo ao Sistema de Veículos\n");
        menu.append("[ 1 ] Cadastrar novo veículo\n");
        menu.append("[ 2 ] Ver taxa de problema dos veículos\n");
        menu.append("[ 3 ] Ver veículo mais crítico\n");
        menu.append("[ 4 ] Ver veículos ordenados alfabéticamente\n");
        menu.append("[ 5 ] Ver lista geral de veículos\n");
        menu.append("[ 6 ] Sair");

        menuCriacao1.append("Irá criar um Onibus ou uma Van?\n");
        menuCriacao1.append("[ 1 ] Onibus\n");
        menuCriacao1.append("[ 2 ] Van\n");
        menuCriacao1.append("[ 3 ] Voltar");

        menuPrincipal();

    }

    public void menuPrincipal() {
        boolean condicaoParada = false;

        while (!condicaoParada) {
            switch (JOptionPaneUtil.mostrarMenu(menu.toString())) {
                case '1':
                    cadastrarVeiculo();
                    gerenciadorVeiculos.visualizarListaDeVeiculos();
                    break;

                case '2':
                    JOptionPaneUtil.mostrarMensagem("A lista será exibida no console!");
                    gerenciadorVeiculos.visualizarTaxaProblemaVeiculos();
                    break;

                case '3':
                    JOptionPaneUtil.mostrarMensagem("A lista será exibida no console!");
                    gerenciadorVeiculos.visualizarVeiculoMaisProblematico();
                    break;

                case '4':
                    JOptionPaneUtil.mostrarMensagem("A lista será exibida no console!");
                    gerenciadorVeiculos.visualizarVeiculosEmOrdemAlfabetica();
                    break;

                case '5':
                    gerenciadorVeiculos.visualizarListaDeVeiculos();
                    break;

                case '6':
                    JOptionPaneUtil.mostrarMensagemSucesso("Encerrando programa!");
                    condicaoParada = true;
                    break;

                default:
                    JOptionPaneUtil.mostrarMensagemErro("Opção inválida, tente novamente!");
                    break;
            }

        }
    }

    public void cadastrarVeiculo() {
        boolean condicaoParada = false;

        while (!condicaoParada) {
            char tag;
            String nome;
            String rota;
            int kmRodados;
            int litrosOukWhConsumidos;
            int ocorrenciaDeAtrasoOuParada;

            switch (JOptionPaneUtil.mostrarMenu(menuCriacao1.toString())) {
                case '1':
                    //Escolheu Onibus
                    tag = 'B';
                    nome = JOptionPaneUtil.coletarStringSemVirgulas("Nome do ônibus?");
                    rota = JOptionPaneUtil.coletarStringSemVirgulas("Rota?");
                    kmRodados = JOptionPaneUtil.coletarInt("KM rodados?");
                    litrosOukWhConsumidos = JOptionPaneUtil.coletarInt("kWh consumidos?");
                    ocorrenciaDeAtrasoOuParada = JOptionPaneUtil.coletarInt("Paradas por falha?");

                    try {
                        gerenciadorVeiculos.CriarVeiculo(tag, nome, rota, kmRodados, litrosOukWhConsumidos, ocorrenciaDeAtrasoOuParada);
                        condicaoParada = true;
                    } catch (CampoVazioOuNuloExcecao erro) {
                        JOptionPaneUtil.mostrarMensagemErro(erro.getMessage());
                    } catch (CampoMenorQueZeroExcecao erro) {
                        JOptionPaneUtil.mostrarMensagemErro(erro.getMessage());
                    }

                    break;
                case '2':
                    //Escolheu Van
                    tag = 'V';
                    nome = JOptionPaneUtil.coletarStringSemVirgulas("Nome da van?");
                    rota = JOptionPaneUtil.coletarStringSemVirgulas("Rota?");
                    kmRodados = JOptionPaneUtil.coletarInt("KM rodados?");
                    litrosOukWhConsumidos = JOptionPaneUtil.coletarInt("Litros consumidos?");
                    ocorrenciaDeAtrasoOuParada = JOptionPaneUtil.coletarInt("Atrasos de entrega?");

                    try {
                        gerenciadorVeiculos.CriarVeiculo(tag, nome, rota, kmRodados, litrosOukWhConsumidos, ocorrenciaDeAtrasoOuParada);
                        condicaoParada = true;
                    } catch (CampoVazioOuNuloExcecao erro) {
                        JOptionPaneUtil.mostrarMensagemErro(erro.getMessage());
                    } catch (CampoMenorQueZeroExcecao erro) {
                        JOptionPaneUtil.mostrarMensagemErro(erro.getMessage());
                    }

                    break;

                case '3':
                    condicaoParada = true;
                    break;

                default:
                    JOptionPaneUtil.mostrarMensagemErro("Opção inválida, tente novamente!");
                    break;
            }
        }

    }

}

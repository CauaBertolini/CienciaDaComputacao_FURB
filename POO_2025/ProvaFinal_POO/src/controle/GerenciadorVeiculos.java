// Cauã Fernando Bertolini

package controle;

import excessao.CampoMenorQueZeroExcecao;
import excessao.CampoVazioOuNuloExcecao;
import modelo.OnibusEletrico;
import modelo.VanDeEntrega;
import modelo.Veiculo;
import util.JOptionPaneUtil;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorVeiculos {
    private List<Veiculo> listaDeVeiculos;

    public GerenciadorVeiculos() {
        listaDeVeiculos = new ArrayList<>();
        carregarDoCSV();
        SerializadorVeiculos.serializarListaVeiculos(listaDeVeiculos);

    }

    public void carregarDoCSV() {
        List<Veiculo> listaVeiculosCSV = new ArrayList<>();

        listaVeiculosCSV = GerenciadorCSV.importarVeiculosDoCSV();

        for (Veiculo veiculoDoCSV : listaVeiculosCSV) {
            listaDeVeiculos.add(veiculoDoCSV);
        }
    }

    public void CriarVeiculo(char tag, String nome, String rota, int kmRodados, int litrosOukwhGastos, int ocorrenciaDeAtrasoOuParadasNaoProgramadas) throws CampoVazioOuNuloExcecao, CampoMenorQueZeroExcecao {

        switch (tag) {
            case 'B':
                Veiculo novoOnibus = new OnibusEletrico(tag, nome, rota, kmRodados, litrosOukwhGastos, ocorrenciaDeAtrasoOuParadasNaoProgramadas);
                listaDeVeiculos.add(novoOnibus);

                GerenciadorCSV.salvarVeiculosNoCSV(listaDeVeiculos);
                SerializadorVeiculos.serializarVeiculo(listaDeVeiculos.getLast(), listaDeVeiculos.size());
                break;

            case 'V':
                Veiculo novaVan = new VanDeEntrega(tag, nome, rota, kmRodados, litrosOukwhGastos, ocorrenciaDeAtrasoOuParadasNaoProgramadas);
                listaDeVeiculos.add(novaVan);

                GerenciadorCSV.salvarVeiculosNoCSV(listaDeVeiculos);
                SerializadorVeiculos.serializarVeiculo(listaDeVeiculos.getLast(), listaDeVeiculos.size());
                break;

            default:
                JOptionPaneUtil.mostrarMensagemErro("TAG passada para criação inválida.");
        }
    }

    public void visualizarVeiculosEmOrdemAlfabetica() {
        System.out.println("====================================");
        System.out.println("Vendo veículos em ordem alfabética");
        System.out.println("====================================");

        List<Veiculo> listaOrdenada = GerenciadorCSV.pegarCSVOrdenadoAlfabeticamente();

        for (Veiculo veiculo : listaOrdenada) {
            if (veiculo instanceof OnibusEletrico) {
                OnibusEletrico onibus = (OnibusEletrico) veiculo;
                System.out.println(onibus.toString());
            } else if (veiculo instanceof VanDeEntrega) {
                VanDeEntrega van = (VanDeEntrega) veiculo;
                System.out.println(van.toString());
            } else {
                System.out.println("Erro ao indentificar veículo: " + veiculo.getNome());
            }
        }
    }

    public void visualizarTaxaProblemaVeiculos() {
        System.out.println("====================================");
        System.out.println("Vendo taxa de problema por veículo");
        System.out.println("====================================");
        for (Veiculo veiculo : listaDeVeiculos) {
            if (veiculo instanceof OnibusEletrico) {
                OnibusEletrico onibus = (OnibusEletrico) veiculo;
                System.out.println(onibus.getNome().trim() + " -> Taxa de Problema: " + onibus.calcularTaxaProblema());
            } else if (veiculo instanceof VanDeEntrega) {
                VanDeEntrega van = (VanDeEntrega) veiculo;
                System.out.println(van.getNome().trim() + " -> Taxa de Problema: " + van.calcularTaxaProblema());
            }
        }
    }

    public void visualizarVeiculoMaisProblematico() {
        System.out.println("====================================");
        System.out.println("Vendo veículo mais problemático");
        System.out.println("====================================");

        double maiorTaxa = -1;
        Veiculo veiculoMaisProblematico = null;

        for (Veiculo veiculo : listaDeVeiculos) {

            if (veiculo instanceof OnibusEletrico) {
                OnibusEletrico onibus = (OnibusEletrico) veiculo;
                if (onibus.calcularTaxaProblema() > maiorTaxa) {
                    veiculoMaisProblematico = onibus;
                    maiorTaxa = onibus.calcularTaxaProblema();
                }
            } else if (veiculo instanceof VanDeEntrega) {
                VanDeEntrega van = (VanDeEntrega) veiculo;
                if (van.calcularTaxaProblema() > maiorTaxa) {
                    veiculoMaisProblematico = van;
                    maiorTaxa = van.calcularTaxaProblema();
                }
            }
        }
        if (veiculoMaisProblematico == null) {
            JOptionPaneUtil.mostrarMensagemErro("Erro ao buscar veículo mais problemático.");
        } else {
            System.out.println("Veículo mais problemático: " + veiculoMaisProblematico.getNome() + " Taxa de problema: " + maiorTaxa);
        }
    }

    public void visualizarListaDeVeiculos() {
        System.out.println("====================================");
        System.out.println("Vendo lista geral de veículos");
        System.out.println("====================================");
        for (Veiculo v : listaDeVeiculos) {
            System.out.println(v.toString());
        }
    }

}

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public ArrayList<Retangulo> retanguloList = new ArrayList<>();

    public void executar(Scanner leitor) {

        Ponto2D p1 = new Ponto2D(10, 50);  // superior esquerdo
        Ponto2D p2 = new Ponto2D(100, 10); // inferior direito

        Retangulo ret = new Retangulo(p1, p2);

        retanguloList.add(ret);

        boolean executar = true;
        int escolha;
        JOptionPane.showMessageDialog(null, "Bem vindo ao Retangulos da FURB!");

        do {
            String opc = JOptionPane.showInputDialog(null, "Menu Retângulos \n1 - Ver Retângulos\n2 - Criar Retângulo\n3 - Excluir Retângulo\n4 - Editar\n5 - Verificar Ponto\n6 - Sair");
            try {
                escolha = Integer.parseInt(opc);
            } catch (IllegalArgumentException e) {
                escolha = 0;
            }

            switch (escolha) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Vendo Retângulos", "Menu", JOptionPane.INFORMATION_MESSAGE);
                    int indexRetanguloExibir;
                    boolean exibir = true;

                    while (exibir) {
                        indexRetanguloExibir = mostrarListaRetangulos();
                        if (indexRetanguloExibir == 0) {
                            exibir = false;
                        } else {
                            exibirRetangulo(indexRetanguloExibir-1);
                        }
                    }

                    break;

                case 2:
                    JOptionPane.showMessageDialog(null,"Criando Retângulo", "Menu", JOptionPane.INFORMATION_MESSAGE);
                    Retangulo newRetangulo = criarRetangulo();
                    if (newRetangulo != null) {
                        salvarRetangulo(newRetangulo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Dados inválidos para um retângulo, tente novamente!");
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,"Excluir Retângulo", "Menu", JOptionPane.INFORMATION_MESSAGE);
                    int index = mostrarRetangulosMenu();
                    try {
                        excluirRetangulo(index);
                    } catch (IndexOutOfBoundsException e) {
                        JOptionPane.showMessageDialog(null, "Este retângulo não existe! Tente novamente", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 4:
                    editarRetangulo();
                    break;

                case 5:
                    verificarPonto();
                    break;

                case 6:
                    executar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        } while (executar);
    }

    public void editarRetangulo() {
        int indexRetanguloEditar = mostrarRetangulosMenu();

        if (indexRetanguloEditar >= 0 && indexRetanguloEditar <= retanguloList.size()) {
            JOptionPane.showMessageDialog(null, retanguloList.get(indexRetanguloEditar).toString());

            double x1SE = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe X1"));

            double y1SE = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe Y1"));

            double x2ID = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe X2"));

            double y2ID = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe Y2"));

            Ponto2D novoPontoSE = new Ponto2D(x1SE, y1SE);
            Ponto2D novoPontoID = new Ponto2D(x2ID, y2ID);

            retanguloList.get(indexRetanguloEditar).setInferiorDireito(novoPontoSE);
            retanguloList.get(indexRetanguloEditar).setInferiorDireito(novoPontoID);

        } else {
            throw new IndexOutOfBoundsException("Opção fora Array");
        }
    }

    public void excluirRetangulo(int index) throws IndexOutOfBoundsException {
        if (index > 0 && index <= retanguloList.size()) {
            retanguloList.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Opção fora Array");
        }
    }

    public Retangulo criarRetangulo() {
        double x1SE = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe X1"));

        double y1SE = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe Y1"));

        double x2ID = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe X2"));

        double y2ID = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe Y2"));

        Ponto2D pontoSE = new Ponto2D(x1SE, y1SE);
        Ponto2D pontoID = new Ponto2D(x2ID, y2ID);

        try {
            Retangulo novoRetangulo = new Retangulo(pontoSE, pontoID);
            return novoRetangulo;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Dados inválidos para um retângulo, tente novamente!");
        }
         return null;
    }

    public void verificarPonto() {
        double xBusca = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe X"));
        double yBusca = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe Y"));

        Ponto2D pontoBusca = new Ponto2D(xBusca, yBusca);
        int contador = 0;
        StringBuilder menuVerificarPonto = new StringBuilder();
        menuVerificarPonto.append("RETÂNGULOS QUE CONTEM O PONTO" + " (X:"+xBusca + " Y:" + yBusca +")\n");

        for (Retangulo retangulo : retanguloList) {
            contador++;
            if (retangulo.contem(pontoBusca)) {
                menuVerificarPonto.append("Retângulo ").append(contador).append("\n");
                menuVerificarPonto.append("P1: " + retangulo.getSuperiorEsquerdo() + " P2:" + retangulo.getInferiorDireito());
            }
        }

    }

    public int mostrarListaRetangulos() {
        boolean indexValido = false;
        int contador = 0;

        StringBuilder menuMostrarRetangulos = new StringBuilder();

        menuMostrarRetangulos.append("ESCOLHA UM RETÂNGULO PARA VER DETALHES\n");
        for (Retangulo retangulo : retanguloList) {
            contador++;
            menuMostrarRetangulos.append("Retângulo ").append(contador).append("\n");
        }
        menuMostrarRetangulos.append("0 Para sair\n");

        int index;
        do {
            String stringIndex = JOptionPane.showInputDialog(null, menuMostrarRetangulos.toString(), "Mostrando Retângulos", JOptionPane.INFORMATION_MESSAGE);
            index = converterStringToInt(stringIndex);

            if (index == 0 || index <= retanguloList.size() && index > 0) {
                indexValido = true;
            }

        } while (!indexValido);

        return index;
    }


    public int mostrarRetangulosMenu() {
        int contador = 0;
        StringBuilder menu = new StringBuilder();

        for(Retangulo retangulo : retanguloList) {
            contador++;
            menu.append(contador).append(" Retângulo").append("\n");
            menu.append("-----------------------\n");
        }

        String escolha = JOptionPane.showInputDialog(null, menu.toString(), "Lista de Retângulos", JOptionPane.INFORMATION_MESSAGE);
        int escolhaInt = Integer.parseInt(escolha);

        return (escolhaInt-1);
    }

    public void exibirRetangulo(int index) {
        JOptionPane.showMessageDialog(null, "Retângulo " + (index+1) + "\n" + retanguloList.get(index).toString());
    }

    public int converterStringToInt(String string) throws IllegalArgumentException {
        try {
            return Integer.parseInt(string);
        } catch (IllegalArgumentException e) {
            throw  new IllegalArgumentException("Não foi possível converter");
        }
    }

    public void salvarRetangulo(Retangulo novoRetangulo) {
        retanguloList.add(novoRetangulo);
    }
}

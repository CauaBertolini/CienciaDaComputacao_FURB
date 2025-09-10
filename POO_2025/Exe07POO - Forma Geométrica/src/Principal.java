import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public ArrayList<Retangulo> retanguloList = new ArrayList<>();

    public void executar(Scanner leitor) {
        boolean executar = true;
        int escolha;
        JOptionPane.showMessageDialog(null, "Bem vindo ao Retangulos da FURB!");

        do {
            String opc = JOptionPane.showInputDialog(null, "Menu Retângulos \n1 - Ver Retângulos\n2 - Criar Retângulo\n3 - Excluir Retângulo\n4 - Editar\n5 - Sair");
            try {
                escolha = Integer.parseInt(opc);
            } catch (IllegalArgumentException e) {
                escolha = 0;
            }

            switch (escolha) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Vendo Retângulos", "Menu", JOptionPane.INFORMATION_MESSAGE);
                    mostrarRetangulos();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Criando Retângulo", "Menu", JOptionPane.INFORMATION_MESSAGE);
                    criarRetangulo();
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
                    break;
                case 5:
                    executar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        } while (executar);

    }


    public void criarRetangulo() {
        double x1SE = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe X1"));

        double y1SE = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe Y1"));

        double x2ID = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe X2"));

        double y2ID = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe Y2"));

        Ponto2D pontoSE = new Ponto2D(x1SE, y1SE);
        Ponto2D pontoID = new Ponto2D(x2ID, y2ID);

        Retangulo novoRetangulo = new Retangulo(pontoSE, pontoID);

        retanguloList.add(novoRetangulo);
    }

    public void editarRetangulo() {

    }

    public void excluirRetangulo(int index) throws IndexOutOfBoundsException {
        if (index > 0 && index <= retanguloList.size()) {
            retanguloList.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Opção fora Array");
        }
    }

    public void mostrarRetangulos() {
        boolean mostrar = true;
        int contador = 0;

        StringBuilder menu = new StringBuilder();

        menu.append("ESCOLHA UM RETÂNGULO PARA VER DETALHES\n");
        for (Retangulo retangulo : retanguloList) {
            contador++;
            menu.append("Retângulo ").append(contador).append("\n");
        }
        menu.append("0 Para sair\n");

        do {
            String stringIndex = JOptionPane.showInputDialog(null, menu.toString(), "Mostrando Retângulos", JOptionPane.INFORMATION_MESSAGE);
            int index = converterStringToInt(stringIndex) -1 ;

            if (index == -1) {
                mostrar = false;
            } else {
                JOptionPane.showMessageDialog(null, retanguloList.get(index).toString());
            }
        } while (mostrar);
    }

    public int mostrarRetangulosMenu() {
        int contador = 0;
        StringBuilder menu = new StringBuilder();

        for(Retangulo retangulo : retanguloList) {
            contador++;
            menu.append("Retângulo ").append(contador).append("\n");
            menu.append("-----------------------\n");
            menu.append(retangulo.toString()).append("\n");
            menu.append("-----------------------");
        }

        String escolha = JOptionPane.showInputDialog(null, menu.toString(), "Lista de Retângulos", JOptionPane.INFORMATION_MESSAGE);
        int escolhaInt = Integer.parseInt(escolha);
        return escolhaInt - 1;
    }

    public int converterStringToInt(String string) throws IllegalArgumentException {
        try {
            return Integer.parseInt(string);
        } catch (IllegalArgumentException e) {
            throw  new IllegalArgumentException("Não foi possível converter");
        }
    }
}

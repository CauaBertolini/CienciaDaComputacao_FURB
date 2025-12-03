// Cauã Fernando Bertolini

package util;

import javax.swing.*;

public class JOptionPaneUtil {

    public static void mostrarMensagemErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarMensagemSucesso(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }


    public static void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }

    public static char mostrarMenu(String mensagem) {
        char escolha = JOptionPane.showInputDialog(null, mensagem, "Menu", JOptionPane.INFORMATION_MESSAGE).charAt(0);
        return escolha;
    }

    public static String coletarStringSemVirgulas(String mensagem) {
        String string = JOptionPane.showInputDialog(null, mensagem, "Preencha", JOptionPane.INFORMATION_MESSAGE);
        return string.replace(",", ".").toUpperCase();
    }

    public static int coletarInt(String mensagem) {
        int dadoInt = -1;

        while (dadoInt < 0) {
            try {
                String stringInt = JOptionPane.showInputDialog(null, mensagem, "Preencha", JOptionPane.INFORMATION_MESSAGE);
                dadoInt = Integer.parseInt(stringInt.trim());

                if (dadoInt < 0) {
                    JOptionPaneUtil.mostrarMensagemErro("Informe um valor de 0 para cima");
                }
            } catch (IllegalArgumentException e) {
                JOptionPaneUtil.mostrarMensagemErro("Dado informado inválido, é preciso ser um número inteiro.");
            }

        }
        return dadoInt;
    }
}

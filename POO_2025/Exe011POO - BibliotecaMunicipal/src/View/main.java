package View;

import Control.Biblioteca;

import javax.swing.*;

public class main {

    public static void main(String args[]) {
        Biblioteca biblioteca = new Biblioteca();
        char opcao = '0';

        JOptionPane.showMessageDialog(null, "Bem vindo á Biblioteca!");

        do {
            opcao = JOptionPane.showInputDialog(null, "Qual ação deseja fazer:\n" +
                    "1 - Listar Acervo\n" +
                    "2 - Pegar Livro Emprestado\n" +
                    "3 - Devolver Livro\n" +
                    "4 - Sair").charAt(0);

            switch (opcao) {
                case '1':
                    JOptionPane.showInputDialog(null, "Acervo Biblioteca\n" + biblioteca.listar());
                    break;

                case '2':

                    break;

                case '3':

                    break;

                case '4':

                    break;
            }

        } while (opcao != '4');


    }






}

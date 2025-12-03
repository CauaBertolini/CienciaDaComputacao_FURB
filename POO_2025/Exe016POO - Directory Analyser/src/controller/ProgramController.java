package controller;

import javax.swing.*;

public class ProgramController {

    private boolean condicaoParada;
    private DocumentsExplorer documentsExplorer;

    private StringBuilder menu;

    public ProgramController() {
        condicaoParada = false;
        documentsExplorer = new DocumentsExplorer();
        menu = new StringBuilder();

        menu.append("Escolha uma opção:\n");
        menu.append("[ 1 ] - Inspecionar Diretório\n");
        menu.append("[ 2 ] - Sair\n");

        menuPrincipal();
    }

    public void menuPrincipal() {
        while (!condicaoParada) {
            JOptionPane.showMessageDialog( null ,"Explorador de arquivos ALPHA");
            char opcao = (JOptionPane.showInputDialog(null, menu.toString())).charAt(0);

            switch (opcao) {
                case '1':
                    String caminho = documentsExplorer.abriSeletorDeDiretório();
                    if (documentsExplorer.validarCaminho(caminho)) {
                        long tamanhoDiretorio = documentsExplorer.inspecionarTamanhoDiretorio(caminho);
                        if (tamanhoDiretorio > 0) {
                            JOptionPane.showMessageDialog(null,"O diretório informado ocupa: " + tamanhoDiretorio + " megabytes.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Diretório inválido!");
                        }
                    }
                    break;

                case '2':
                    condicaoParada = true;
                    break;
            }
        }
    }




}

package controller;

import javax.swing.*;
import java.io.File;

public class DocumentsExplorer {

    public String abriSeletorDeDiretório() {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // Se a opção do usuário for uma confirmação, ou seja, APPROVE, ele retorna um valor.
        if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            return  jFileChooser.getSelectedFile().getAbsolutePath();
        }

        return null;
    }

    public boolean validarCaminho(String caminho) {
        File file = new File(caminho);
        if (file.exists()) {
            return true;
        }
        return false;
    }

    public long inspecionarTamanhoDiretorio(String diretorio) {
        long tamanhoDiretorio = 0;

        File pasta = new File(diretorio);

        System.out.println("Pasta -> " + pasta.getName());

        if (pasta.exists()) {
            File[] itens = pasta.listFiles();

            if (itens != null) {
                for (File file : itens) {
                    if (file.isFile()) {
                        System.out.println("    " + file.getName());
                        tamanhoDiretorio += file.length();
                    } else if (file.isDirectory()) {
                        tamanhoDiretorio += inspecionarTamanhoDiretorio(file.getAbsolutePath());
                    }
                }
                return (tamanhoDiretorio / 1000000);
            }

        }

        return -1;
    }

}

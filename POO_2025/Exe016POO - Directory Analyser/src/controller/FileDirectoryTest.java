package controller;

import java.io.File;

public class FileDirectoryTest {
    public void verDiretorioWindows() {
        File diretorio = new File("C:\\Windows");
        File[] conteudoDiretorio = diretorio.listFiles();
        for (File item : conteudoDiretorio) {
            if (item.isDirectory()) {
                System.out.println("Diretório: " + item.getName());
            } else {
                System.out.println("Arquivo " + item.getName() +
                        "tem " + item.length() + " bytes");
            }
        }
    }
}

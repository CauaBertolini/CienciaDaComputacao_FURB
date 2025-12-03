// Arquivo: Questao2Main.java
import exception.ArgumentoNaoEhArquivoException;
import exception.ArquivoNaoTemTagMp3;
import model.ArquivoMp3;
import model.TagMp3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class InspecionadorMp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo MP3:");
        String caminho = scanner.nextLine();

        try {
            ArquivoMp3 arquivo = new ArquivoMp3(caminho); // [cite: 57]
            TagMp3 tag = arquivo.getTagMp3();

            // Exibir dados se tiver sucesso [cite: 62]
            System.out.println("--- Informações do MP3 ---");
            System.out.println(tag.toString());

        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado.");
        } catch (ArgumentoNaoEhArquivoException e) {
            System.err.println("Erro: O caminho indicado é uma pasta.");
        } catch (ArquivoNaoTemTagMp3 e) {
            System.err.println("Erro: Arquivo sem tags ID3.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
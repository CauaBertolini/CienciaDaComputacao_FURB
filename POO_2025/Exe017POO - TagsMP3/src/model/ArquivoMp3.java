package model;

import exception.ArgumentoNaoEhArquivoException;
import exception.ArquivoNaoTemTagMp3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ArquivoMp3 {
    private TagMp3 tag;

    // [cite: 17, 44] Construtor que processa o arquivo
    public ArquivoMp3(String nomeArquivo) throws FileNotFoundException {
        File f = new File(nomeArquivo);

        // [cite: 58] Validação se existe
        if (!f.exists()) {
            throw new FileNotFoundException("Arquivo não encontrado: " + nomeArquivo);
        }

        // [cite: 59, 60] Validação se é arquivo e não diretório
        if (!f.isFile()) {
            throw new ArgumentoNaoEhArquivoException(nomeArquivo);
        }

        try {
            lerTag(f);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public TagMp3 getTagMp3() {
        return this.tag;
    }

    private void lerTag(File f) throws IOException {
        // [cite: 46] Usa RandomAccessFile para ir direto ao final do arquivo
        try (RandomAccessFile raf = new RandomAccessFile(f, "r")) {
            long tamanho = raf.length();

            // Se o arquivo for menor que 128 bytes, impossível ter tag
            if (tamanho < 128) {
                throw new ArquivoNaoTemTagMp3(f.getName());
            }

            // [cite: 55] Posiciona o cursor no início dos últimos 128 bytes
            raf.seek(tamanho - 128);

            byte[] buffer = new byte[128];
            raf.read(buffer); // Lê os 128 bytes para a memória

            // [cite: 55] Verifica os 3 primeiros bytes ("TAG")
            String cabecalho = new String(buffer, 0, 3);
            if (!cabecalho.equals("TAG")) {
                throw new ArquivoNaoTemTagMp3(f.getName());
            }

            // Instancia a Tag para preencher
            this.tag = new TagMp3();

            //  Extração baseada na tabela de bytes
            // A função trim() é usada para remover espaços em branco ou nulos do final das Strings

            // Título: bytes 3 a 32 (30 chars)
            this.tag.setTitulo(new String(buffer, 3, 30).trim());

            // Artista: bytes 33 a 62 (30 chars)
            this.tag.setArtista(new String(buffer, 33, 30).trim());

            // Álbum: bytes 63 a 92 (30 chars)
            this.tag.setAlbum(new String(buffer, 63, 30).trim());

            // Ano: bytes 93 a 96 (4 chars) - É armazenado como string no ID3v1
            String anoStr = new String(buffer, 93, 4).trim();
            try {
                this.tag.setAno(Integer.parseInt(anoStr));
            } catch (NumberFormatException e) {
                this.tag.setAno(0); // Ano inválido ou vazio
            }

            // Comentário: bytes 97 a 124 (28 chars na versão 1.1)
            this.tag.setComentario(new String(buffer, 97, 28).trim());

            //  Verificação da versão 1.1 para número da faixa
            // Byte 125 deve ser 0 (Flag de trilha) e Byte 126 é o número da faixa
            if (buffer[125] == 0) {
                this.tag.setNumeroFaixa(Byte.toUnsignedInt(buffer[126]));
            } else {
                this.tag.setNumeroFaixa(0);
            }

            // Gênero: Byte 127
            this.tag.setGenero(Byte.toUnsignedInt(buffer[127]));
        }
    }
}

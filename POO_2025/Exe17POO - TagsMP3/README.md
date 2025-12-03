# 🎵 Leitor de Tags MP3 (ID3v1.1) - Implementação Java

Este projeto consiste na implementação de um leitor de metadados para arquivos de áudio MP3, desenvolvido como solução para a **Lista de Exercícios 13** da disciplina de Programação Orientada a Objetos (FURB)[cite: 3, 9].

O objetivo é manipular arquivos binários para extrair informações (título, artista, álbum, etc.) seguindo a especificação da norma **ID3v1.1**.

---

## 🏗️ Arquitetura do Projeto

A solução foi estruturada seguindo o princípio de separação de responsabilidades, conforme o diagrama de classes proposto:

### 1. Modelo de Dados (`TagMp3`)
Uma classe do tipo DTO (Data Transfer Object) responsável apenas por armazenar os dados lidos. Ela não contém regras de negócio ou lógica de acesso a disco, apenas atributos privados e métodos `get/set` [cite: 26, 30-43].

### 2. Lógica de Negócio (`ArquivoMp3`)
* Esta é a classe principal que encapsula a complexidade da manipulação de arquivos.
* **Responsabilidade:** Abrir o arquivo físico, validar sua integridade e converter os bytes brutos em informações legíveis.
* **Validações:** Verifica se o arquivo existe e se não é um diretório antes de tentar ler .

### 3. Tratamento de Erros (Exceptions)
* Para garantir robustez e semântica, foram criadas exceções específicas que herdam de `IllegalArgumentException`:
* `ArgumentoNaoEhArquivoException`: Lançada quando o caminho informado aponta para uma pasta.
* `ArquivoNaoTemTagMp3`: Lançada quando o arquivo é lido, mas não possui a assinatura "TAG" no final.

---

## 📚 Explicação Didática da Implementação

Abaixo detalhamos os conceitos técnicos utilizados para resolver o problema da leitura de bytes.

### 1. Acesso Aleatório (`RandomAccessFile`)
Diferente da leitura de arquivos de texto (onde lemos linha por linha do começo ao fim), arquivos MP3 exigem acesso direto a posições específicas.
* **O Problema:** A tag ID3v1 está localizada nos **últimos 128 bytes** do arquivo. Ler um arquivo de áudio de 10MB inteiro apenas para pegar o final seria ineficiente.
* **A Solução:** Utilizamos a classe `RandomAccessFile` do Java.
    * O método `.seek(posicao)` move o "cursor" de leitura para qualquer lugar do arquivo.
    * Fórmula: `posicao_inicial = tamanho_total_do_arquivo - 128`.

### 2. Mapeamento de Bytes (Parsing)
Ao ler os 128 bytes finais para um array (`byte[] buffer`), o programa "fatia" esse array seguindo estritamente a tabela de especificação[cite: 54]:

| Campo | Tamanho | Posição no Array | Tipo de Dado |
| :--- | :--- | :--- | :--- |
| **Cabeçalho** | 3 bytes | `0` a `2` | Deve conter a string "TAG" |
| **Título** | 30 bytes | `3` a `32` | String |
| **Artista** | 30 bytes | `33` a `62` | String |
| **Álbum** | 30 bytes | `63` a `92` | String |
| **Ano** | 4 bytes | `93` a `96` | String (convertida p/ int) |
| **Comentário** | 28 bytes | `97` a `124` | String |
| **Flag** | 1 byte | `125` | Byte (valor zero) |
| **Faixa** | 1 byte | `126` | Int (número da faixa) |
| **Gênero** | 1 byte | `127` | Int (código do gênero) |

> **Detalhe Técnico:** Utilizamos o método `.trim()` ao converter os bytes em Strings. Isso é necessário porque os campos têm tamanho fixo; se o título da música for curto, o restante dos 30 bytes será preenchido com espaços ou nulos, que devem ser removidos.

### 3. A Lógica da Versão ID3v1.1
Originalmente, o campo de comentário tinha 30 bytes. Na versão 1.1, os dois últimos bytes do comentário foram reutilizados para guardar o número da faixa.
* **Lógica implementada:** O programa verifica o byte na posição **125**.
    * Se for `0` (zero/nulo), significa que o byte **126** contém o número da faixa.
    * Se não for zero, assume-se que é uma tag da versão 1.0 e o byte faz parte do texto do comentário.

### 4. Tratamento de Tipos Primitivos
O Java trata o tipo `byte` com sinal (intervalo de -128 a 127). Para campos como "Gênero" ou "Faixa", que podem exceder 127 (ex: gênero ID 140), a leitura direta resultaria em um número negativo.
* **Solução:** Utilizamos `Byte.toUnsignedInt(byte)` para converter corretamente o valor binário para um inteiro positivo (0-255).

---

## 🚀 Como Executar

1. Compile todas as classes `.java`.
2. Execute a classe principal `InspecionadorMp3`.
3. Insira o caminho absoluto de um arquivo `.mp3` no console quando solicitado.

**Exemplo de Saída:**
```text
Digite o caminho do arquivo MP3:
C:\Musicas\Audioslave_LikeAStone.mp3

--- Informações do MP3 ---
Música: Like a Stone
Artista: Audioslave
Álbum: Audioslave
Ano: 2002
Faixa: 5
Comentário:
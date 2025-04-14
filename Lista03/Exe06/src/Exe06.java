import java.util.Scanner;

public class Exe06 {
    /*
     * Análise: Ok
     * Entradas: Caractere
     * Saídas: mensagem 
     * Processo:
     * se Caractere M -> mensagem = "Masculino"
     * senão se Caractere F -> mensagem = "Feminino"
     * senão se Caractere I -> mensagem = "Não Informado"
     * senão -> mensagem = "Entrada incorreta"
     * 
     * Testes:
     * M -> Masculino 
     * F -> Feminino 
     * I -> Não informado 
     */
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Informe seu gênero: (M/F ou I) ");
    String resposta = scanner.nextLine();
    
    resposta = resposta.toUpperCase();

    char letra = resposta.charAt(0);
    
    if (letra == 'M') {
        System.out.println("Masculino");
    } else if (letra == 'F') {
        System.out.println("Feminino");
    } else if (letra == 'I') {
        System.out.println("Não informado");
    } else {
        System.out.println("Entrada incorreta");
    }
    
    scanner.close();
    }
}
    

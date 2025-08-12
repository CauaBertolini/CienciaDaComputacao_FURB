import java.util.Scanner;

public class Exe08 {
    /*
     * Análise: Ok
     * Entradas: letra
     * Saídas: Se é ou não vogal
     * Processo: verificar se a letra informada pelo usuário é uma vogal ou não.
     * 
     * Testes:
     * u -> é vogal
     * O -> é vogal
     * D -> NÃO é vogal
     */
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Informe a letra: ");
    String letra = scanner.next();

    letra = letra.toLowerCase();

    if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
        System.out.println("É vogal");
    } else {
        System.out.println("NÃO é vogal");
    }
    scanner.close();
    }
}
    

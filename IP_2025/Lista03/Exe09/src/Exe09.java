import java.util.Scanner;

public class Exe09 {
    /*
     * Análise: Entradas ok
     * Entradas: n1, n2
     * Saídas: se são múltiplos ou não
     * Processo: validar se os dois valores inseridos são múltiplos ou não.
     * Testes:
     * 9 e 3 -> São múltiplos
     * 2 e 7 -> Não são múltiplos
     * 15 e 3 -> São múltiplos
     */
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Informe dois valores inteiros separados por um espaço: ");
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();

    if(n1 % n2 == 0 || n2 % n1 == 0) {
        System.out.println("São múltiplos");
    } else {
        System.out.println("Não são múltiplos");
    }

    scanner.close();
    }
}
    

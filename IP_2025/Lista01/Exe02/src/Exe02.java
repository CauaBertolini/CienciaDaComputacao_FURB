import java.util.Scanner;

public class Exe02 {
    /*
     * Leia 2 valores inteiros e imprima sua multiplicação.
     * Análise: Tudo certo
     * Entradas: n1, n2
     * Saídas: produto
     * Processo: produto = n1 * n2 
     * Fluxograma:
     * Testes: 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Número 2: ");
        int n2 = scanner.nextInt();
        int produto = n1*n2;
        System.out.println(n1 + " X " + n2 + " = " + produto);

        scanner.close();

    }
    
}

import java.util.Scanner;

public class Exe01 {
    /*
     * Leia 2 valores inteiros e imprima sua soma.
     * Análise: valores de entrada ok
     * Entradas: n1 e n2
     * Saídas: soma
     * Processo: soma = n1 + n2
     * Fluxorama:  resultado
     * Testes: 2 + 3 = 5 / 2 + 8 = 10
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("segundoo número: ");
        int n2 = scanner.nextInt();
        int soma = n1 + n2;
        System.out.println(soma);

        scanner.close();

    }
}

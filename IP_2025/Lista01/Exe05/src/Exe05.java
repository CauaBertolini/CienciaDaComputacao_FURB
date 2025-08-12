import java.util.Scanner;

public class Exe05 {
     /*
     * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
     * Análise: Tudo certo
     * Entradas: A, B, C, D
     * Saídas: produto da diferença do produto AB e CD
     * Processo: (A * B) - (C * D)
     * Fluxograma:
     * Testes: 
     */
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();
        System.out.print("D: ");
        int d = scanner.nextInt();
        int produto = (a * b) - (c * d);
        System.out.println(produto);

        scanner.close();
    }
}

import java.util.Scanner;
/*
 * Análise: Enunciado ok
 * Entradas: numero
 * Saídas: se é par ou impar
 * Processo:
 * se numero % 2 == 0 -> é par
 * senao -> é ímpar
 * Testes:
 * 2 -> é par
 * 3 -> é ímpar
 * 9 -> é ímpar
 */

public class Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor inteiro maior do que 0: ");
        int valor = scanner.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número é ímpar.");
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Exe04 {
    /*
     * Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a nota A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.
     * Análise: Tudo certo
     * Entradas: float n1, float n2
     * Saídas: media
     * Processo: (n1 + n2) / 2
     * Fluxograma:
     * Testes:
     * N1        [9][5][5]
     * N2        [8][6][7]
     * Média     [9.5][5.5][6]
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Número 1: ");
        double n1 = scanner.nextInt();

        System.out.println("Número 2: ");
        double n2 = scanner.nextInt();

        double media = (n1 * 3.5 + n2 * 7.5) / 11;
        System.out.println(media);

        scanner.close();

    }
}

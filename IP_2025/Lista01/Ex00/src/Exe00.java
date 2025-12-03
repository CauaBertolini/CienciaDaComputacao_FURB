import java.util.Scanner;

public class Exe00 {

    /*
     * Análise o problema: o nome não é utilizado
     * Entradas: n1, n2, n3, nome
     * Saída: media
     * Processo: media = (n1 + n2 + n3) / 3
     * Testes:
     * n1 | 9 | 9 | 8 |
     * n2 | 9 | 4 | 9 |
     * n3 | 9 | 5 | 7 |
     * media - 9 - 6 - 8 
     * Fluxograma: 
     */
    public static void main(String[] args) {
        System.out.println("Hello world and welcome to your journey in the Computer Science learning process!");
        System.out.println("We know that you have already learned this before!");
        System.out.println("But remeber to enjoy the process.");

        System.out.println();
        System.out.println("Sistema de médias INICIADO!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.next();

        System.out.print("Digite a primeira nota: ");
        float n1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float n2 = scanner.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float n3 = scanner.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.println("A média das notas " + n1 + ", " + n2 + " e " + n3 + " é " + media);

        scanner.close();
    }
}

import java.util.Scanner;

public class Exe24 {
    /*
     * Análise: Ok
     * Entradas: n1, n2, n3
     * Saídas: crescente, decrescente ou maior centralizado
     * Processo:
     * análise para ordenar crescente
     * análise para orddenar decrescente
     * análise para definir maior
     * Testes:
     * 1 3 2 escolha = 1 -> 1 2 3
     * 3 6 9 escolha = 2 -> 9 6 3
     * 90 10 20 escolha = 3 -> 10 90 20
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Terceiro número: ");
        int n3 = scanner.nextInt();

        System.out.print("Escolha 1, 2 ou 3: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:

                if (n1 < n2 && n2 < n3) {
                    System.out.println(n1 + " " + n2 + " " + n3);
                } else if (n1 < n3 && n3 < n2) {
                    System.out.println(n1 + " " + n3 + " " + n2);
                } else if (n2 < n1 && n1 < n3) {
                    System.out.println(n2 + " " + n1 + " " + n3);
                } else if (n2 < n3 && n3 < n1) {
                    System.out.println(n2 + " " + n3 + " " + n1);
                } else if (n3 < n1 && n1 < n2) {
                    System.out.println(n3 + " " + n1 + " " + n2);
                } else if (n3 < n2 && n2 < n1) {
                    System.out.println(n3 + " " + n2 + " " + n1);
                }

                break;

            case 2:

                if (n1 > n2 && n2 > n3) {
                    System.out.println(n1 + " " + n2 + " " + n3);
                } else if (n1 > n3 && n3 > n2) {
                    System.out.println(n1 + " " + n3 + " " + n2);
                } else if (n2 > n1 && n1 > n3) {
                    System.out.println(n2 + " " + n1 + " " + n3);
                } else if (n2 > n3 && n3 > n1) {
                    System.out.println(n2 + " " + n3 + " " + n1);
                } else if (n3 > n1 && n1 > n2) {
                    System.out.println(n3 + " " + n1 + " " + n2);
                } else if (n3 > n2 && n2 > n1) {
                    System.out.println(n3 + " " + n2 + " " + n1);
                }
                break;

            case 3:

                if (n1 > n2 && n1 > n3) {
                    System.out.println(n2 + " " + n1 + " " + n3);
                } else if (n2 > n1 && n2 > n3) {
                    System.out.println(n1 + " " + n2 + " " + n3);
                } else {
                    System.out.println(n1 + " " + n3 + " " + n2);
                }

            default:
                break;
        }

        scanner.close();
    }
}
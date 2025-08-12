import java.util.Scanner;
/*
 * Análise: Ok
 * Entradas: n1, n2, escolha;
 * Saídas: Soma, Diferença, Produto da Divisão ou Multiplicação.
 * Processo: Verificar a escolha do usuário para realizar a operação correspondente.  
 * 
 * Testes:
 * escolha = 1 -> 3 e 4 -> soma = 7
 * escolha = 2 -> 5 e 2 -> diferença = 3
 * escolha = 4 -> 20 e 0 -> cálculo impossível
 */

public class Exe25 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("""
CALCULADORA FURB PRÉ-ALPHA
1 - Soma de dois números
2 - Diferença entre dois números
3 - Produto entre dois números
4 - Divisão entre dois números
-------------------------------------
                """);
        System.out.print("Sua escolha: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("-------------------------------------");
                System.out.println("SOMANDO");
                System.out.println("-------------------------------------");
                System.out.print("Número 1: ");
                n1 = scanner.nextInt();
                System.out.print("Número 2: ");
                n2 = scanner.nextInt();

                System.out.println(n1 + n2);
                break;

            case 2:
                System.out.println("-------------------------------------");
                System.out.println("SUBTRAINDO");
                System.out.println("-------------------------------------");
                System.out.print("Número 1: ");
                n1 = scanner.nextInt();
                System.out.print("Número 2: ");
                n2 = scanner.nextInt();

                System.out.println(n1 - n2);
                break;

            case 3:
                System.out.println("-------------------------------------");
                System.out.println("MULTIPLICANDO");
                System.out.println("-------------------------------------");
                System.out.print("Número 1: ");
                n1 = scanner.nextInt();
                System.out.print("Número 2: ");
                n2 = scanner.nextInt();

                System.out.println(n1 * n2);
                break;

            case 4:
                System.out.println("-------------------------------------");
                System.out.println("DIVISÃO");
                System.out.println("-------------------------------------");
                System.out.print("Número 1: ");
                n1 = scanner.nextInt();
                System.out.print("Número 2: ");
                n2 = scanner.nextInt();

                if (n2 == 0) {
                    System.out.println("CÁLCULO IMPOSSÍVEL, SEU COMPUTADOR EXPLODIRÁ!");
                } else {
                    System.out.println(n1 / n2);
                }
                break;
            default:
                break;
        }

        scanner.close();
    }
}

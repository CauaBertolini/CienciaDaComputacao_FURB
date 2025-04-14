import java.util.Scanner;
/*
 * Análise: Ok
 * Entradas: numero1 e numero2
 * Saídas: maior
 * Processo:
 * se (numero1 > numero2) -> maior = numero1
 * senão -> maior = numero2
 * 
 * Teste:
 * (2, 5) = 5
 * (3, 8) = 8
 * (9, 6) = 9 
 */

public class Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe um segundo numero: ");
        int numero2 = scanner.nextInt();

        int maior;

        if (numero1 > numero2) {
            maior = numero1;
        } else {
            maior = numero2;
        }

        System.out.print("O número maior é " + maior);


        scanner.close();
    }
}

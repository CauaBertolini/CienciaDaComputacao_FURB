/*
Entradas: valor
Saídas: par ou ímpar
 */

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Digite o %d° número: ", i);
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("ÍMPAR");
            }
        }

        scanner.close();
    }
}

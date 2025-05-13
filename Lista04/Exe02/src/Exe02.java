import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somaPar += i;
            } else {
                somaImpar += i;
            }
        }

        System.out.printf("Soma dos pares = %d\nSoma dos ímpares = %d", somaPar, somaImpar);

        scanner.close();
    }
}

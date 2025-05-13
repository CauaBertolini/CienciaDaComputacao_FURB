import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double soma = 0.0;

        for (double i = 1; i <= 100; i++) {
            soma += 1.0/i;
        }

        System.out.println(soma);

        scanner.close();
    }
}

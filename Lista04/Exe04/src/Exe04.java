import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double denominador = 1;
        double numerador = 3;

        double soma = 0;

        for (int i = 1; i <= 20; i++) {

            denominador = i * (i+1);

            soma += ((numerador / denominador));

            System.out.println( i + "° Par " + "[" + numerador + " / " + denominador + "]");

            numerador = numerador + 2;
        }

        System.out.println("Soma das divisões entre os pares ordenados = " + soma);

        scanner.close();

    }
}


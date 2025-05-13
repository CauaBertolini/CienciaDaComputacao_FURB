import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int menorNegativo = 0;
        double somaPositivos = 0;
        int qtdPositivos = 0;

        System.out.print("Informe um número natural: ");
        int n =  scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "° número inteiro: ");
            int numero = scanner.nextInt();

            if (numero < 0) {

                if (i == 1) {
                    menorNegativo = numero;
                } else if (numero < menorNegativo) {
                    menorNegativo = numero;
                }

            } else if (numero >= 0){
                somaPositivos += numero;
                qtdPositivos++;
            }

        }
        System.out.println(qtdPositivos);
        System.out.println(somaPositivos);
        System.out.println("Menor negativo: " + menorNegativo + "\nMédia dos positivos: " + somaPositivos / qtdPositivos);

        scanner.close();

    }
}

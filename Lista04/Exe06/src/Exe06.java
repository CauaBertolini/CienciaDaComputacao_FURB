import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double altura = 0.0;
        double soma = 0.0;
        int qtdPessoas = 5;

        for (int i = 1; i <= qtdPessoas; i++) {
            System.out.print("Altura da " + i + "° pessoa: ");
            altura = scanner.nextDouble();

            soma = soma + altura;
        }

        System.out.println("Média das alturas: " + soma/qtdPessoas);

        scanner.close();

    }
}

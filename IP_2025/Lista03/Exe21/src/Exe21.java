import java.util.Scanner;

public class Exe21 {
    /*
     * Análise: Ok
     * Entradas: altura, massa
     * Saídas: situacao
     * Processo: 
     * imc = massa / Math.pow(altura, 2)
     * se imc < 18.5 -> situacao = Magreza
     * se imc >= 18.5 e <= 24.9 -> situacao = Saudável
     * se imc >= 25.0 e <= 29.9 -> situacao = Sobrepeso
     * se imc >= 30.0 e <= 34.9 => situacao = Obesidade Grau I
     * se imc >= 35.0 e <= 39.9 => situacao = Obesidade Grau II (Severa)
     * se imc >= 40.0 situacao = Obesidade Grau III (Mórbida)
     * Testes:
     * 1,75cm 63kg = Saudável
     * 1,80cm 70kg = Saudável
     * 1,63cm 80kg = Obesidade Grau I
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Peso: ");
        double massa = scanner.nextDouble();

        double imc = massa / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudável");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        } else if (imc >= 40) {
            System.out.println("Obesidade grau III (Mórbida)");
        }
        scanner.close();
    }
}

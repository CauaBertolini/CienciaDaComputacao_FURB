import java.util.Scanner;

public class Exe08 {
    /*
     * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.  
     * Análise: valores de entrada ok, códigos não utilizados.
     * Entradas: codigoPeca1, numeroPecas1, valorPeca1, codigoPeca2, numeroPecas2, valorPeca2 
     * Saídas: valorPagar
     * Processo: (numeroPecas1 * valorPeca1) + (numeroPecas2 * valorPeca2) 
     * Fluxorama:  
     * Testes: 
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Codigo peca 01: ");
        int codigoPeca1 = scanner.nextInt();

        System.out.print("Valor peça 01: ");
        double valorPeca1 = scanner.nextDouble();

        System.out.print("Quantidade de peças 01: ");
        int quantidadePecas1 = scanner.nextInt();

        System.out.print("Codigo peca 02: ");
        int codigoPeca2 = scanner.nextInt();

        System.out.print("Valor peça 02: ");
        double valorPeca2 = scanner.nextDouble();

        System.out.print("Quantidade de peças 02: ");
        int quantidadePecas2 = scanner.nextInt();

        double valorPagar = (quantidadePecas1 * valorPeca1) + (quantidadePecas2 * valorPeca2);

        System.out.println("O valor á pagar é de: R$ " + valorPagar%2.f);

        scanner.close();
    }
}

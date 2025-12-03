import java.util.Scanner;

public class Exe15 {
    /*
     * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. 
     * As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias. 
     * Análise: Entrada ok
     * Entradas: valorReal
     * Saídas: notas100, notas50, notas20, notas10, notas5, notas2, moeda1, moeda50, moeda25, moeda10, moeda5, moeda01.
     * Processo:
     * Fluxograma:
     * Testes:
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Valor: ");
        double valor =  leitor.nextDouble();

        int valorInteiro = (int) Math.floor(valor); // Pegamos o valor real (ex.: 135.56) e isolamos a parte inteira (135).
        int valorCentavo = (int) (valor - valorInteiro) * 100; // Utilizamos a parte inteira para deduzir da parte real (135.56 - 135 =  0.56 e multiplicamos por 100 para termos os centavos em inteiro também)

        int notas100 = valorInteiro / 100;
        valorInteiro = valorInteiro % 100;
        int notas50 = valorInteiro / 50;
        valorInteiro = valorInteiro % 50;
        int notas20 = valorInteiro / 20;
        valorInteiro = valorInteiro % 20;
        int notas10 = valorInteiro / 10;
        valorInteiro = valorInteiro % 10;
        int notas5 = valorInteiro / 5;
        valorInteiro = valorInteiro % 5;
        int notas2 = valorInteiro / 2;
        valorInteiro = valorInteiro % 5;
        int moeda1 = valorInteiro;
        
        int moeda50 = valorCentavo / 50;
        valorCentavo %= 50;
        int moeda25 = valorCentavo / 25;
        valorCentavo %= 25;
        int moeda10 = valorCentavo / 10;
        valorCentavo %= 10;
        int moeda5 = valorCentavo / 5;
        valorCentavo %= 5;
        int moeda01 = valorCentavo;

        System.out.println("Liberando dinheiro: ...");
        System.out.println(notas100 + " Notas de R$100");
        System.out.println(notas50 + " Notas de R$50");
        System.out.println(notas20 + " Notas de R$20");
        System.out.println(notas10 + " Notas de R$10");
        System.out.println(notas5 + " Notas de R$5");
        System.out.println(notas2 + " Notas de R$2");
        System.out.println(moeda1 + " Moedas de R$1");
        System.out.println(moeda50+ " Moedas de 50 centavos");
        System.out.println(moeda25 + " Moedas de 25 centavos");
        System.out.println(moeda10 + " Moedas de 10 centavos");
        System.out.println(moeda5 + " Moedas de 5 centavos");
        System.out.println(moeda01 + " Moedas de 1 centavos");

        System.out.println(valor);

        leitor.close();
    }
}

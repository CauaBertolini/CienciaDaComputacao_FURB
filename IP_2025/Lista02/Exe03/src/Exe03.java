import java.util.Scanner;

public class Exe03 {
    /*
    Análise: Enunciado ok
    Entradas: precoLitro, valorPago
    Saídas: litrosComprados
    Processo: litrosComprados = valorPago / precoLitro
    Testes: 
    Preço 5,75 // Valor pago 150,00 // Litros 26,09
    Preço 6,00 // Valor pago 80,00  // Litros 13,33
    Preço 9,78 // Valor pago 200,00 // Litros 20,45
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o preço do litro: ");
        double precoLitro = leitor.nextDouble();
        
        System.out.print("Informe o valor pago: ");
        double valorPago = leitor.nextDouble();

        double litrosComprados = valorPago / precoLitro;

        System.out.printf("Comprou %.2f litros.", litrosComprados);

         leitor.close();
    }
}

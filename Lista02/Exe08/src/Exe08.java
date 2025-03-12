import java.util.Scanner;

public class Exe08 {
    /*
    Análise: valores de entrada ok, apesar de não fornecer a cotação específica desejada.
    Entradas: valorDolar
    Saídas: valorReal
    Processo: valorReal = valorDolar * cotacaoDolarReal
    Testes: 
    U$50 = R$282,5
    U$100 = R$565,0
    U$34,87 = R$197,02
    */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double cotacaoDolarReal = 5.65;

        System.out.print("Valor a ser cambiado em USD: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = valorDolar * cotacaoDolarReal;

        System.out.printf("Valor cambiado R$%.2f", valorReal);

        scanner.close();
    }
}

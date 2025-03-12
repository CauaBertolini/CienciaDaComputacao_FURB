import java.util.Scanner;
    /*
     * Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. Considerando que o atendente tem a cotação do dólar, calcule quantos reais o atendente deve devolver para a pessoa. 
     * Análise: valores de entrada ok
     * Entradas: valorDolar, cotacaoDolarReal 
     * Saídas: valorReal
     * Processo: valorReal = valorDolar / cotacaoDolarReal
     * Fluxorama:  
     * Testes: 
     */
public class Exe09{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double cotacaoDolarReal = 5.20;

        System.out.print("Valor á cambiar: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = valorDolar * cotacaoDolarReal;

        System.out.println(valorReal);

        scanner.close();
    }
}

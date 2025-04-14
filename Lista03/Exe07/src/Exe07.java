import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe07 {
    /*
     * Análise: Ok
     * Entradas: peso
     * Saídas: valorPagar
     * Processo: receber um valor de peso de uma carta e calcular o valor a ser pago pelo usuario para colocar o selo nela.
     * 
     * Testes:
     * Peso da Carta: 20g -> Custo 0,45
     * Peso da Carta: 298g -> Custo 6,48
     * Peso da Carta: 1000g -> Custo 22,27
     */
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o peso da carta: (gramas) ");
    double peso = scanner.nextDouble();

    double valorPagar = 0;

    if (peso <= 50) {
        valorPagar = 0.45;
    } else {
        double pesoExcedido = peso - 50;
        double qtAdicional = (pesoExcedido / 20) + 1;
        valorPagar = 0.45f + 0.45f * qtAdicional;
    }
    
    DecimalFormat format = new DecimalFormat("#0.0000");

    System.out.println("Custo do selo: " + format.format(valorPagar));
    
    scanner.close();
    }
}
    

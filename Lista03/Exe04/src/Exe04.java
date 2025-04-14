import java.util.Scanner;

public class Exe04 {
    /*
     * Análise: Ok
     * Entradas: numero
     * Saídas: se tem ou não casas decimais
     * Processo: 
     * se numero % 1 == 0 -> não tem casas decimais
     * senao -> tem casas decimais
     * Testes:
     * 0.25 -> tem
     * 28 -> não tem
     * 456.98 -> tem
     */
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Informe um número qualquer inteiro ou real: ");
    double numero = scanner.nextDouble();

    if (numero % 1 == 0) {
        System.out.println("Número não possui casas decimais.");
    } else {
        System.out.println("Número possui casas decimais.");
    }
    
    scanner.close();
    }
}
    

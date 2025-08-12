import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double valorCompra = 1;
        double valorFaturado = 0;
        while (valorCompra != 0.0) {

            System.out.print("Informe o valor da compra: R$");
            valorCompra = scanner.nextDouble();

            if (valorCompra <= 500) {
                valorCompra = valorCompra * 0.85;
                valorFaturado += valorCompra;
                System.out.println("(15% de desconto) Valor á pagar: R$" + valorCompra);
            } else if (valorCompra > 500) {
                valorCompra = valorCompra * 0.8;
                valorFaturado += valorCompra;
                System.out.println("(20% de desconto) Valor á pagar: R$" + valorCompra);
            }
        }

        System.out.println("Valor faturado: R$" + valorFaturado);
        scanner.close();
    }
}

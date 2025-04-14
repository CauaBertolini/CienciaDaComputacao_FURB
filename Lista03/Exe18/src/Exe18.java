import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe18 {
    /*
     * Análise: Programa pede para ler data de vencimento e depois limita para sempre ser igual a 10
     * Entradas: diaVencimento, diaPago, valorPrestacao
     * Saídas: valorPagar
     * Processo: verificar a situação da prestação, calcular juros ou descontos se necessário e informar ao usuário.
     * 
     * Testes:
     * venc  diaPag   prestac   valorPag
     * 10    12       100       100,00
     * 10    16       245       2754,40
     * 10    22       87        107,88
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double valorPagar;

        System.out.print("Dia de vencimento: ");
        int diaVencimento = scanner.nextInt();
        System.out.print("Dia pago: ");
        int diaPago = scanner.nextInt();
        System.out.print("Valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        if (diaPago <= diaVencimento) {
            valorPagar = valorPrestacao * 0.9;
            System.out.println("O pagamento está em dia. Valor da prestação: R$" + df.format(valorPagar));
        } else if (diaPago <= (diaVencimento + 5)) {
            valorPagar = valorPrestacao;
            System.out.println("O pagamento está atrasado. Valor da prestação: R$" + df.format(valorPagar));
        } else if (diaPago > (diaVencimento + 5)) {
            valorPagar = valorPrestacao + ((valorPrestacao * 0.02) * (diaPago - diaVencimento));
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação R$" + df.format(valorPagar));
        }

        scanner.close();
    }
}

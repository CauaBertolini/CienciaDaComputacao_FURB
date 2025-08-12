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
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("Dia vencimento: ");
        int diaVencimento = scanner.nextInt();

        System.out.print("Dia pago: ");
        int diaPago = scanner.nextInt();

        System.out.print("Valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        if (diaPago <= diaVencimento) {
            valorPrestacao = valorPrestacao - (valorPrestacao * 0.10);
            System.out.println("Pagamento está em dia. (10% de desconto) valor da prestação é de R$" + df.format(valorPrestacao));
        } else if ((diaPago - diaVencimento) <= 5) {
            System.out.println("Pagamento atrasado. Prestação de R$" + df.format(valorPrestacao));
        } else if ((diaPago - diaVencimento) > 5){
            int diasAtrasados = diaPago - diaVencimento;
            valorPrestacao += diasAtrasados * (valorPrestacao * 0.02);
            System.out.println("Pagamentoa atrasado. Multa de 2% por dia de atraso, ("+ diasAtrasados + " dias de atraso) valor á pagar R$" + df.format(valorPrestacao));
        } else {
            System.out.println("Não sei oq deu.");
        }

        scanner.close();
    }
}

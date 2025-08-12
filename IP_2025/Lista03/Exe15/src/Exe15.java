import java.util.Scanner;

public class Exe15 {
    /*
     * Análise: Ok
     * Entradas: mesesAdmitido
     * Saídas: mensagem de reajuste
     * Processo: Receba os meses de casa de um funcionário e defina seu reajuste de acordo com seu tempo de serviço.
     * 
     * Testes:
     * 200 -> Reajuste não informado
     * 36 -> Reajuste de 7%
     * 12 -> Reajuste de 5%
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe os meses admitidos: ");
        int mesesAdmitido = scanner.nextInt();

        if (mesesAdmitido <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");
        } else if (mesesAdmitido > 12 && mesesAdmitido <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");
        } else {
            System.out.println("Reajuste não informado");
        }

        scanner.close();
    }
}

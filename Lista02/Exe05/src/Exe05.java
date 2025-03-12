import java.util.Scanner;

public class Exe05 {
    /*
    Análise: As informações sobre os diferentes custos poderiam ser agrupados no valor total do custo
    Entradas: quantidadeFrangos
    Saídas: custoDemarcacao
    Processo: custoDemarcacao = quantidadeFrangos * 11
    Testes:
    625 Frangos = 6875,00
    84 Frangos = 924,00
    100 Frangos = 1100,00
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de frangos: ");
        int quantidadeFrangos = leitor.nextInt();

        double custoDemarcacao = quantidadeFrangos * 11;

        System.out.printf("O custo para demarcar %d frangos é de R$%.2f ", quantidadeFrangos, custoDemarcacao);
         leitor.close();
    }
}

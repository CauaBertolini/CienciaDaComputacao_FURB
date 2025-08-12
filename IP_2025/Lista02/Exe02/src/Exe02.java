import java.util.Scanner;

public class Exe02 {
    /*
    Análise: Enunciado ok
    Entradas: valorSapato
    Saídas: valorSapatoDesconto, valorDesconto
    Processo: 
    valorDesconto = valorSapato * 0.12
    valorSapatoDesconto = valorSapato - valorDesconto
    Testes: 
    100 = 12.0 e 88.00
    129 = 15.48 e 113,52
    298 = 35,76 e 262,24

     */
    public static void main(String[] args) throws Exception {
         Scanner leitor = new Scanner(System.in);

         System.out.print("Preço do par: ");
         double valorSapato = leitor.nextDouble();

         double valorDesconto = valorSapato * 0.12;
         double valorSapatoDesconto = valorSapato - valorDesconto; 

         System.out.printf("Esse par, que custa R$%.2f, com 12 porcento de desconto sai por R$%.2f, você economizará R$%.2f", valorSapato, valorSapatoDesconto, valorDesconto);

         leitor.close();

    }
}

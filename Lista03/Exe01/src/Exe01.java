import java.util.Scanner;
/*
 * Análise: Ok
 * Entradas: horasMes, horasValor
 * Saídas: salarioTotal
 * Processo: receber a quantidade de horas trabalhadas e o valor da hora e calcular o salário do funcionário
 * Testes: 
 * 10 Horas á 2 reais = 20,00
 * 234 horas á 19 reais = 4446,00
 */

public class Exe01 {
   public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Informe o número de horas trabalhadas no mês: ");
      int horasMes = scanner.nextInt();

      System.out.println("Valor da hora trabalhada: ");
      double horasValor = scanner.nextDouble();

      double salarioTotal = horasMes * horasValor;

      double salarioExtra = 0;

      if (horasMes > 160) {
         salarioExtra = (horasMes - 160) * (horasValor / 2);
      } else {
         salarioTotal = salarioTotal + salarioExtra;
      }

      System.out.printf("O salário total é: %.2f", salarioTotal);

      scanner.close();
   } 
}
import java.util.Scanner;

public class Exe07 {
    /*
     * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
     * Análise: valores de entrada ok, nome não usado!
     * Entradas: nomeVendedor, salarioFixo, totalVendasMes
     * Saídas: totalSalario
     * Processo: totalSalario = salarioFixo + (totalVendaMes * 0,15)
     * Fluxorama:  
     * Testes: 
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String nomeVendedor = scanner.next();

        System.out.print("Salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Total em vendas: ");
        double totalVendasMes = scanner.nextDouble();

        double totalSalario = salarioFixo + (totalVendasMes * 0.15);

        System.out.println("Funcionário: " + nomeVendedor + "Salário com bônus: " + totalSalario%2.f);

        scanner.close();
    }
}

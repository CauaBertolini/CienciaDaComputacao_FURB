import java.util.Scanner;

public class Exe17 {
    /*
     * Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Ao final informe o nome, o salário bruto e o salário líquido do funcionário.
     * Análise:
     * Entradas: nome, horasTrabalhadas, numeroDependentes
     * Saídas: nome, salarioBruto e salarioLiquido
     * Processo: salarioHorista = horasTrabalhadas * 10 
     * double salarioBruto = (salarioHorista + numeroDependentes * 60.0) 
     * salarioLiquido = salarioBruto - (salarioHorista * 0.135) 
     * Fluxograma:
     * Testes:
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o nome do funcionário: ");
        String nome = scanner.next();

        System.out.print("Informe as horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Informe a quantidade de dependentes: ");
        int numeroDependentes = scanner.nextInt();

        double salarioHorista =  horasTrabalhadas * 10.00;
        double salarioBruto = salarioHorista + (numeroDependentes * 60.00);
        double salarioLiquido = salarioBruto - (salarioHorista * 0.135);

        System.out.println("O funcionário " + nome + " receberá R$" + salarioBruto + " neste mês, com os descontos o montante vai para R$" + salarioLiquido);
        
        scanner.close();
    }
}

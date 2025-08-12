import java.util.Scanner;

public class Exe12 {
    /*
    Análise: Entradas ok, nome não é utilizado nas fórmulas.
    Entradas: nome, horasTrabalhadas, numeroDependentes
    Saídas: nome, salarioBruto e salarioLiquido
    Processo: salarioHorista = horasTrabalhadas * 10 
    double salarioBruto = (salarioHorista + numeroDependentes * 60.0) 
    salarioLiquido = salarioBruto - (salarioHorista * 0.135) 
    Testes: 
    150 horas, 3 dependentes = Salário líquido R$1477,5 - Salário Bruto R$1680,0 
    200 horas, 2 dependentes = Salário líquido R$1850,0 - Salário Bruto R$2120,0
    470 horas, 7 dependentes = Salário líquido R$4312.5 - Salário Bruto R$4920.0

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

        System.out.println("O funcionário " + nome + " receberá um salário bruto de R$" + salarioBruto + " neste mês, com os descontos o montante vai para R$" + salarioLiquido);

        scanner.close();
    }
}

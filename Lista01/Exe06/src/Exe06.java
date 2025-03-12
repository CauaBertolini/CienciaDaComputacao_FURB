import java.util.Scanner;

public class Exe06 {
       /*
     * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
     * Análise: Tudo certo
     * Entradas: numeroFuncionario, horasTrabalhadas, salarioHora
     * Saídas: numeroFuncionario, salario
     * Processo: salario = horasTrabalhadas * salarioHora
     * Fluxograma:
     * Testes: 
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Numero do funcionário: ");
        @SuppressWarnings("unused")
        int numeroFuncionario = scanner.nextInt();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Salario Hora: ");
        int salarioHora = scanner.nextInt();

        int salario = salarioHora * horasTrabalhadas;

        System.out.println("Salário: " + salario%2.f);

        scanner.close();
        
    }
}

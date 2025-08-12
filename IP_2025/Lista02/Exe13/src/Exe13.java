import java.util.Scanner;

public class Exe13 {
    /*
    Análise: Entradas ok
    Entradas: comprimentoParede, alturaParede
    Saídas: custo
    Processo:
    areaParede = comprimentoParede * alturaParede 
    Custo = areaParede * 9 * 12.5 
    Testes: 
    9, 6 = 6.075,00
    7, 11 = 8662,50
    2, 7 = 1575,00 

     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a altura da parede: ");
        double alturaParede = scanner.nextDouble();

        System.out.print("Informe o comprimento da parede: ");
        double comprimentoParede = scanner.nextDouble();

        double areaParede = alturaParede * comprimentoParede;

        double custo = areaParede * 9 * 12.5;

        System.out.printf("O custo é: %.2f", custo);

        scanner.close();
    }
}

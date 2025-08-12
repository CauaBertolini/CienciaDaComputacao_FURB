import java.util.Scanner;

public class Exe07 {
    /*
    Análise: Ok
    Entradas: quantidadeLata350, quantidadeGarrafa600, quantidadeLitro2l
    Sáidas: litrosComprados
    Processo: litrosComprados = (quantidadeLata350 * 0.35 + quantidadeGarrafa600 * 0.6 + quantidadeLitro2l * 2)
    Testes: 
    89 latas de 350, 0 de 600ml, 0 de 2l = 31.15 litros
    2 latas de 350, 3 de 600ml, 1 de 2l = 4.50 litros
    5 latas de 350, 3 de 600ml, 4 de 2l = 11,55 litros

    */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Quantidade Latas 350ml: ");
        int quantidadeLata350 = scanner.nextInt();
    
        System.out.print("Quantidade Garrafas 600ml: ");
        int quantidadeGarrafa600 = scanner.nextInt();
            
        System.out.print("Quantidade Litros 2l: ");
        int quantidadeLitro2000 = scanner.nextInt();
    
        double litrosComprados = ((quantidadeLata350 * 0.350) + (quantidadeGarrafa600 * 0.600) + (quantidadeLitro2000 * 2)); 
    
        System.out.printf("O cliente comprou: %.2f litros", litrosComprados);
    
        scanner.close();
    }
}

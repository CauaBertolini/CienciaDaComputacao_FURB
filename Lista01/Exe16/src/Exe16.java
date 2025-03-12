import java.util.Scanner;

public class Exe16 {
    /*
     * Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, informe quantos litros de refrigerante ele comprou.
     * Análise: Ok
     * Entradas: quantidadeLata350, quantidadeGarrafa600, quantidadeLitro2000
     * Sáidas: litrosComprados
     * Processo: litrosComprados = (quantidadeLata350 * 350 + quantidadeGarrafa600 * 600 + quantidadeLitro2000 * 2000) / 1000 
     * Fluxograma:
     * Testes:
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantidade Latas 350ml: ");
        int quantidadeLata350 = leitor.nextInt();

        System.out.println("Quantidade Garrafas 600ml: ");
        int quantidadeGarrafa600 = leitor.nextInt();
        
        System.out.println("Quantidade Litros 2l: ");
        int quantidadeLitro2000 = leitor.nextInt();

        double litrosComprados = ((quantidadeLata350 * 0.350) + (quantidadeGarrafa600 * 0.600) + (quantidadeLitro2000 * 2)); 

        System.out.println(litrosComprados);

        leitor.close();
    }
}

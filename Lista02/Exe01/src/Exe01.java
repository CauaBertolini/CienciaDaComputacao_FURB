import java.util.Scanner;

public class Exe01 {
    /*
    Análise: Enunciado ok
    Entradas: largura, profundidade
    Saídas: areaTerreno
    Processo: areaTerreno = largura * profundidade
    Testes: 
    3 e 6 = 18 
    2 e 8 = 36
    68 e 129 = 8772
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a largura do terreno: ");
        int largura = leitor.nextInt();
        System.out.print("Informe a profundidade do terreno: ");
        int profundidade = leitor.nextInt();

        int areaTerreno = largura * profundidade;

        System.out.printf("O terreno tem %dm² de área.", areaTerreno);

        leitor.close();
    }
}

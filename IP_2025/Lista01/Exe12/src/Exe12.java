import java.util.Scanner;

public class Exe12 {
    /*
     * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula: 
     * Análise: valores de entrada ok
     * Entradas: x1, y1, x2, y2
     * Saídas: distancia
     * Processo: 
     * Distancia = Sqrt(x2 – x1)*(x2 –x1) + (y2 – y1) * (y2 – y1)
     * Testes: 
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eixo X inicial: ");
        double x1 = scanner.nextInt();

        System.out.print("Eixo Y inicial: ");
        double y1 = scanner.nextInt();


        System.out.print("Eixo X final: ");
        double x2 = scanner.nextInt();


        System.out.print("Eixo Y final: ");
        double y2 = scanner.nextInt();
        
        double somaDistancia = ((x2 - x1)*(x2-x1) ) + ((y2-y1)*(y2-y1));
        double distancia = Math.sqrt(somaDistancia);

        System.out.printf("Distância: %.2f ", distancia);

        scanner.close();

    }
}

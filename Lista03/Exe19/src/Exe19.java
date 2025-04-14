import java.util.Scanner;

public class Exe19 {
    /*
     * Análise: Ok
     * Entradas: X, Y
     * Saídas: Quadrante
     * Processo: Verificar, de acordo com as entradas, em qual quadrante está a posição. 
     * 
     * Testes:
     * x = 1 y = -90 -> Quadrante 2
     * x = 12 y = 32 -> Quadrante 1
     * x = -8 y = 13 -> Quadrante 4
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe X: ");
        int x = scanner.nextInt();

        System.out.print("Informe Y: ");
        int y = scanner.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 4");
        } 
        scanner.close();
    }
}

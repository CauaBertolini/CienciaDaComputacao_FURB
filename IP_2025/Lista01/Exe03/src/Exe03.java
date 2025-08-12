import java.util.Scanner;

public class Exe03 {
    /*
     * Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).
     * Análise: Tudo certo, enunciado não evidencia que será dado o raio
     * Entradas: raio
     * Saídas: area
     * Processo: (raio * raio) * PI
     * Fluxograma:
     * Testes: 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o Raio da Circunferência: ");
        int raio = scanner.nextInt();
        double area = (raio * raio) * 3.14159;
        System.out.println("A area é: " + area);

        scanner.close();
    }
}

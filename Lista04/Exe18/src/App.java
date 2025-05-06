import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int somaCanal4 = 0;
        int somaCanal5 = 0;
        int somaCanal9 = 0;
        int somaCanal12 = 0;
        int somaGeral = 0;

        int canal = 1;
        while (canal != 0) 
        {
            System.out.print("Canal [4, 5, 9 ou 12]: ");
            canal = scanner.nextInt();

            if (canal != 0 && canal == 4 || canal == 5 || canal == 9 || canal == 12) {

                System.out.print("Número de pessoas: ");
                int pessoas = scanner.nextInt();
                
                somaGeral += pessoas;

                if (canal == 4) {
                    somaCanal4 += pessoas;
                } else if (canal == 5) {
                    somaCanal5 += pessoas;
                } else if (canal == 9) {
                    somaCanal9 += pessoas;
                } else if (canal == 12) {
                    somaCanal12 += pessoas;
                } else {
                    System.out.println("Canal inválido!");
                }
            } 
        }

        System.out.println("Percentual de pessoas no canal 4: " + (((somaCanal4 * 100) / somaGeral)) + "%");
        System.out.println("Percentual de pessoas no canal 5: " + (((somaCanal5 * 100) / somaGeral)) + "%");
        System.out.println("Percentual de pessoas no canal 9: " + (((somaCanal9 * 100) / somaGeral)) + "%");
        System.out.println("Percentual de pessoas no canal 12: " + (((somaCanal12 * 100) / somaGeral)) + "%");

        
        scanner.close();
    }
}

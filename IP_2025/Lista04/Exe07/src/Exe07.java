import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double maior = 0;
        double menor = 0;

        System.out.print("Informe um número natural: ");
        int n =  scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "° Número real: ");
            double numero = scanner.nextDouble();

            if (numero > maior) {
                maior = numero;
            } if (i == 1) {
                menor = numero;
            } else if (menor < menor) {
                menor = numero;
            }
            
        }

        System.out.println("Maior: " + maior + "\nMenor: " + menor);

        scanner.close();
    }
}

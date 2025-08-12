import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de paradas: ");
        int paradas = scanner.nextInt();
        double somaRendimento = 0;

        for (int p = 1; p <= paradas; p++) {
            System.out.print(p + "° Parada: Quilometragem: ");
            double quilometragem = scanner.nextInt();
            System.out.print("Combustível: ");
            double combustível = scanner.nextInt();

            System.out.println("Você andou " + quilometragem / combustível + "km por litro!");

            somaRendimento += quilometragem / combustível;

        }

        System.out.println("----------------------------------------");
        System.out.println("A média de KM por litro é de " + (somaRendimento/paradas));

        scanner.close();
    }
}

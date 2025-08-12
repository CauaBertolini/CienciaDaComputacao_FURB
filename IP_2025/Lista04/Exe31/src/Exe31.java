import java.util.Scanner;

public class Exe31 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int primo = 2;

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        while (numero != 1) {
            if (numero % primo == 0) {
                if (numero < 100 && numero > 10) {
                    System.out.print(" ");
                } else if (numero < 10) {
                    System.out.print("  ");
                }
                System.out.println(numero + " | " + primo);
                numero /= primo;
            } else {
                primo++;
            }

            if (numero == 1) {
                System.out.println( "  " + numero);
            }
        }


        scanner.close();
    }
}

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numero = 0;

        System.out.println("+++++++++++++++++++++++++++++++++++");

        for (int l = 1; l <= n; l++) {

            for (int c = 1; c <= l; c++) {

                numero++;
                
                if (numero < 10) {
                    System.out.print(" " + numero + " ");

                } else {
                    System.out.print(numero + " ");
                }
            }
            System.out.println("");
                
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");

        scanner.close();
    }
}

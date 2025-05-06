import java.util.Scanner;

public class Exe29 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor em dinheiro: R$ ");
        int valorTotal = scanner.nextInt();

        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int notas1 = 0;

        while (valorTotal > 0) {
            if (valorTotal >= 20) {
                notas20 = valorTotal / 20;
                valorTotal %= 20;
            } else if (valorTotal >= 10) {
                notas10 = valorTotal / 10;
                valorTotal %= 10;
            } else if (valorTotal >= 5) {
                notas5 = valorTotal / 5;
                valorTotal %= 5;
            } else if (valorTotal >= 2) {
                notas2 = valorTotal / 2;
                valorTotal %= 2;
            } else {
                notas1 = valorTotal;
                valorTotal %= 1;
            } 
        }   

        System.out.println(notas20 + " notas de 20");
        System.out.println(notas10 + " notas de 10");
        System.out.println(notas5 + " notas de 5");
        System.out.println(notas2 + " notas de 2");
        System.out.println(notas1 + " notas de 1");

        scanner.close();
    }
}

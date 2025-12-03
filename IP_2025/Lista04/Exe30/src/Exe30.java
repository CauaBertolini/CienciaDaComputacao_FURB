import java.util.Scanner;

public class Exe30 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int valorInicial = 0;
        int decremento = 0;
        int espacoMochila = 0;
        int somaMochila = 0;
        int somaFora = 0;

        String mochila = "";
        String fora = "";

        System.out.println("Problema da Mochila");

        System.out.print("Valor inicial: ");
        valorInicial = scanner.nextInt();

        System.out.print("Decremento:  ");
        decremento = scanner.nextInt();

        System.out.print("Espaço na mochila: ");
        espacoMochila = scanner.nextInt();

        System.out.println("Sequência: ");
        System.out.println("------------------------");
        while (valorInicial > 0) {
            System.out.println(valorInicial);

            if (espacoMochila > 0) {
                mochila += valorInicial + " ";
                somaMochila += valorInicial;
                espacoMochila--;
            } else {
                fora += valorInicial + " ";
                somaFora += valorInicial;
            }

            valorInicial -= decremento;
        }
        System.out.println("------------------------");
        System.out.println("Mochila: " + mochila);
        System.out.println("Soma da Mochila: " + somaMochila);
        System.out.println("Fora da Mochila: "+ fora);
        System.out.println("Soma fora da mochila: " + somaFora);

        scanner.close();
    }
}

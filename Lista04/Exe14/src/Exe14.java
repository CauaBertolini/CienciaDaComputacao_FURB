import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double precoCusto;
        double precoVenda;

        int contadorLucroMenor10 = 0;
        int contadorLucroEntre10e20 =0;
        int contadorLucroMaior20 = 0;

        for (int p = 1; p <= 20; p++) {

            System.out.print("Nome do produto: ");
            String nomeProduto = scanner.next();
            
            System.out.print("Preço de Custo: ");
            precoCusto = scanner.nextDouble();

            System.out.print("Preço de venda: ");
            precoVenda = scanner.nextDouble();

            double lucro = (precoVenda - precoCusto) / precoCusto * 100;

            if (lucro < 10) {
                contadorLucroMenor10++;
            } else if (lucro >= 10 || lucro <= 20) {
                contadorLucroEntre10e20++;
            } else if (lucro > 20) {
                contadorLucroMaior20++;
            }
            System.out.println("Fim do cadastro de " + nomeProduto);
        }

        System.out.println("Produtos com lucro inferior á 10%: " + contadorLucroMenor10);
        System.out.println("Produtos com lucro entre 10% e 20%: " + contadorLucroEntre10e20);
        System.out.println("Produtos com lucro superior á 20%: " + contadorLucroMaior20);

        scanner.close();
    }
}

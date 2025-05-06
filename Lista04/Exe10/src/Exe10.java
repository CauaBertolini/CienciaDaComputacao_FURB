import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 99; i++) {
            for (int j = 1; j <= 99 ; j++) {
            
                int soma = i + j;

                int produto = soma * soma;

                String somaString = String.valueOf(i*100+j);
                String produtoString = Integer.toString(produto);

                if (somaString.equals(produtoString)) {
                    System.out.println(produtoString);
                }


            }
        }



        scanner.close();
    }
}

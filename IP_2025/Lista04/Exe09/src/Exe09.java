import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int contador20 = 0;
        String nomes = "";
        int contador18 = 0;

        System.out.print("Informe um número natural: ");
        int n =  scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            
            System.out.println(i + "° Pessoa ---------------");
            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            if (idade > 20) {
                contador20++;
            } else if (idade == 18) {
                if (contador18 == 0) {
                    nomes += nome;
                } else {
                    nomes += ", " + nome;
                }
                contador18++;
            }
        }

        System.out.println("Quantidade de pessoas maiores de 20 anos: " + contador20);
        System.out.println("Nomes das pessoas com 18 anos: " + nomes);

        scanner.close();

    }
}

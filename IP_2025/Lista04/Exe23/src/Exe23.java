import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int produtos = 0;
        String nome = "";

        String resposta = "s";
        
        while (resposta.equalsIgnoreCase("s")) {
           

            System.out.print("Nome do vendendor: ");
            nome = scanner.next();
            System.out.print("Quandidade de produtos: ");
            produtos = scanner.nextInt();

            double totalVendas = 0;
            int contador = 0;
            while (produtos >= 1)
            {
                contador++;
                produtos--;

                System.out.println("-----------------------------------");
                System.out.println("Cadastro de Produto " + contador);
                System.out.println("-----------------------------------");

                System.out.print("Preço unitário: ");
                double precoUnitario = scanner.nextDouble();
                
                System.out.print("Quantidade vendida: ");
                int quantidadeVendida =  scanner.nextInt();

                totalVendas += ((quantidadeVendida * precoUnitario));
            }

            double salario = totalVendas * 0.30;

            System.out.println("-----------------------------------");
            System.out.printf("Nome: %s\nTotal em vendas: R$ %.2f\nSalário: R$ %.2f\n", nome, totalVendas, salario);
            System.out.println("-----------------------------------");

            System.out.print("Cadastrar novo vendedor? (S ou N): ");
            resposta = scanner.next();
        }


        scanner.close();

    }
}

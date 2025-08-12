import java.util.Scanner;

public class Exe22 {
    /*
     * Análise: Ok
     * Entradas: resposta
     * Saídas: mensagem
     * Processo:
     * Switch(resposta) 
     * case1: Bacharel em Ciência da Computação
     * case2: Licenciado em Computação
     * case3: Bacharel em Sistemas de Informação
     * Testes:
     * 1 -> Bacharel em Ciência da Computação
     * 3 -> Bacharel em Sistemas de Informação
     * 4 -> Opção inválida
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                Informe seu curso:
                1 - Ciência da Computação
                2 - Licenciatura da Computação
                3 - Sistemas de Informação
                Sua resposta: 
                """);
        int respota = scanner.nextInt();

        switch (respota) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Exe11 {
    /*
     * Análise: Enunciado pede ano, exemplos informa idades
     * Entradas: ano1, ano2, ano3
     * Saídas: relação entre os irmãos
     * Processo:
     * se ano1 == ano2 && ano1 == ano3 -> relacao = "TRIGÊMEOS"
     * senao se ano1 == ano2 || ano1 == ano3 || ano2 == ano3 -> "GÊMEOS"
     * senao -> relacao = "IRMÃOS"
     * 
     * Testes:
     * 2011 2020 2019 -> São irmãos
     * 2011 2011 2018 -> São gêmeos
     * 2010 2010 2010 -> São trigêmeos
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o ano de nascimento dos três irmãos separados por um espaço: ");
        int ano1 = scanner.nextInt();
        int ano2 = scanner.nextInt();
        int ano3 = scanner.nextInt();

        if (ano1 == ano2 && ano1 == ano3) {
            System.out.println("São Trigêmeos");
        } else if (ano1 == ano2 || ano1 == ano3 || ano2 == ano3) {
            System.out.println("São Gêmeos");
        } else {
            System.out.println("São Irmãos");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Exe14 {
    /*
     * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias. 
     * Análise: Entradas ok
     * Entradas: valor
     * Saídas: valor, notas100, notas50, notas20, notas10, notas5, notas2, notas1.
     * Processo:
     * valorTotal = valor;
     * notas100 = valorTotal / 100 
     * valorTotal = valorTotal % 100 
     * notas50 = valorTotal / 50 
     * valorTotal = valorTotal % 50 
     * notas20 = valorTotal / 20 
     * valorTotal = valorTotal % 20 
     * notas10 = valorTotal / 10 
     * valorTotal = valorTotal % 10 
     * notas5 = valorTotal / 5 
     * valorTotal = valorTotal % 5 
     * notas2 = valorTotal / 2 
     * valorTotal = valorTotal % 2 
     * notas1 = valorTotal / 1 
     * Fluxorama:  
     * Testes: 
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor: ");
        int valor =  scanner.nextInt();

        int valorTotal = valor;

        int notas100 = valorTotal / 100;
        valorTotal = valorTotal % 100;
        int notas50 = valorTotal / 50;
        valorTotal = valorTotal % 50;
        int notas20 = valorTotal / 20;
        valorTotal = valorTotal % 20;
        int notas10 = valorTotal / 10;
        valorTotal = valorTotal % 10;
        int notas5 = valorTotal / 5;
        valorTotal = valorTotal % 5;
        int notas1 = valorTotal;
        valorTotal = 0;

        System.out.println("Liberando notas: ");
        System.out.println(notas100 + " Notas R$100");
        System.out.println(notas50 + " Notas R$50");
        System.out.println(notas20 + " Notas R$20 ");
        System.out.println(notas10 + " Notas R$10 ");
        System.out.println(notas5 + " Notas R$5");
        System.out.println(notas1 + " Moedas R$1");

        scanner.close();

    }
}

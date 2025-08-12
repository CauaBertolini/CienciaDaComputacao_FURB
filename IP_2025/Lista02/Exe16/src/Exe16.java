import java.util.Scanner;

public class Exe16 {
    /*
    Análise: enunciado não é claro ao definir o que será informado. De resto ok.
    Entradas: valorCompra, valorPago
    Saídas: notas, notas100, notas10, notas1
    Processo: 
    troco = valorPago - valorCompra
    
    notas100 = troco / 100
    troco %= 100
    notas10 = troco / 10
    troco %= 10
    notas1 = troco

    notas =  notas100 + notas10 + notas1
    
    Testes: 
    //
    valorCompra = 1650
    valorPago = 1800

    notas = 6
    notas100 = 1
    notas10 = 5
    notas1 = 0    

    //
    valorCompra = 2586
    valorPago = 3000

    notas = 9
    notas100 = 4
    notas10 = 1
    notas1 = 4
    */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total da compra: R$");
        int valorCompra = scanner.nextInt();

        System.out.print("Total pago: R$");
        int valorPago = scanner.nextInt();

        int troco = valorPago - valorCompra;

        int notas100 = troco / 100;
        troco %= 100;

        int notas10 = troco /10;
        troco %= 10;

        int notas1 = troco;

        int notas = notas100 + notas10 + notas1;

        System.out.println("O mínimo de notas de troco é: " + notas + " sendo:");
        System.out.println(notas100 + " Notas de R$100");
        System.out.println(notas10 + " Notas de R$10");
        System.out.println(notas1+ " Notas de R$1");
        
        scanner.close();
    }
}

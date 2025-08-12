import java.util.Scanner;

public class Exe10 {
    /*
    Análise: Solicitação ok.
    Entradas: cateto1, cateto2
    Saídas: hipotenusa
    Processo: 
    hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2))
    Testes: 
    4, 5 = 6.40 
    3, 4 = 5.00
    10, 20 = 22,36
    */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe os catetos oposto e adjascente, separados por um espaço: ");
        double cateto1 = scanner.nextDouble();
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.printf("A hipotenusa é: %.2f", hipotenusa);


        scanner.close();
    }
}

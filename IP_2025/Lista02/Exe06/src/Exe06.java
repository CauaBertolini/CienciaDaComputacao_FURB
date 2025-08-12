import java.util.Scanner;

public class Exe06 {
    /*
    Análise: Enunciado não informa se deve ser lido o peso em gramas ou quilos.
    Entradas: pesoPrato
    Saídas: valorPagar
    Processo: valorPagar =  (pesoPrato - 0.750) * 25
    Testes:
    2.42kg custará R$41,75
    1.77kg custará R$25,50
    10,00kg custará R$231,25
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Peso do prato em quilos: ");
        double pesoPrato = leitor.nextDouble();

        double valorPagar = (pesoPrato - 0.75) * 25;

        System.out.printf("Seu prato custará %.2f", valorPagar);
        


        leitor.close();
    }
}

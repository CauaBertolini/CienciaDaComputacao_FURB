import java.util.Scanner;

public class Exe14 {
    /*
     * Análise: Ok
     * Entradas: dia, mes, ano
     * Saídas: válido ou não válido
     * Processo: receber uma data e verificar se ela é válida ou não
     * 
     * Testes:
     * 10/20/2000 -> Não válida
     * 12/03/2019 -> Data válida
     * 02/09/2005 -> Data válida
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mês: ");
        int mes = scanner.nextInt();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Data válida");
            } else if (mes != 2 && dia < 31) {
                System.out.println("Data válida para (Mês diferente de 2 e dia menor que 31)");
            } else if (mes == 2 && dia < 29) {
                System.out.println("Data válida");
            } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                System.out.println("Data válida");
            } else {
                System.out.println("Não válida");
            }
        } else {
            System.out.println("Não válida");
        }

        scanner.close();
    }
}

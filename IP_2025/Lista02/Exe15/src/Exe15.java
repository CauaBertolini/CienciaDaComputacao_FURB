import java.util.Scanner;

public class Exe15 {
    /*
    Análise: Enunciado ok
    Entradas: numero
    Saídas: centenas, dezenas, unidades
    Processo: 
    centenas = numero / 100
    numero %= 100
    dezenas = numero / 10
    numero %= 10
    unidades = numero / 1
    Testes: 
    267 = 2 centenas, 6 dezenas e 7 unidades
    982 = 9 centenas, 8 dezenas e 2 unidades
    791 = 7 centenas, 9 dezenas e 1 unidades
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número com 3 dígitos: ");
        int numero = scanner.nextInt();

        int centenas = numero / 100;
        numero %= 100;
        int dezenas = numero / 10;
        numero %= 10;
        int unidades = numero;
        
        System.out.printf("%d Centenas, %d Dezenas, %d Unidades", centenas, dezenas, unidades);

        scanner.close();
    }
}

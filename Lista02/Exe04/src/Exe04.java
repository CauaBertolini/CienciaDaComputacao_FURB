import java.util.Scanner;

public class Exe04 {
    /*
    Análise: Enunciado ok
    Entradas: nota1, nota2, nota3
    Saídas: mediaPonderada
    Processo: mediaPonderada = (nota1 * 5) + (nota2 * 3) + (nota3 * 2) / 10
    Testes:
    9 6 e 3 = 6.9
    8 7 e 4 = 6.9
    8 8 e 9 = 8.5
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe 3 notas deixando um espaço entre elas: ");
        double nota1 = leitor.nextDouble();
        double nota2 = leitor.nextDouble();
        double nota3 = leitor.nextDouble();

        double mediaPonderada = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
        
        System.out.println("Média: " + mediaPonderada);

        leitor.close();
    }
}

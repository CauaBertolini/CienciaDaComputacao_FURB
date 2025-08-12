import java.util.Scanner;

public class Exe20 {
    /*
     Considere que você tenha um papel quadrado e o dobre várias vezes 
    sempre em um número par de dobra no meio do quadrado. Ao abrir a 
    folha de papel é possível verificar a marcação de novos quadrados. 
    Baseado nisso leia o número de dobras (lembre que sempre é um número 
    par) feitas no papel e escreva quantos quadrados podem ser vistos após 
    desdobrá-lo.
     
    Análise: Enunciado claro.
    Entradas: numeroDeDobras
    Saídas: quantidadeDeQuadrados
    Processo: 2 Math.pow(numeroDeDobras)
    Fluxograma:
    Testes:

       
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o número de dobras (Iniciando em 2 e persistindo em números pares): ");
        int numeroDeDobras = leitor.nextInt();

        int quantidadeDeQuadrados = (int) Math.pow(2, numeroDeDobras);

        System.out.println(quantidadeDeQuadrados + " espaços retângulares.");
        
        leitor.close();
    }
}

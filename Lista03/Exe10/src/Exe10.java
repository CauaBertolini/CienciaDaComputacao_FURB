import java.util.Scanner;

public class Exe10 {
    /*
     * Análise: Ok
     * Entradas: idadeMarquinhos, idadeZezinho, idadeLuluzinha
     * Saídas: nome do filho caçula
     * Processo: validar qual a idade nova e escrever o nome do mais novo
     * 
     * Testes:
     * 10 20 30 -> Marquinhos (10)
     * 34 45 12 -> Luluzinha (12)
     * 8 3 5 -> Zezinho (3)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade de Marquinhos: ");
        int idadeMarquinhos = scanner.nextInt();

        System.out.print("Idade de Zezinho: ");
        int idadeZezinho = scanner.nextInt();

        System.out.print("Idade de Luluzinha: ");
        int idadeLuluzinha = scanner.nextInt();


        if (idadeMarquinhos < idadeLuluzinha && idadeMarquinhos < idadeZezinho) {
            System.out.println("Marquinhos é o caçula!");
        } else if (idadeLuluzinha < idadeZezinho && idadeLuluzinha < idadeMarquinhos) {
            System.out.println("Luluzinha é a caçula!");
        } else {
            System.out.println("Zezinho é o caçula!");
        }

        scanner.close();

    }
}
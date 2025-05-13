import java.util.Scanner;

public class Exe01 {

    // Construtor, onde o código fonte estará colocado
    public Exe01() {
        Scanner scanner = new Scanner(System.in);

        int numeros[ ] = new int[10];

        lerVetor(numeros, scanner);

        escreverVetor(numeros, true);

        scanner.close();
    }

    // Main, onde será rodado o programa
    public static void main(String[] args) throws Exception {
        new Exe01();
    }

    private void lerVetor(int vetor[], Scanner leitor) {
        for (int i = 0; i < vetor.length; i++) {
            
            System.out.print("Digite um número para posição [ " + i + " ]: ");

            vetor[i] = leitor.nextInt();
        }
    }

    private void escreverVetor(int vetor[], boolean inverter) {

        if (inverter) {
            for (int indice = vetor.length - 1; indice >= 0; indice--) {
                System.out.println(vetor[indice]);
            }
        } else {
            for (int indice = 0; indice < vetor.length; indice++) {
                System.out.println(vetor[indice]);
            }
        }
    }
}

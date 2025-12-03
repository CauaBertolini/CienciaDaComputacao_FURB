import java.util.Scanner;

public class Exe04 {

    public Exe04 () {
        Scanner scanner = new Scanner(System.in);

        int[] valores1 = new int[5];
        int[] valores2 = new int[5];
        int[] valoresSomados = new int[5];

        lerVetores(valores1, scanner);
        System.out.println("---------------------");
        lerVetores(valores2, scanner);
        System.out.println("---------------------");

        somarVetores(valores1, valores2, valoresSomados);

        escreverValores(valores1);
        System.out.println("---------------------");
        escreverValores(valores2);
        System.out.println("---------------------");
        escreverValores(valoresSomados);
        
    }
    public static void main(String[] args) throws Exception {
        new Exe04();
    }

    public void lerVetores (int[] vetor, Scanner scanner) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um valor para o índice [" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }
    }

    public void somarVetores (int[] vetor1, int[] vetor2, int[] vetorSoma) {
        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
    }

    private void escreverValores(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}

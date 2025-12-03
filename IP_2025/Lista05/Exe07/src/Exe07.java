import java.util.Scanner;

public class Exe07 {

    public Exe07() {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        
        do {
            System.out.print("Informe um valor inteiro (1 á 20): ");
            n = scanner.nextInt();
        } while (n > 20 || n < 1);

        int[] vetor = new int[n];

        lerVetor(vetor, scanner);
        ordenarVetor(vetor, scanner);
        escreverValores(vetor);

        scanner.close();
    }

    public static void main(String[] args) throws Exception {
        new Exe07();
    }

    public void lerVetor(int[] vetor, Scanner scanner) {
        for (int indice = 0; indice < vetor.length; indice++) {

            int numero = 0;
            boolean valorValido = false;
            while(!valorValido) {
   
                System.out.print("Informe um valor para [ " + indice + " ] posição: ");
                numero = scanner.nextInt();
                
                valorValido = true;
                for (int i = 0; i < vetor.length; i++) {
                    if (numero == vetor[i]) {
                        System.out.println("Valor já está dentro do vetor. Tente outro.");
                        valorValido = false;
                    }
                }
            }

            vetor[indice] = numero;
            
        }
    }

    public void ordenarVetor(int[] vetor, Scanner scanner) {
        int i = 0;

        while (i < vetor.length-1) {
            if (vetor[i] > vetor[i+1]) {
                int bolha = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = bolha;
                i = 0;
            } else {
                i++;
            }
        }

    }

    private void escreverValores(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}

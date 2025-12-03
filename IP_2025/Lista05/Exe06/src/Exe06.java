import java.util.Scanner;

public class Exe06 {

    public Exe06() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor inteiro:  ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        popularVetor(vetor, scanner);
        
        System.out.println("---------------------------------------------");

        System.out.print("Valor para verificar se está no vetor: ");
        double valor = scanner.nextDouble();

        verificarVetor(vetor, valor);


        scanner.close();
    }

    public static void main(String[] args) throws Exception {
        new Exe06();
    }

    public void popularVetor(double[] vetor, Scanner scanner) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor real: ");
            vetor[i] = scanner.nextDouble();
        }
    }

    public void verificarVetor(double[] vetor, double valor) {
        boolean existente = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                System.out.println("Valor existente no vetor");
                existente = true;
            } 
        } 

        if (!existente) {
            System.out.println("Valor não está no vetor!");
        }
    }
}

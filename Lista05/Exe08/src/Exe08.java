import java.util.Scanner;

public class Exe08 {
    
    public Exe08() {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        
        do {
            System.out.print("Informe um valor inteiro (1 á 20): ");
            n = scanner.nextInt();
        } while (n > 20 || n < 1);

        double vetor[] = new double[n];

        popularVetor(vetor, scanner);

        imprimirTabelaVetor(vetor, n);

        scanner.close();
    }
    
    public static void main(String[] args) throws Exception {
        new Exe08();
    }

    public void popularVetor(double vetor[], Scanner scanner) {
        for (int indice = 0; indice < vetor.length; indice++) {
   
            System.out.print("Informe um valor para [ " + indice + " ] posição: ");
            vetor[indice] = scanner.nextDouble();
            
        }
    }

    public void imprimirTabelaVetor(double vetor[], int n) {

        System.out.println("VALOR  |  FREQUÊNCIA");
        double valoresContados [] = new double[n]; 

        for (int indice = 0; indice < vetor.length; indice++) {

            if (!verificarSeFoiContado(valoresContados, vetor[indice])) {
                int contador = 0;

                for (int i = 0; i < vetor.length; i++) {
                    
                    if (vetor[indice] == vetor[i]) {
                        valoresContados[indice] = vetor[i];
                        contador++;
                    }
                }
                System.out.printf("%.2f      %d\n", vetor[indice], contador);
            }
            

        }
    }

    public boolean verificarSeFoiContado(double vetor[], double valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (valor == vetor[i]) {
                return true;
            }
        }
        return false; 
    }

    
}



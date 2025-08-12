import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

         int contador = 0;
         int numeroInscricao = 1;
         double somaAlturas = 0;
         double alturaBaixa = 0;
         double alturaAlta = 0;
         int inscricaoAlta = 0;
         int inscricaoBaixa = 0;

         while (numeroInscricao != 0) {

            contador++;

            System.out.print("Número de inscrição: ");
            numeroInscricao = scanner.nextInt();

            if (numeroInscricao != 0) 
            {
                System.out.print("Altura: ");
                double altura = scanner.nextDouble();
                somaAlturas += altura;

                if (contador == 1) {
                    alturaAlta = altura;
                    alturaBaixa = altura;
                    inscricaoAlta = numeroInscricao;
                    inscricaoBaixa = numeroInscricao;
                } else {

                    if (altura < alturaBaixa) {
                        inscricaoBaixa = numeroInscricao;
                        alturaBaixa = altura;
                    }

                    if (altura > alturaAlta) {
                        alturaAlta = altura;
                        inscricaoAlta = numeroInscricao;
                    }
                }
            }
         }

         System.out.println("Atleta mais baixo -> Inscrição:" + inscricaoBaixa + " altura: " + alturaBaixa);
         System.out.println("Atleta mais alto -> Inscrição: " + inscricaoAlta + " altura: " + alturaAlta);
         System.out.println("Média do grupo em altura: " + (somaAlturas / contador));


         scanner.close();
    }
}

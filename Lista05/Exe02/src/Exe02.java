import java.util.Scanner;

public class Exe02 {
    
    public Exe02() {
        Scanner scanner = new Scanner(System.in);

        double [] valores = new double[12];

        lerValores(valores, scanner);
        double media = media(valores);
        escreverMaiorQueMedia(valores, media);

        scanner.close();
    }
    
    public static void main(String[] args) throws Exception {
        new Exe02();
    }

    private void lerValores(double valores[], Scanner scanner) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor da posição [ " + i + " ]: ");
            valores[i] =  scanner.nextDouble();
        }
    }

    private double media(double valores[]) {
        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        double media = soma / valores.length;
        return media;
    }

    private void escreverMaiorQueMedia(double valores[], double media) {
        System.out.println("Valores acima da média: ");
        for (int indice = 1; indice < valores.length; indice++) {
            if (valores[indice] > media) {
                System.out.println(valores[indice]);
            }
        }
    }
}

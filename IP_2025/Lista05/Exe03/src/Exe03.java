import java.util.Scanner;

public class Exe03 {
    
    public Exe03() {
        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[12];

        lerValores(valores, scanner);
        ajustarValores(valores);
        escreverValores(valores);

    }
    public static void main(String[] args) throws Exception {
        new Exe03();
    }

     private void lerValores(double[] valores, Scanner scanner) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor da posição [ " + i + " ]: ");
            valores[i] =  scanner.nextDouble();
        }
    }

    private void ajustarValores(double[] valores) {
        for (int i = 0; i < valores.length; i++) { 
            if (i % 2 == 0) {
                valores[i] += valores[i] * 0.02;
            } else {
                valores[i] += valores[i] * 0.05;
            }
        }
    }

    private void escreverValores(double[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

        double altura = 1;
        double somaMulheres = 0;
        double somaHomens = 0;
        double somaOutros = 0;

        double contadorHomens = 0;
        double contadorMulheres = 0;
        double contadorOutros = 0;

        while (altura != 0) {
            System.out.print("Altura: ");
            altura = scanner.nextDouble();

            String genero;

            if (altura != 0) {
                System.out.print("Gênero (M/F/O): ");
                genero = scanner.next();
            } else {
                genero = "NULL";
            }
            
            if (genero.equalsIgnoreCase("M")) {
                contadorHomens++;
                somaHomens += altura;

            } else if (genero.equalsIgnoreCase("F")) {
                contadorMulheres++;
                somaMulheres += altura;

            } else if (genero.equalsIgnoreCase("O")) {
                contadorOutros++;
                somaOutros += altura;
            }
        }

        System.out.println("Altura média dos homens: " + (somaHomens/contadorHomens));
        System.out.println("Altura média das mulheres: " + (somaMulheres/contadorMulheres));
        System.out.println("Altura média dos outros: " + (somaOutros/contadorOutros));

        scanner.close();
    }
}

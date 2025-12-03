import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int pontosE = 0;
        int pontosD = 0;

        boolean vencedor = false;

        while(!vencedor) {
            System.out.print("Ponto para lado direito ou esquerdo [E ou D]: ");
            String pontuar = scanner.next();

            char letraLado = pontuar.toUpperCase().charAt(0);

            if (letraLado == 'E') {
                pontosE++;
            } else if (letraLado == 'D') {
                pontosD++;
            } else {
                System.out.println("Lado inválido, ponto não marcado. Tente novamente.");
            }

            if (pontosE == 21 && (pontosE - 2) > pontosD || pontosE > 21 && (pontosE - 2) > pontosD) {
                System.out.println("Lado esquerdo venceu!");
                vencedor = true;       
            } else if (pontosD == 21 && (pontosD - 2) > pontosE || pontosD > 21 && (pontosD - 2) > pontosE) {
                System.out.println("Lado direito venceu!");
                vencedor = true;
            }
        }


        scanner.close();

    }
}

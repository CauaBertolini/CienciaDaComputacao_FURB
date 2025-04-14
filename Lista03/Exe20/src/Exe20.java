import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe20 {
    /*
     * Análise: Enunciado não claro sobre os pesos das notas.
     * Entradas: notaProva1, notaProva2, notaProva3, notaExercicios 
     * Saídas: media, conceito
     * Processo:
     * media = (notaProva1 + notaProva2*2 + notaProva3*3 + notaExercicios)/7
     * se media >= 9 -> A Aprovado
     * senao se media >= 7.5 e < 9 -> B Aprovado
     * senao se media >= 6.0 e < 7.5 -> C Aprovado
     * senao se media >= 4.0 e < 6.0 -> D Reprovado
     * senao se media < 4 -> E Reprovado
     * Testes:
     * 8 2 6 10 -> 5,71 D Reprovado
     * 5 8 7,5 8 -> 7,36 C Aprovado
     * 8 9 10 9 -> 9,29 A Aprovado
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String conceito = "";
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("Nota 1: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double notaProva3 = scanner.nextDouble();

        System.out.print("Nota exercícios: ");
        double notaExercicios = scanner.nextDouble();

        double media = (notaProva1 + notaProva2*2 + notaProva3*3 + notaExercicios) / 7;

        if (media >= 9.0) {
            conceito = "A. Aprovado!";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B. Aprovado!";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C. Aprovado!";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D. Reprovado!";
        } else if (media < 4.0) {
            conceito = "E. Reprovado!";
        }

        System.out.println("A média de aproveitamento foi: " + df.format(media) + ". Conceito: " + conceito);

        scanner.close();
    }
}

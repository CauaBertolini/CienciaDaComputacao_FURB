import java.util.Scanner;

public class Exe05 {
    public Exe05() {
        Scanner scanner = new Scanner(System.in);

        String[] respostasMoca =  new String[5];
        String[] respostasMoco =  new String[5];

        System.out.println("Perguntas para a moça!");
        realizarPerguntas(respostasMoca, scanner);
        
        System.out.println("Perguntas para o moço!");
        realizarPerguntas(respostasMoco, scanner);

        calcularAfinidade(respostasMoca, respostasMoco);

        scanner.close();
    }



    public static void main(String[] args) {
        new Exe05();
    }

    public void realizarPerguntas(String[] vetor, Scanner leitor) {

        System.out.println("Responda com SIM, NÃO ou IND (indiferente)");
        System.out.print("Gosta de música sertaneja? ");
        vetor[0] = leitor.next().toUpperCase();
        System.out.print("Gosta de futebol? ");
        vetor[1] = leitor.next().toUpperCase();
        System.out.print("Gosta de seriados? ");
        vetor[2] = leitor.next().toUpperCase();
        System.out.print("Gosta de redes sociais? ");
        vetor[3] = leitor.next().toUpperCase();
        System.out.print("Gosta da Oktoberfest? ");
        vetor[4] = leitor.next().toUpperCase();

    }

    public void calcularAfinidade(String[] candidado1, String[] candidato2) {
        int afinidade = 0;
        for (int i = 0; i < candidado1.length; i++) {
            if (candidado1[i].equalsIgnoreCase(candidato2[1])) {
                afinidade += 3;
            } else if (candidado1[i].equalsIgnoreCase("IND") || candidato2[i] .equalsIgnoreCase("IND")) {
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }

        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês tem muito em comum.");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo.");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade <= -1 && afinidade >= -9) {
            System.out.println("Melhor não perder tempo.");
        } else if (afinidade <= -10) {
            System.out.println("Vocês se odeiam.");
        }
    }
}
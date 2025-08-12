import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) throws Exception {
        Scanner scanner =  new Scanner(System.in);

        int votosNenhumDeNos = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;

        int somaVotos = 0;

        int opcaoDeVoto = 0;

        int computarVoto = 1;

        while (computarVoto == 1) {
            System.out.println("----------------------------------------");
            System.out.println("PRÊMIO ÁLBUM DO ANO 2025 (VOTE AGORA!)");
            System.out.println("----------------------------------------");
            System.out.print("""
[ 1 ] Nenhum de Nós
[ 2 ] CPM22
[ 3 ] Skank
[ 4 ] Jota Quest
                    """);
            System.out.println("----------------------------------------");
            System.out.print("Para quem vai o seu voto? R.: ");
            opcaoDeVoto = scanner.nextInt();

            if (opcaoDeVoto > 0 && opcaoDeVoto < 5) {
                if (opcaoDeVoto == 1) {
                    votosNenhumDeNos++;
                } else if (opcaoDeVoto == 2) {
                    votosCPM22++;
                } else if (opcaoDeVoto == 3) {
                    votosSkank++;
                } else if (opcaoDeVoto == 4) {
                    votosJotaQuest++;
                }

                System.out.println("VOTO COMPUTADO!");
                System.out.println("---------------------------------------------------------");
                System.out.print("Deseja votar novamente? [1 (SIM) ou 2 (NÃO)] R.: ");
                computarVoto = scanner.nextInt();

            } else {
                System.out.println("Voto inválido!");
            }
        }
        
        somaVotos = votosCPM22 + votosJotaQuest + votosNenhumDeNos + votosSkank;
        System.out.println("---------------------------------------------------------");
        System.out.println("Com um total de " + somaVotos + " votos segue os resultados: ");
        System.out.println("---------------------------------------------------------");
        System.out.println("Nenhum de nós [ " + votosNenhumDeNos + " / " + ((votosNenhumDeNos * 100) / somaVotos) + "% ]") ;
        System.out.println("CPM22 [ " + votosCPM22 + " / " + ((votosCPM22 * 100) / somaVotos) + "% ]") ;
        System.out.println("Skank [ " + votosSkank + " / " + ((votosSkank * 100) / somaVotos) + "% ]") ;
        System.out.println("Jota Quest [ " + votosJotaQuest + " / " + ((votosJotaQuest * 100) / somaVotos) + "% ]") ;
        System.out.println("---------------------------------------------------------");


        if (votosNenhumDeNos > votosCPM22 && votosNenhumDeNos > votosJotaQuest && votosNenhumDeNos > votosSkank) {
            System.out.println("Vencedor: NENHUM DE NÓS");
        } else if (votosCPM22 > votosNenhumDeNos && votosCPM22 > votosJotaQuest && votosCPM22 > votosSkank) {
            System.out.println("Vencedor: CPM22");
        } else if (votosJotaQuest > votosNenhumDeNos && votosJotaQuest > votosCPM22 && votosJotaQuest > votosSkank) {
            System.out.println("Vencedor: Jota Quest");
        } else if (votosSkank > votosNenhumDeNos && votosSkank > votosCPM22 && votosSkank > votosJotaQuest) {
            System.out.println("Vencedor: Skank");
        } else {
            System.out.println("EMPATE TÉCNICO! SEM PRÊMIOS ESSE ANO!");
        }

        scanner.close();
    }
}

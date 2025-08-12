import java.util.Scanner;

public class Exe33 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;

        int voto = 99;

        do {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println(" ELEIÇÕES 2025 - URNA FURB n°429");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("""
[ 1 ] Candidato 1
[ 2 ] Candidato 2
[ 3 ] Candidato 3
[ 4 ] Candidato 4
[ 5 ] Nulo
[ 6 ] Branco """);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Seu voto: ");
            voto =  scanner.nextInt();

            switch (voto) {
                case 1:
                    votos1++;
                    break;
                case 2:
                    votos2++;
                    break;
                case 3:
                    votos3++;
                    break;
                case 4:
                    votos4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    if (voto != 0) {
                        System.out.println("Voto inválido! ");
                    }
                    break;
            }

        } while (voto != 0);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("   PARCIAL - URNA FURB n°429");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Votos no 01: " + votos1);
        System.out.println("Votos no 02: " + votos2);
        System.out.println("Votos no 03: " + votos3);
        System.out.println("Votos no 04: " + votos4);
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos Brancos: " +  votosBrancos);
        System.out.println("Percentual nulo ou branco: " + ((votosBrancos + votosNulos) * 100) / (votos1+votos2+votos3+votos4+votosBrancos+votosNulos) + "%");

        scanner.close();
    }
}

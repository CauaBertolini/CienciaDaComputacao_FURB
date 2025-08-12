import java.util.Scanner;

public class Exe13 {
    /*
     * Análise: Ok
     * Entradas: carta1, carta2, carta3
     * Saídas: resposta = "Truco, Seis, Nove, Nada"
     * Processo: verificar cartas  na mão do usuário e validar se ele deve dizer truco, seis, nove ou nada.
     * 
     * Testes:
     * 11 12 13 -> Fim do programa
     * 1 2 3 -> Nove!!!
     * 1 3 7 -> Truco!
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int qtCartasBoas = 0;


        System.out.print( """
ID  | Carta
(1) - ÁS
(2) - 2
(3) - 3
(7) - 7
(11) - Valete
(12) - Dama
(13) - Rei
Informe suas 3 cartas separadas por um espaço:
                """);
        int carta1 = scanner.nextInt();
        int carta2 = scanner.nextInt();
        int carta3 = scanner.nextInt();

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtCartasBoas += 1;
        }
        if (carta2 == 1 || carta2 == 2 || carta3 == 3) {
            qtCartasBoas += 1;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtCartasBoas += 1;
        }

        if (qtCartasBoas == 1) {
            System.out.println("Truco!");
        } else if (qtCartasBoas == 2) {
            System.out.println("SEIS!");
        } else if (qtCartasBoas == 3) {
            System.out.println("NOVEE!");
        } 

        System.out.println("Fim do programa!");

        scanner.close();
    }
}

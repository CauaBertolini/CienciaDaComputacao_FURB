import java.util.Scanner;
/*
 * Entradas: diaMes, totalPecasManha, totalPecasTarde
 */
public class Exe27 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int diaMes = 0;
        int totalPecasManha = 0;
        int totalPecasTarde = 0;
        double salario = 0;
        boolean dataValida = false;
        int diaMaiorProducao = 0;
        int totalDiaMaiorProducao = 0;
        int contador = 0;

        int cadastrarNovamente = 1;

        while (cadastrarNovamente == 1) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.print("Dia do mês: ");
            diaMes = scanner.nextInt();

            if (diaMes <= 30 && diaMes >= 1) {
                dataValida = true;
            }

            if (dataValida) {
                System.out.print("Peças produzidas de manhã: ");
                totalPecasManha = scanner.nextInt();

                System.out.print("Peças produzidas de tarde: ");
                totalPecasTarde =  scanner.nextInt();

                if (diaMes <= 15) {
                    if (totalPecasManha + totalPecasTarde > 100 && totalPecasManha >= 30 && totalPecasTarde >= 30) {
                        salario = (totalPecasManha + totalPecasTarde) * 0.8;
                    } else {
                        salario = (totalPecasManha + totalPecasTarde) * 0.5;
                    }

                } else {
                    salario = (totalPecasManha * 0.4) + (totalPecasTarde * 0.3);
                }

                System.out.println("--------------------------------------------------------------------------------");
                System.out.print("O funcionário receberá: R$" + salario);
                if (totalPecasManha > totalPecasTarde) {
                    System.out.println(". O funcionário produziu mais de manhã. " + totalPecasManha + " peças.");
                } else {
                    System.out.println(". O funcionário produziu mais de tarde. " + totalPecasTarde + " peças.");

                }

                if (contador == 1) {
                    diaMaiorProducao = diaMes;
                    totalDiaMaiorProducao = totalPecasManha + totalPecasTarde;
                } else if (totalPecasManha + totalPecasTarde > totalDiaMaiorProducao) {
                    diaMaiorProducao = diaMes;
                    totalDiaMaiorProducao = totalPecasManha + totalPecasTarde;
                }

                System.out.println("--------------------------------------------------------------------------------");
                System.out.print("Deseja cadastrar mais um funcionário? [1 = sim // 2 = não] R.: ");
                cadastrarNovamente =  scanner.nextInt();
            }  
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("O dia de maior produção foi o dia " + diaMaiorProducao + " com um funcionário que produziu " + totalDiaMaiorProducao + " peças.");
        scanner.close();
    }
}

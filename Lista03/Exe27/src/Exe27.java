import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Análise: Ok
 * Entradas: horaChegada, minChegada, horaSaida, minSaida
 * Saídas: valorPagar
 * Processo: verificar quanto tempo o carro ficou estacionado e validar se devo cobrar os minutos ou não. Lançar valor total a ser pago no final de acordo com a tabela de preços progressiva.
 * Testes:
 * Chegou 12:30 saiu 16:12 -> 3h42min Pagará R$25,00
 * Chegou 14:21 saiu 17:13 -> 2h52min Pagará R$17,50
 * Chegou 8:00 saiu 19:00 -> 12h00min Pagará R$105,00
 */
public class Exe27 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        double valorPagar = 0.0;

        System.out.print("Hora de chegada: ");
        int horaChegada = scanner.nextInt();
        int minChegada = scanner.nextInt();
        System.out.print("Hora de saída: ");
        int horaSaida = scanner.nextInt();
        int minSaida = scanner.nextInt();

        if (horaSaida < horaChegada || minSaida > 60 || minChegada > 60 || horaChegada > 23 || horaSaida > 23 || horaChegada < 0 || horaSaida < 0 || minChegada < 0 || minSaida < 0) {
            System.out.println("Horário impossível, ou seu valor superou a regra de 24 horas e 60 minutos, ou o veículo ficaria de um dia para o outro");
        } else {

            int horaFicada = horaSaida - horaChegada;
            int minFicada = (60 - minChegada) + minSaida;

            if (minFicada >= 60) {
                minFicada -= 60;
                horaFicada += 1;
            }
            
            if(minChegada > 1) {
                    horaFicada -= 1;
                }
            int horaContabilizada = horaFicada;

            if (minFicada > 30) {
                horaContabilizada += 1;
            }

            if (horaContabilizada == 0) {
                horaContabilizada = 1;
            }

            switch (horaContabilizada) {
                case 1:
                case 2:
                    valorPagar = horaContabilizada * 5;
                    break;
                case 3:
                case 4:
                    valorPagar = 10 + (horaContabilizada - 2) * 7.5;
                    break;
                default:
                    valorPagar = 25 + (horaContabilizada - 4) * 10;
                    break;
            }

            System.out.println("Você permaneceu por " + horaFicada + " horas e " + minFicada + " minutos. Pagará R$" + df.format(valorPagar));
        }

        scanner.close();
    }
}

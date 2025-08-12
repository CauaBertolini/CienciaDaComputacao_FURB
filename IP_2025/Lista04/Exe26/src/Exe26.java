import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) throws Exception {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Qual o preço limite dos pedágios? R$ ");
        double limiteDePreco = scanner.nextDouble(); 

        double distanciaTrecho = 0;
        double precoPedagio = 0;

        int contadorDeRejeitados = 0;
        int contadorDeTrechos = 0;
        int contadorDeParadas150 = 0;

        while (precoPedagio >= 0) {

            System.out.print("Preço do pedágio: R$ ");
            precoPedagio = scanner.nextDouble();

            if (precoPedagio >= 0) {
                 System.out.print("Informe a distância da parada: ");
                 distanciaTrecho = scanner.nextDouble();
               
                if (precoPedagio <= limiteDePreco) {
                    contadorDeTrechos++;
                    if (distanciaTrecho >= 150) {
                        contadorDeParadas150++;
                    }
                } else {
                    contadorDeTrechos++;
                    contadorDeRejeitados++;
                }
            }
        }

        System.out.println("Trechos informados: " + contadorDeTrechos);
        System.out.println("Trechos acima de 150km aceitos: " + contadorDeParadas150);
        System.out.println("Trechos rejeitados por serem caros: " + contadorDeRejeitados);

        scanner.close();
    }
}

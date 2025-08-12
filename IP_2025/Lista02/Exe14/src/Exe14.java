import java.util.Scanner;

public class Exe14 {
    /*
    Análise: Entrada ok
    Entradas: distancia, tempo
    Saídas: valocidadeMedia, combustivelGasto
    Processo: 
    velocidadeMedia = distancia / tempo
    combustivelGasto = distancia / 12.00
    Testes: 
    8km em 0.30hrs = 26,67km/h e 0,67 litros
    296,2km em 6hrs = 49,37km/h e 24,69 litros 
    67km em 2,5hrs = 26,80km/h e 5,58 litros 

     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a distância e o tempo da sua viagem, respectivamente, separados por espaço: ");
        double distancia = scanner.nextDouble();
        double tempo =  scanner.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double combustivelGasto = distancia / 12.00;
        
        System.out.printf("Durante esta viagem, você teve uma velocidade média de %.2fkm/h e gastou %.2f litros de gasolina", velocidadeMedia, combustivelGasto);

        scanner.close();
    }
}

import java.util.Scanner;

public class Exe10 {
    /*
     * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos. 
     * Análise: valores de entrada ok
     * Entradas: tempoSegundos
     * Saídas: tempoHora, tempoMinuto, tempoSegundo.
     * Processo: 
     * tempoHora = (tempoSegundos / 60) / 60 
     * tempoMinuto = (tempoSegundos / 60) % 60 
     * tempoSegundo = tempoSegundos % 60 
     * Fluxorama:  
     * Testes: 6000s = 1h:40min:00s
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tempo em segundos do evento: ");
        int tempoSegundos = scanner.nextInt();

        int tempoHora = (tempoSegundos / 60) / 60;
        int tempoMinuto = (tempoSegundos / 60) % 60;
        int tempoSegundo = (tempoSegundos % 60);

        System.out.println("O evento dura " + tempoHora + "hrs" + tempoMinuto + "min" + tempoSegundo + "s");
    
        scanner.close();
    }
}

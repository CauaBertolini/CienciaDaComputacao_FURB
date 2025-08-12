import java.util.Scanner;

public class Exe09 {
    /*
    Análise: Não informa entradas
    Entradas: raio, altura
    Saídas: volume
    Processo: volume = PI * pow(raio, 2) * altura
    Testes: 
    raio = 3 e altura = 2 // volume = 37,70
    raio = 8 e altura = 7 // volume = 1407,43
    raio = 5 e altura = 2 // volume = 157,08
    */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o raio e altura da lata, separados por espaço: (raio altura) ");
        double raio = scanner.nextDouble();
        double altura = scanner.nextDouble();

        double PI = Math.PI;

        double volume = PI * (Math.pow(raio, 2.0)) * altura;

        System.out.printf("O volume dessa lata é de: %.2f", volume);

        scanner.close();
    }
}


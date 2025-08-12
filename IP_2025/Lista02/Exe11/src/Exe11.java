import java.util.Scanner;

public class Exe11 {
    /*
    Análise: Enunciado ok
    Entradas: temperaturaCelsius
    Saídas: temperaturaFahrenheit
    Processo: temperaturaFahrenheit = (temperaturaCelsius * 9/2) + 32
    Testes: 
    36 // 96,80
    15 // 59,00
    100 // 212,00

    */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double temperaturaCelsius =  scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) +32;

        System.out.printf("%.2f° Celsius é igual a %.2f° Fahrenheit.", temperaturaCelsius, temperaturaFahrenheit);


        scanner.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Massa do material: ");
        double peso = scanner.nextDouble();

        double pesoGramas = peso * 1000;
        
        int segundos = 0;

        while (pesoGramas >= 0.50) 
        {
            segundos += 50;
            pesoGramas -= pesoGramas * 0.50;
        }

        System.out.println("O material levou " + (segundos/60) + " minutos e " + (segundos%60) + " segundos para ir de " + peso + "Kg para " + pesoGramas + "g") ;


        scanner.close();
    }
}

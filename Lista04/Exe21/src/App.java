import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double chico = 1.50;
        double ze = 1.10;
        int ano = 0;

        while (chico >= ze) 
        {
            chico += 0.02;
            ze += 0.03;
            ano++;

        }

        System.out.println("Levará " + ano + " anos para Zé se tornar mais alto que Chico.");


        scanner.close();
    }
}

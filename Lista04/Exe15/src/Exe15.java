import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nome = "";

        while (!nome.equals("fim")) {
            System.out.print("Nome do aluno: ");
            nome =  scanner.next();

            if (!nome.equalsIgnoreCase("FIM")) {
                System.out.print("Nota 1: ");
                 double nota1 =  scanner.nextInt();

                System.out.print("Nota 2: ");
                double nota2 =  scanner.nextInt();

                System.out.println("A média de " + nome + " é: " + ((nota1+nota2)/2));
            }
            
        }


        scanner.close();
    }
}

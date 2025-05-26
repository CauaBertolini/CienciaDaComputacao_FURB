import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        
        double salario = 2000;
        int ano = 1995;
        double anterior = 0;

        while (ano <= 2025) 
        {
            ano++;
            if (ano == 1996) 
            {
                salario += (salario * 0.015);
                anterior = (salario * 0.015);
                
            } else 
            {
                salario += (anterior * 2);
                anterior = anterior * 2;
            }

        }

        System.out.println("Salário em 2025: R$" + salario);


        scanner.close();
    }
}

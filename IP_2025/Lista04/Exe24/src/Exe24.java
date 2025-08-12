import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double somaPeixes = 0;
        boolean MaisPeixe = true;
        
        System.out.print("Peso limite de pesca: (em KG) ");
        double pesoLimite = scanner.nextDouble() * 1000;
        

        while(MaisPeixe)
        {
            System.out.print("Peso do peixe: (em g) ");
            double pesoPeixe = scanner.nextDouble();

            somaPeixes += pesoPeixe;

            System.out.println("Peso total: " + somaPeixes + "g de um máximo " + pesoLimite + "g");
            System.out.println("-----------------------------------------------------------");
            
            if (somaPeixes > pesoLimite) 
            {
                System.out.println("Peso limite atingido, fim da pescaria!");
                break;
            } else {
                
                System.out.print("Deseja cadastrar mais um peixe? (S/N) ");
                String resposta = scanner.next();

                if (resposta.equalsIgnoreCase("N"))
                {
                    MaisPeixe = false;
                } else if (!resposta.equalsIgnoreCase("S")) {
                    System.out.println("Resposta inválida!");
                }
            }

           
        }


        scanner.close();
    }
}

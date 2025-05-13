import java.util.Scanner;

public class Exe34 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        String nome = "";
        int qntDiarias = 0;
        int qntContasEncerradas = 0;
        double valorPagar = 0;


        do {
            System.out.println("-------------------------------");
            System.out.println("HOSTEL FURB PALACE");
            System.out.println("[ 1 ] Encerrar conta de cliente");
            System.out.println("[ 2 ] Verificar contas encerradas");
            System.out.println("[ 3 ] Sair");
            System.out.println("-------------------------------");
            System.out.print("Escolha: ");
            escolha = scanner.nextInt();
            System.out.println("-------------------------------");


            switch (escolha) {
                case 1:
                    System.out.print("Nome do hóspede: ");
                    nome = scanner.next();
                    
                    System.out.print("Quantidade de diárias: ");
                    qntDiarias = scanner.nextInt();
                        
                    qntContasEncerradas++;    

                    valorPagar = qntDiarias * 50;

                    if (qntDiarias > 15) {
                        valorPagar += qntDiarias * 5;
                    } else if (qntDiarias == 15) {
                        valorPagar += qntDiarias * 6.5;
                    } else if  (qntDiarias < 15) {
                        valorPagar += qntDiarias * 7.5;
                    }

                    System.out.println("-------------------------------");
                    System.out.println("Hóspede " + nome);
                    System.out.println("Valor á pagar: R$" + valorPagar);

                    break;

                case 2:
                    System.out.println("Foram encerradas " + qntContasEncerradas + " hospedagens.");

                    break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }


        } while (escolha != 3);


        scanner.close();
    }
}

import java.util.Scanner;

public class Exe32 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("""
[ 1 ] Domingo
[ 2 ] Segunda
[ 3 ] Terça
[ 4 ] Quarta
[ 5 ] Quinta
[ 6 ] Sexta
[ 7 ] Sábado """);
        System.out.println("---------------------");
        
        System.out.print("Dia em que começa o mês: ");
        int dia = scanner.nextInt();

        System.out.print("Quantidade de dias do mês: ");
        int diasMes = scanner.nextInt();

        int contador = 1;
        int contadorSemana = 0;
        System.out.println("--------------------");
        System.out.println("DO SE TE QU QI SE SA");
        System.out.println("--------------------");

        while (contador <= diasMes) {
            
            if (contador == 1) {
                switch (dia) {
                    case 1:
                        System.out.print(" " + contador + " ");
                        contadorSemana = 1;
                        break;
                    case 2:
                        System.out.print("    " + contador + " ");
                        contadorSemana = 2;
                        break;
                    case 3:
                        System.out.print("       " + contador + " ");
                        contadorSemana = 3;
                        break;
                    case 4:
                        System.out.print("          " + contador + " ");
                        contadorSemana = 4;
                        break;
                    case 5:
                        System.out.print("             " + contador + " ");
                        contadorSemana = 5;
                        break;
                    case 6:
                        System.out.print("                " + contador + " ");
                        contadorSemana = 6;
                        break;
                    case 7:
                        System.out.print("                   " + contador + " ");
                        contadorSemana = 7;
                        break;
                    default:
                        break;
                }
            } else {
                
                if (contadorSemana < 7) {
                    contadorSemana++;

                    if  (contador < 10) {
                        System.out.print(" " + contador + " ");
                    } else {
                        System.out.print(contador + " ");
                    }
                } else {
                    System.out.println();
                    contadorSemana = 1;
                    if  (contador < 10) {
                        System.out.print(" " + contador + " ");
                    } else {
                        System.out.print(contador + " ");
                    }
                }

            }
            contador++;


        }


        scanner.close();
    }
}

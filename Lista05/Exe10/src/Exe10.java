import java.util.Scanner;

public class Exe10 {

    public Exe10 () {
        Scanner scanner = new Scanner(System.in);
        String escolhasDoMenu[] = {"Incluir valor", "Pesquisar valor", "Alterar valor", "Excluir valor", "Mostrar valores", "Ordenar valores", "Inverter valores", "Sair do sitema"};
      

        int[] valores = new int[50];
        for (int i = 0; i < valores.length; i++) {
            valores[i] =  Integer.MIN_VALUE;
        }

       int opc = 0;

        while (opc != 8) {
            
            opc = mostrarMenu(escolhasDoMenu, scanner);

            switch (opc) {
                case 1:
                    System.out.println("_______________________________");
                    incluirValor(valores, scanner);
                    break;

                case 2:
                    System.out.println("_______________________________");
                    pesquisarValor(valores, scanner);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    System.out.println("Encerrando programa!");
                    break;
                default:
                    break;
        }

        
        }

        scanner.close();

    }
    public static void main(String[] args) throws Exception {
        new Exe10();
    }

    public int mostrarMenu(String[] escolhasDoMenu, Scanner scanner) {
        boolean opcaoValida = false;
        int opcao;
        do {

            int contador = 0;
            System.out.println("________Menu de Valores________");

            for (String escolha : escolhasDoMenu) {
                contador++;
               System.out.println(contador + " - " +  escolha);
            }
            System.out.println("_______________________________");
            System.out.print("Sua escolha: ");
            opcao =  scanner.nextInt();

            if (opcao >= 1 && opcao <= contador) {
                opcaoValida = true;
                return opcao;

            } else {
                System.out.println("Opção inválida, tente novamente!");
            }

        } while (!opcaoValida);
        return opcao;
    }


    public void incluirValor(int[] vetor, Scanner scanner) {
        boolean valorIncluido = false;
        int contador = 0;

        System.out.print("Valor para inserir: ");
        int valor = scanner.nextInt();
        while (!valorIncluido && contador < 50) {
            if (vetor[contador] == Integer.MIN_VALUE) {
                vetor[contador] = valor;
                valorIncluido = true;
                System.out.println("Valor incluído!");
                  System.out.println("_______________________________");
            } 
        }

        if (!valorIncluido) {
            System.out.println("Valor não foi incluído por falta de espaço.");
        }
    }

    public void pesquisarValor(int[] valores, Scanner scanner) {
        
        System.out.print("Valor para pesquisar: ");
        int valor = scanner.nextInt();

        boolean valorEncontrado = false;
        for (int v : valores) {
            if (v == valor && !valorEncontrado) {
                System.out.println("Valor encontrado");
                valorEncontrado = true;
            }
        }

        if (!valorEncontrado) {
            System.out.println("Não foi localizado o valor "+ valor + " na lista de valores.");
        }

    }
}

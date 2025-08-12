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
        int tamanhoVetor = 0;

        while (opc != 8) {
            
            opc = mostrarMenu(escolhasDoMenu, scanner);

            switch (opc) {
                case 1:
                    System.out.println("_______________________________");
                    tamanhoVetor = incluirValor(valores, scanner, tamanhoVetor);
                    System.out.println("_______________________________");
                    break;

                case 2:
                    System.out.println("_______________________________");
                    pesquisarValor(valores, scanner, tamanhoVetor);
                    System.out.println("_______________________________");
                    break;

                case 3:
                    System.out.println("_______________________________");
                    alterarValor(valores, scanner, tamanhoVetor);
                    break;

                case 4:
                    System.out.println("_______________________________");
                    excluirValor(valores, scanner, tamanhoVetor);
                    System.out.println("_______________________________");
                    break;
                case 5:
                    System.out.println("_______________________________");
                    mostrarValores(valores, tamanhoVetor);
                    System.out.println("_______________________________");
                    break;
                case 6:
                    System.out.println("_______________________________");
                    ordenarVetor(valores, tamanhoVetor);
                    System.out.println("_______________________________");
                    break;
                case 7:
                    System.out.println("_______________________________");
                    inverterVetor(valores, tamanhoVetor);
                    System.out.println("_______________________________");
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

    public void mostrarValores(int[]vetor, int tamanho) {
        if (vetorPossuiValores(tamanho)) {
            System.out.println("Índice // Valor");
            for (int i = 0; i < tamanho; i++) {
                System.out.println("[ " +  i +  " ] " + vetor[i]);
            }
        }
    }

    public int incluirValor(int[] vetor, Scanner scanner, int tamanho) {
        boolean valorIncluido = false;
        int contador = 0;

        System.out.print("Valor para inserir: ");
        int valor = scanner.nextInt();
        
        while (!valorIncluido && contador < vetor.length) {
            if (vetor[contador] == Integer.MIN_VALUE) {
                vetor[contador] = valor;
                valorIncluido = true;
                System.out.println("Valor incluído!");
                System.out.println("_______________________________");
                tamanho++;
            } 
            contador++;
        }

        if (!valorIncluido) {
            System.out.println("Valor não foi incluído por falta de espaço.");
        }
        
        return tamanho;
    }

    public void pesquisarValor(int[] valores, Scanner scanner, int tamanho) {

        if (vetorPossuiValores(tamanho)) {
            System.out.print("Valor para pesquisar: ");
            int valor = scanner.nextInt();

            boolean valorEncontrado = false;
            for (int v : valores) {
                if (v == valor && !valorEncontrado) {
                    System.out.println("Valor encontrado!");
                    valorEncontrado = true;
                }
            }

            if (!valorEncontrado) {
                System.out.println("Não foi localizado o valor "+ valor + " na lista de valores.");
            }

        }
        
    }

    public void alterarValor(int[] valores , Scanner scanner, int tamanho) {
        
        System.out.print("Valor para alterar: ");
        int valorParaAlterar = scanner.nextInt();
        boolean valorEncontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (valorParaAlterar == valores[i] && !valorEncontrado) {
                valorEncontrado = true;
                System.out.print("Valor encontrado! Informe o novo valor: ");
                int novoValor = scanner.nextInt();

                valores[i] = novoValor;
            }
        }

        if (!valorEncontrado) {
            System.out.println("Valor não encontrado!");
        }
    }

    public int excluirValor (int[] valores, Scanner scanner, int tamanho) {
        System.out.print("Valor para excluir: ");
        int valorExcluir = scanner.nextInt();
        boolean valorEncontrado = false;
        
        if (vetorPossuiValores(tamanho)) {
            for (int i = 0; i < tamanho; i++) {
                if (valores[i] == valorExcluir && !valorEncontrado) {
                    valores[i] = Integer.MIN_VALUE;
                    tamanho--;
                    valorEncontrado = true;
                    System.out.println("Valor excluído!");
                    organizarVetor(valores, tamanho);
                }
            }
    
            if (!valorEncontrado) {
                System.out.println("Valor não encontrado para exclusão!");
            }
    
            return tamanho;
        } else {
            return tamanho;
        }

    }

    public void ordenarVetor (int[] vetor, int tamanho) {
        if (vetorPossuiValores(tamanho)) {
            int i = 0;

            while (i < tamanho-1) {
                if (vetor[i] > vetor[i+1]) {
                    int bolha = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = bolha;
                    i = 0;
                } else {
                    i++;
                }
            }

            System.out.println("Valores ordenados!");
        }
    }

    public void inverterVetor (int[] vetor, int tamanho) {
        if (vetorPossuiValores(tamanho)) {
            int temp = 0;
            for (int i = 0; i < tamanho; i++) {
                for (int x = 0; x < i; x++) {
                       temp = vetor[i];
                       vetor[i] = vetor[x];
                       vetor[x] = temp;
                }
            }

        }
        System.out.println("Valores invertidos!");
    }

    public void organizarVetor(int[] vetor, int tamanho) {
        int i = 0;
        while (i < tamanho) {
            if (vetor[i] == Integer.MIN_VALUE) {
                vetor[i] = vetor[i+1];
                vetor[i+1] = Integer.MIN_VALUE;
                tamanho--;
            } 
            i++;
        }
    }

    public boolean vetorPossuiValores (int tamanho) {
        if (tamanho == 0) {
            System.out.println("Vetor não possúi valores!");
            return false;
        }  else {
            return true;
        }

    }
}

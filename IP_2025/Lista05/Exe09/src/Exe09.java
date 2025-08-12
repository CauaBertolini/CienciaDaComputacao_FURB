import java.util.Scanner;

public class Exe09 {
    /*
     * Vetor de sexo
     * Vetor de idade
     * Vetor de nota
     */

    public Exe09 () {
        Scanner scanner = new Scanner(System.in);
        
        int n = 30;

        String sexosList [] = new String[n];
        int idadesList [] = new int[n];
        double notasList [] = new double[n];

        double media;
        double mediaMasculina;

        popularVetores(sexosList, idadesList, notasList, scanner);

        System.out.println("");
        System.out.println("___________RESULTADOS DA AVALIAÇÃO___________");

        media = calcularNotaMedia(notasList);
        System.out.println("Nota média: " + media);

        mediaMasculina = calcularNotaMediaDosHomens(notasList, sexosList);
        System.out.println("Nota média dada pelos homens: " + mediaMasculina);

        mostrarNotaDadaPorMulherMaisNova(notasList, sexosList, idadesList);

        mostrarQuantidadeMulheresNotaMaiorQueMedia(notasList, sexosList, mediaMasculina);

        scanner.close();

    }
    public static void main(String[] args) throws Exception {
        new Exe09();
        
    }

    public void popularVetores (String sexo[], int idades[], double notas[], Scanner scanner) {

        System.out.println("__________Avaliação do Cinema__________");

        for (int i = 0; i < sexo.length; i++) {
            int respostaSexo;
            boolean sexoValido = false;
            boolean notaValida = false;

            System.out.println("");
            System.out.println("_____________Pessoa [" + (i+1) + "]_________________");

            do {

                System.out.print("Sexo (1 - Feminino ou 2 - Masculino): ");

                respostaSexo = scanner.nextInt();
               
                System.out.println("-----------------------------------------");
                
                switch (respostaSexo) {
                    case 1:
                        sexo[i] = "feminino";
                        sexoValido = true;
                        break;

                    case 2:
                        sexo[i] = "masculino";
                        sexoValido = true;
                        break;

                    default:
                        System.out.println("Sexo inválido, tente novamente.");
                        break;

                } 
            } while (!sexoValido);

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();


            do {

                System.out.println("-----------------------------------------");
                System.out.print("Nota: ");
                double nota =  scanner.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida, tente novamente.");
                } else {
                    notas[i] = nota;
                    notaValida = true;
                }

            }  while (!notaValida);
            System.out.println("-----------------------------------------");

        }

    }

    public double calcularNotaMedia (double notas[]) {
        double somaNotas = 0;
        int contador = 0;
        for (double nota : notas) {
            somaNotas += nota;
            contador++;
        }

        return somaNotas / contador;
    }

    public double calcularNotaMediaDosHomens (double notas[], String sexos[]) {
        double somaNotas = 0;
        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            if (sexos[i].equalsIgnoreCase("masculino")) {
                somaNotas += notas[i];
                contador++;
            }
        }
        return somaNotas / contador;
    }

    public void mostrarNotaDadaPorMulherMaisNova (double notas[], String sexos[], int idades[]) {
        int contador = 0;
        double nota = 0;
        int idadeMulherMaisNova = 0;


        for (int i = 0; i < sexos.length; i++) {
           if (sexos[i].equalsIgnoreCase("feminino")) {
                contador++;
                if (contador == 1) {

                    idadeMulherMaisNova = idades[i];
                    nota = notas[i];

                } else if (idades[i] < idadeMulherMaisNova) {

                    idadeMulherMaisNova = idades[i];
                    nota = notas[i];

                }
           } 
        }

        System.out.println("Nota dada pela mulher mais nova com "+ idadeMulherMaisNova +" anos: " + nota);
    }

    public void mostrarQuantidadeMulheresNotaMaiorQueMedia (double notas[], String sexos[], double media) {
        int contador = 0;
        for (int i = 0; i < sexos.length; i++) {

            if (sexos[i].equalsIgnoreCase("feminino")) {
                if (notas[i] > media) {
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de mulheres que deram uma nota acima da média: " + contador);
    }
    
}

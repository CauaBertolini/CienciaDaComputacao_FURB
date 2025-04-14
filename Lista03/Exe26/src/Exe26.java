import java.util.Scanner;

public class Exe26 {
    /*
     * Análise: Ok
     * Entradas: opcao
     * Saídas: Cálculo escolhido pelo usuário.
     * Processo: Validar opção do usuário e realizar a operação correspondente.
     * 
     * Testes:
     * opcao = T base 2 altura 4 -> area = 8
     * opcao = R b = 19 h = 15 -> area = 285
     * opcao = q lado = 2 -> area = 4
     * 
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("T: calcular área de um triângulo de base b e altura h ");
        System.out.println("Q: calcular área de um quadrado de lado l ");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular área de círculo de raio r ");
        System.out.print("Sua escolha: ");

        String opcao = scanner.nextLine();

        opcao = opcao.toUpperCase();
        char letra = opcao.charAt(0);

        switch (letra) {
            case 'T':
                System.out.print("Digite a base e a altura do triângulo: ");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                System.out.println("Área do triângulo = " + base * altura / 2);
                break;
            case 'Q':
                System.out.print("Digite o lado: ");
                double lado = scanner.nextDouble();
                System.out.println("Área do quadrado = " + lado * lado);
                break;
            case 'R':
                System.out.print("Digite a base e a altura do retângulo: ");
                double b = scanner.nextDouble();
                double h = scanner.nextDouble();
                System.out.println("Área do retângulo = " + b * h);
                break;
            case 'C':
                System.out.print("Digite o raio: ");
                double r = scanner.nextDouble();
                System.out.println("Área do círculo: " + Math.PI * Math.pow(r, 2));
            default:
                break;
        
        }
        scanner.close();
    }
}

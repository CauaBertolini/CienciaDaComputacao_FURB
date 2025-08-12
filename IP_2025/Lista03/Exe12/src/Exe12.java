import java.util.Scanner;

public class Exe12 {
    /*
     * Análise: Ok
     * Entradas: lado1, lado2, lado3
     * Saídas: mensagem (equilátero, isóceles, escaleno ou impossível)
     * Processo:
     * se lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2) 
     *  se lado1 == lado2 && lado2 == lado3 -> Equilátero
     *  senao se lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> Isóceles
     *  senao -> Escaleno
     * senao -> impossível
     * 
     * Testes:
     * 7 7 7 -> Equilátero
     * 8 9 10 -> Isóceles
     * 12 12 10 -> Escaleno
     * 21 12 8 -> Impossível
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe 3 lados de um triângulo (separados por um espaço): ");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero!");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isóceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Não é possíve formar um triângulo com essas medidas.");
        }

        scanner.close();
    }
}

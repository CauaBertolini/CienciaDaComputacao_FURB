import java.util.Scanner;

public class Exe05 {
    /*
     * Análise: Ok
     * Entradas: resposta
     * Saídas: Sim ou Não
     * Processo:
     * Se resposta -> Sim
     * Senão -> Não
     * Testes:
     * true -> Sim
     * false -> Não
     * sadasd -> Erro
     */
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("A cor é azul? [true] [false] ");
    boolean resposta = scanner.nextBoolean();

    if (resposta) {
        System.out.println("Sim");
    } else {
        System.out.println("Não");
    }

    scanner.close();
    }
}
    

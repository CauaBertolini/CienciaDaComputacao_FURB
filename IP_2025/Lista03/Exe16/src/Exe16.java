import java.util.Scanner;
/*
 * Análise: Ok
 * Entradas: idadeHomem1, idadeHomem2, idadeMulher1, idadeMulher2
 * Saídas: soma, produto
 * Processo: valida qual é o homem e a mulher mais velha e mais nova e calcula a soma das idades do o homem mais velho e a mulher mais nova e o produto das idades do homem mais novo e a mulher mais velha.
 * 
 * Testes:
 * 32 12 34 23 -> Soma = 55 Produto = 408
 * 11 14 15 13 -> Soma = 27 Produto = 165
 * 45 23 56 78 -> Soma = 123 Produto = 1288
 */
public class Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade Homem 1: ");
        int idadeHomem1 = scanner.nextInt();

        System.out.print("Idade Homem 2: ");
        int idadeHomem2 = scanner.nextInt();

        System.out.print("Idade Mulher 1: ");
        int idadeMulher1 = scanner.nextInt();

        System.out.print("Idade Mulher 2: ");
        int idadeMulher2 = scanner.nextInt();

        int homemVelho;
        int homemNovo;
        int mulherVelha;
        int mulherNova;

        if (idadeHomem1 > idadeHomem2) {
            homemVelho = idadeHomem1;
            homemNovo = idadeHomem2;
        } else {
            homemVelho = idadeHomem2;
            homemNovo = idadeHomem1;
        }
        
        if (idadeMulher1 > idadeHomem2) {
            mulherVelha = idadeMulher1;
            mulherNova = idadeMulher2;
        } else {
            mulherVelha = idadeMulher2;
            mulherNova = idadeMulher1; 
        }

        int soma = homemVelho + mulherNova;
        int produto = homemNovo * mulherVelha;

        System.out.println("Soma: " + soma + " Produto: " + produto);
        scanner.close();
    }
}

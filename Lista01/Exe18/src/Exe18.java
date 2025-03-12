import java.util.Scanner;
/*
 *Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Leia o comprimento e altura de uma parede (em metros) e escreva o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos. 
 *Análise: Ok   
 *Entradas: alturaParede, comprimentoParede 
 *Processo: 
 *AreaParede = alturaParede * comprimentoParede 
 *Custo = areaParede * 9 * 12.5 
 *Saída: custo 
 *Fluxograma:
 *Testes: 
 */
public class Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner copiaLinha = new Scanner(System.in);

        System.out.println("Informe a altura da parede: ");
        double alturaParede = copiaLinha.nextDouble();

        System.out.println("Informe o comprimento da parede: ");
        double comprimentoParede = copiaLinha.nextDouble();

        double areaParede = alturaParede * comprimentoParede;

        double custo = areaParede * 9 * 12.5;

        System.out.println("O custo é: " + custo);

        copiaLinha.close();

    }
}

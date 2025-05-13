import java.util.Scanner;
/*
Entrada: n quandidade d valores da sequência que deseja visualizar
Saída: Listagem da sequência
Processo:

n1 é 8 e n2 é 10

Enquanto o índice não atingir a quantidade de N listados:

Se estivermos em casa par (que é como começaremos)

guardamos o valor de n1 como anterior (8)
o n1 será mostrado (8)
e depois será multiplicado por 2 (16) que será o próximo valor

Se estivermos em casa impar (obrigatóriamente será a segunda a ser listada)

mostraremos n2 (10)
e n2 somará com o valor anterior (8)

----------------------------------------------------

Quando o código se repetir, o valor anterior sempre será atualizado antes do n1 sofrer multiplicação, dessa forma, quando mostramos 32 (16*2)
o n2 somará ainda com 16 e não 32, á essa altura, 10 terá se somado com 8 e virado 18 e 18 se somará á 16 e virará 34.
 */
public class Exe05 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int n1 = 8;
        int n2 = 10;
        int valorAnterior = 0;
        int n;

        do {
            
            System.out.print("Um número maior que 2: ");
            n = scanner.nextInt(); 

        } while (n <= 2); 


        for (int i = 2; i <=n+1; i++) {

            if (i % 2 == 0) {

                valorAnterior = n1;
                System.out.print(n1 + " ");
                n1 = n1 * 2;

            } else {

                System.out.print(n2 + " ");
                n2 += valorAnterior;

            }
        }

        scanner.close();

    }
}

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int biscoitosQuebrados = 0;
        int quebradosAntes = 0;

        for (int i = 1; i <= 16; i++) {
            if (i == 1) {
                biscoitosQuebrados++;
            } else if (i == 2) {    
                biscoitosQuebrados += 3;
                quebradosAntes = 3;
            } else {
                biscoitosQuebrados += (quebradosAntes * 3);
                quebradosAntes = quebradosAntes*3;
            }
           
        }

        System.out.println(biscoitosQuebrados + " biscoitos quebrados em 16h");

        scanner.close();
    }
}

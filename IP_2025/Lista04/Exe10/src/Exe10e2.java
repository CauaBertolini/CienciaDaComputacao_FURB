import java.util.Scanner;

public class Exe10e2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 99; i++) {
            for (int j = 1; j <= 99 ; j++) {
                
                String iString = String.valueOf(i);
                String jString = "";

                if (j < 10)  {
                    jString = "0" + j;
                } else {
                    jString = String.valueOf(j);
                }

                String somaString = iString + jString;
                Integer soma = Integer.parseInt(somaString);

                if ((i + j) * (i + j) == soma) {
                    System.out.println(iString + " + " + jString + " = " + (i+j));
                    System.out.println(i+j + "^2 = " + (i+j)*(i+j));
                    System.out.println(somaString + " = " + (i+j)*(i+j));
                }

            }
        }



        scanner.close();
    }
}

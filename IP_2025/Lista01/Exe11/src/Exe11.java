import java.util.Scanner;

public class Exe11 {
    /*
     * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
     * a) a área do triângulo retângulo que tem A por base e C por altura. 
     * b) a área do círculo de raio C. (pi = 3.14159). 
     * c) a área do trapézio que tem A e B por bases e C por altura. 
     * d) a área do quadrado que tem lado B. 
     * e) a área do retângulo que tem lados A e B. 
     * Análise: valores de entrada ok
     * Entradas: doubleA, doubleB, doubleC
     * Saídas: a, b, c, d, e
     * Processo: 
     * a = (A * C) / 2 
     * b = PI * C * 2 
     * c = ((A + B)  * C) / 2 
     * d = B * B 
     * e = A * B 
     * Fluxorama:  
     * Testes: 6000s = 1h:40min:00s
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float PI = (float) Math.PI;

        System.out.print("Número A: ");
        float A = scanner.nextFloat();

        System.out.print("Número B: ");
        float B = scanner.nextFloat();

        System.out.print("Número C: ");
        float C = scanner.nextFloat();

        float a = (A * C) / 2;
        float b = PI * C * 2;
        float c = ((A + B) * C) / 2;
        float d = B * B;
        float e = A * B;
        
        System.out.println("Área do triângulo: " + a);
        System.out.println("Área do círculo: " + b);
        System.out.println("Área do Trapézio: " + c);
        System.out.println("Área do Quabrado: " + d);
        System.out.println("Área do Retângulo: " + e);
        
        scanner.close();
        
    }
}

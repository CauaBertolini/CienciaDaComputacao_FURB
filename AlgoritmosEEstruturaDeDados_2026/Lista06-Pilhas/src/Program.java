import pilha.PilhaListaEncadeada;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public void run() throws Exception {
        Scanner leitor = new Scanner(System.in);

        boolean exit = false;

        System.out.println("Informe um elemento para adicionar: ");
        String expressao = leitor.next();

        boolean resultado = validar(expressao);

        System.out.println("Resultado: " + resultado);

    }

    public boolean validar(String expressao) throws Exception {
        PilhaListaEncadeada<Character> pilha = new PilhaListaEncadeada<>();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            // Abertura
            if (c == '(' || c == '{' || c == '[') {
                pilha.push(c);
            }

            // Fechamento
            else if (c == ')' || c == '}' || c == ']') {

                if (pilha.estaVazia()) {
                    return false;
                }

                char topo = pilha.pop();

                if (!combina(topo, c)) {
                    return false;
                }
            }
        }

        return pilha.estaVazia();
    }

    private boolean combina(char abertura, char fechamento) {
        return (abertura == '(' && fechamento == ')') ||
                (abertura == '{' && fechamento == '}') ||
                (abertura == '[' && fechamento == ']');
    }
}





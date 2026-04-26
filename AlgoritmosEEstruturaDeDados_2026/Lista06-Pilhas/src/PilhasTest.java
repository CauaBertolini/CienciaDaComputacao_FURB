import org.junit.Test;
import pilha.Pilha;
import pilha.PilhaListaEncadeada;
import pilha.PilhaVetor;

import static org.junit.Assert.assertEquals;

public class PilhasTest {
    @Test
    public void caso1_criarListaVazia() {
        PilhaVetor pilha = new PilhaVetor(10);
        assertEquals(pilha.estaVazia(), true);
    }

    @Test
    public void caso2_criarPilhaNaoVazia() {
        PilhaVetor pilha = new PilhaVetor(10);
        pilha.push(10);
        assertEquals(pilha.estaVazia(), false);
    }

    @Test
    public void caso3_desempilharValores() {
        PilhaVetor pilha = new PilhaVetor(10);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(30, pilha.pop());
        assertEquals(20, pilha.pop());
        assertEquals(10, pilha.pop());
    }

    @Test
    public void caso4_pilhaCheia() {
        PilhaVetor pilha = new PilhaVetor(3);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        try {
            pilha.push(40);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Pilha está cheia");
        }
    }

    @Test
    public void caso5_pilhaVazia() {
        PilhaVetor pilha = new PilhaVetor(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.pop();
        pilha.pop();
        pilha.pop();
        try {
            pilha.pop();
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Pilha está vazia");
        }
    }

    @Test
    public void caso6_topoDaPilha() {
        PilhaVetor pilha = new PilhaVetor(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(30, pilha.peek());
        assertEquals(30, pilha.pop());
    }

    @Test
    public void caso7_limparPilha() {
        PilhaVetor pilha = new PilhaVetor(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();

        assertEquals(true, pilha.estaVazia());
    }

    @Test
    public void caso8_toString() {
        PilhaVetor pilha = new PilhaVetor(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        assertEquals("50, 40, 30, 20, 10.", pilha.toString());
    }

    @Test
    public void caso9_pilhaEncadeadaVazia() {
        PilhaListaEncadeada<Integer> pilha = new PilhaListaEncadeada<>();

        assertEquals(true, pilha.estaVazia());
    }

    @Test
    public void caso10_pilhaEncadeadaNaoVazia() {
        PilhaListaEncadeada<Integer> pilha = new PilhaListaEncadeada<>();
        pilha.push(10);

        assertEquals(false, pilha.estaVazia());
    }

    @Test
    public void caso11_pilhaEncadeadaEmpilhaEDesempilha() {
        PilhaListaEncadeada<Integer> pilha = new PilhaListaEncadeada<>();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(30, (int) pilha.pop());
        assertEquals(20, (int) pilha.pop());
        assertEquals(10, (int) pilha.pop());
        assertEquals(true, pilha.estaVazia());
    }

    @Test
    public void caso12_pilhaEncadeadaTopo() {
        PilhaListaEncadeada<Integer> pilha = new PilhaListaEncadeada<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(30, (int) pilha.peek());
    }

    @Test
    public void caso13_liberarPilhaEncadeada() {
        PilhaListaEncadeada<Integer> pilha = new PilhaListaEncadeada<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        pilha.liberar();
        assertEquals(true, pilha.estaVazia());
    }
}

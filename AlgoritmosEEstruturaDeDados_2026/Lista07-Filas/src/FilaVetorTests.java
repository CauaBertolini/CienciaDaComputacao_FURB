import Fila.FilaVetor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilaVetorTests {

    @Test
    public void caso1_criarFilaVaziaTrue(){
        FilaVetor<Integer> filaVetor = new FilaVetor<Integer>(5);
        assertEquals(true, filaVetor.estaVazia());
    }

    @Test
    public void caso2_criarFilaVaziaFalse(){
        FilaVetor<Integer> filaVetor = new FilaVetor<Integer>(5);
        filaVetor.inserir(10);
        assertEquals(false, filaVetor.estaVazia());
    }

    @Test
    public void caso3_enfileirarEDesenfileirar(){
        FilaVetor<Integer> filaVetor = new FilaVetor<Integer>(5);
        filaVetor.inserir(10);
        filaVetor.inserir(20);
        filaVetor.inserir(30);

        assertEquals(10, (int) filaVetor.retirar());
        assertEquals(20, (int) filaVetor.retirar());
        assertEquals(30, (int) filaVetor.retirar());
    }

    @Test
    public void caso4_filaCheia(){
        FilaVetor<Integer> filaVetor = new FilaVetor<Integer>(3);
        filaVetor.inserir(10);
        filaVetor.inserir(20);
        filaVetor.inserir(30);
        try {
            filaVetor.inserir(40);
        } catch (Exception e) {
            assertEquals("Fila está cheia", e.getMessage());
        }
    }

    @Test
    public void caso5_filaVazia(){
        FilaVetor<Integer> filaVetor = new FilaVetor<Integer>(5);
        try {
            filaVetor.retirar();
        } catch (Exception e) {
            assertEquals("Fila está vazia", e.getMessage());
        }
    }

    @Test
    public void caso6_olhaERetira() {
        FilaVetor<Integer> filaVetor = new FilaVetor<Integer>(3);
        filaVetor.inserir(10);
        filaVetor.inserir(20);
        filaVetor.inserir(30);

        assertEquals(10, (int) filaVetor.peek());
        assertEquals(10, (int) filaVetor.retirar());
    }

    @Test
    public void caso7_liberarFila() {
        FilaVetor<Integer> filaVetor = new FilaVetor<Integer>(5);
        filaVetor.inserir(10);
        filaVetor.inserir(20);
        filaVetor.inserir(30);

        filaVetor.liberar();

        assertEquals(true, filaVetor.estaVazia());
    }

    @Test
    public void caso8_filaVazia() {
        FilaVetor<Integer> filaVetor1 = new FilaVetor<Integer>(5);
        filaVetor1.inserir(10);
        filaVetor1.inserir(20);
        filaVetor1.inserir(30);

        FilaVetor<Integer> filaVetor2 = new FilaVetor<Integer>(5);
        filaVetor2.inserir(40);
        filaVetor2.inserir(50);

        FilaVetor<Integer> filaVetor3 = filaVetor1.criarFilaVetorConcatenada(filaVetor2);

        assertEquals("10, 20, 30, 40, 50.", filaVetor3.toString());
        assertEquals("10, 20, 30.", filaVetor1.toString());
        assertEquals(10, filaVetor3.getLimite());
    }
}

import Fila.FilaEncadeada;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilaEncadeadaTests {

    @Test
    public void caso1_criarFilaVaziaTrue() {
        FilaEncadeada<Integer> fila = new FilaEncadeada<Integer>();
        assertEquals(true, fila.estaVazia());
    }

    @Test
    public void caso2_criarFilaVaziaFalse() {
        FilaEncadeada<Integer> fila = new FilaEncadeada<Integer>();
        fila.inserir(10);
        assertEquals(false, fila.estaVazia());
    }

    @Test
    public void caso3_enfileirarEDesenfileirar() {
        FilaEncadeada<Integer> fila = new FilaEncadeada<Integer>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertEquals(10, (int) fila.retirar());
        assertEquals(20, (int) fila.retirar());
        assertEquals(30, (int) fila.retirar());
        assertEquals(true, fila.estaVazia());
    }

    @Test
    public void caso4_olhaERetira() {
        FilaEncadeada<Integer> fila = new FilaEncadeada<Integer>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertEquals(10, (int) fila.peek());
        assertEquals(10, (int) fila.retirar());
    }

    @Test
    public void caso5_liberarFila() {
        FilaEncadeada<Integer> fila = new FilaEncadeada<Integer>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        fila.liberar();

        assertEquals(true, fila.estaVazia());
    }
}

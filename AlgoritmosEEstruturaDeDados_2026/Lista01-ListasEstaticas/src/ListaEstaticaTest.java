import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListaEstaticaTest {

    @Test
    void caso1_insercao_de_dados_toString() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);

        assertEquals("1, 2, 3, 4, 5.", lista.toString());
    }

    @Test
    void caso2_redimencionamento_de_vetor() {
        ListaEstatica lista = new ListaEstatica();
        for(int i = 0; i <= 11; i++) {
            lista.inserir(i);
        }
        assertEquals(20, lista.getDimensão());
    }
}
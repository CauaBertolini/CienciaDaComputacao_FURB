import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListaEstaticaTest {

    @Test
    void caso1_insercao_de_dados_toString() {
        ListaEstatica lista = new ListaEstatica<>();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir("3");
        lista.inserir("Teste");
        lista.inserir(5);

        assertEquals("1, 2, 3, Teste, 5.", lista.toString());
    }

    @Test
    void caso2_redimencionamento_de_vetor() {
        ListaEstatica lista = new ListaEstatica<>();
        for(int i = 0; i <= 11; i++) {
            lista.inserir(i);
        }
        assertEquals(20, lista.getDimensão());
    }

    @Test
    void caso3_insercao_de_dado_e_retorno_dele() {
        ListaEstatica lista = new ListaEstatica<>();

        lista.inserir("TesteDeEntrada");

        assertEquals("TesteDeEntrada", lista.obterElemento(0));
    }

    @Test
    void caso4_inverter_lista() {
        ListaEstatica lista = new ListaEstatica<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);


        lista.inverter();

        assertEquals("20, 15, 10, 5.", lista.toString());
    }
}
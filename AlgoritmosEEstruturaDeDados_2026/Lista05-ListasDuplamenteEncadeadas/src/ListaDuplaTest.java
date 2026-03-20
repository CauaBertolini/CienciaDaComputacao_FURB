import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ListaDuplaTest {
    @Test
    public void caso1_ligacoesAnteriorEProximo () {
        ListaDupla listaDupla = new ListaDupla<>();

        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);

        listaDupla.exibir();
        listaDupla.exibirOrdemInversa();

        assertEquals(5, listaDupla.buscar(5).getInfo());
    }

    @Test
    public void caso2_buscarElemento () {
        ListaDupla listaDupla = new ListaDupla<>();

        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);

        assertEquals(20, listaDupla.buscar(20).getInfo());
    }

    @Test
    public void caso3_buscarElemento () {
        ListaDupla listaDupla = new ListaDupla<>();

        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);

        assertEquals(10, listaDupla.buscar(10).getInfo());
    }


    @Test
    public void caso4_removerElementoInicio () {
        ListaDupla listaDupla = new ListaDupla<>();

        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);

        listaDupla.retirar(20);

        assertEquals(null, listaDupla.buscar(20));
    }

    @Test
    public void caso5_removerElementoMeio () {
        ListaDupla listaDupla = new ListaDupla<>();

        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);

        listaDupla.retirar(10);

        assertEquals(null, listaDupla.buscar(10));
    }

    @Test
    public void caso6_removerElementoFim () {
        ListaDupla listaDupla = new ListaDupla<>();

        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);

        listaDupla.retirar(5);

        assertEquals(null, listaDupla.buscar(5));
    }

    @Test
    public void caso7_liberar () {
        ListaDupla listaDupla = new ListaDupla<>();

        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);

        listaDupla.liberar();

        listaDupla.exibir();

        assertEquals(true, listaDupla.estaVazia());
    }
}

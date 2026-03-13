import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ListaEncadeadaTest {

    @Test
    public void caso1_insercao_de_dados() {
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        listaEncadeada.inserir(1);
        listaEncadeada.inserir(2);
        listaEncadeada.inserir(3);
        listaEncadeada.inserir(4);
        listaEncadeada.inserir(5);

        assertEquals("5, 4, 3, 2, 1, ", listaEncadeada.toString());
    }
}

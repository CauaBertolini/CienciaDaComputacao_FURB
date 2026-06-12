package mapaDispercao;


import aluno.Aluno;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class MapaDispercaoTest {

    @Test
    public void caso1_inserirEBuscarNoMapa() {
        MapaDispercao<Aluno> mapaDispercao = new MapaDispercao<Aluno>(53);

        Aluno aluno1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));

        mapaDispercao.inserir(12000, aluno1);

        assertEquals(aluno1, mapaDispercao.buscar(12000));

    }
    @Test
    public void caso2_inserirEBuscarMapaVarios() {
        MapaDispercao<Aluno> mapaDispercao = new MapaDispercao<Aluno>(53);

        Aluno aluno1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        Aluno aluno2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20));
        Aluno aluno3 = new Aluno(14226, "Marta", LocalDate.of(2001, 2, 18));
        Aluno aluno4 = new Aluno(17180, "Lucas", LocalDate.of(1998, 11, 25));

        mapaDispercao.inserir(12000, aluno1);
        mapaDispercao.inserir(14000, aluno2);
        mapaDispercao.inserir(12500, aluno3);
        mapaDispercao.inserir(13000, aluno4);

        assertEquals(aluno1, mapaDispercao.buscar(12000));
        assertEquals(aluno2, mapaDispercao.buscar(14000));
        assertEquals(aluno3, mapaDispercao.buscar(12500));
        assertEquals(aluno4, mapaDispercao.buscar(13000));
    }

    @Test
    public void caso3_inserirEBuscarMapaVariosComColisao() {
        MapaDispercao<Aluno> mapaDispercao = new MapaDispercao<Aluno>(53);

        Aluno aluno1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        Aluno aluno2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20));
        Aluno aluno3 = new Aluno(14226, "Marta", LocalDate.of(2001, 2, 18));
        Aluno aluno4 = new Aluno(17180, "Lucas", LocalDate.of(1998, 11, 25));

        mapaDispercao.inserir(12000, aluno1);
        mapaDispercao.inserir(14000, aluno2);
        mapaDispercao.inserir(14226, aluno3);
        mapaDispercao.inserir(17180, aluno4);

        assertEquals(aluno1, mapaDispercao.buscar(12000));
        assertEquals(aluno2, mapaDispercao.buscar(14000));
        assertEquals(aluno3, mapaDispercao.buscar(14226));
        assertEquals(aluno4, mapaDispercao.buscar(17180));
    }


}

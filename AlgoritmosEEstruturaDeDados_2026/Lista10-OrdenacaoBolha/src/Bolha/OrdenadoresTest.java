package Bolha;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class OrdenadoresTest {

    @Test
    public void caso01_ordenadorBolha() {
        Integer [] vetor = {70, 2, 88, 15, 90, 30};
        OrdenadorBolha ord = new OrdenadorBolha();

        ord.setInfo(vetor);
        ord.ordenar();

        Integer [] vetorEsperado = new Integer[]{2, 15, 30, 70, 88, 90};

        assertArrayEquals(vetorEsperado, vetor);
    }

    @Test
    public void caso02_ordenadorBolhaOtimizada() {
        Integer [] vetor = {70, 2, 88, 15, 90, 30};

        OrdenadorBolhaOtimizada ord = new OrdenadorBolhaOtimizada();

        ord.setInfo(vetor);
        ord.ordenar();

        Integer [] vetorEsperado = new Integer[]{2, 15, 30, 70, 88, 90};

        assertArrayEquals(vetorEsperado, vetor);
    }

    @Test
    public void caso03_ordenadorQuickSort() {
        Integer [] vetor = {70, 2, 88, 15, 90, 30};

        OrdenadorQuickSort ord = new OrdenadorQuickSort();

        ord.setInfo(vetor);
        ord.ordenar();

        Integer [] vetorEsperado = new Integer[]{2, 15, 30, 70, 88, 90};

        assertArrayEquals(vetorEsperado, vetor);
    }

    @Test
    public void caso04_ordenadorMergeSort() {
        Integer [] vetor = {70, 2, 88, 15, 90, 30};
        OrdenadorMergesort ord = new OrdenadorMergesort();

        ord.setInfo(vetor);
        ord.ordenar();

        Integer [] vetorEsperado = new Integer[]{2, 15, 30, 70, 88, 90};

        assertArrayEquals(vetorEsperado, vetor);
    }


}

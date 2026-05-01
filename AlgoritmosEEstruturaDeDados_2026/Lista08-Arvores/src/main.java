import arvoreBinaria.ArvoreBinaria;
import arvoreBinaria.NoArvoreBinaria;

public class main {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();

        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no3, no5);

        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no6);

        NoArvoreBinaria<Integer> no0 = new NoArvoreBinaria<>(0, no1, no2);

        arvore.setRaiz(no0);

        arvore.pertence(6);



    }
}

import Entities.Compra;
import Entities.ItemCompra;
import Entities.Produto;
import Enums.Unidade;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto prod1 = new Produto("Leite", Unidade.L);
        Produto prod2 = new Produto("Arroz", Unidade.KG);

        ItemCompra item1 = new ItemCompra(prod1, 5.0,4, 5);
        ItemCompra item2 = new ItemCompra(prod2, 3.0,3, 2);

        Compra compraJaneiro = new Compra();

        compraJaneiro.adicionarItem(item1);
        compraJaneiro.adicionarItem(item2);

        double total = compraJaneiro.calcularTotalCompra();
        System.out.println(total);

    }
}

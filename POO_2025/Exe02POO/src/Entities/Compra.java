package Entities;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<ItemCompra> listaDeCompras = new ArrayList<>();

    public Compra() {

    }

    public double calcularTotalCompra(){
        double total = 0;
        for(ItemCompra item : listaDeCompras){
            total += item.getTotal();
        }
        return total;
    }

    public void adicionarItem(ItemCompra itemCompra) {
        listaDeCompras.add(itemCompra);
    }

    public boolean removerItem(ItemCompra itemCompra) {
        return false;
        //Tenta tirar, se não der certo, retorna false
    }

    public void alterarItem(ItemCompra itemCompra) {

    }

    public void listarItens() {
        for (ItemCompra item : listaDeCompras) {
            System.out.println(item);
        }
    }
}

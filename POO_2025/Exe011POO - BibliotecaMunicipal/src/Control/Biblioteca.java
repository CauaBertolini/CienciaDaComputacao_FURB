package Control;

import Model.Dvd;
import Model.ItemBiblioteca;
import Model.Livro;
import Model.Revista;

import java.util.ArrayList;

public class Biblioteca {
        private ArrayList<ItemBiblioteca> itensBiblioteca = new ArrayList<>();

        public void adicionarItem(ItemBiblioteca item) throws IllegalArgumentException {
            if (item == null) {
                throw new IllegalArgumentException("Item deve ser informado");
            }
        }

        public String listar() {
            String dados = "";
            int contador = 0;
            dados += contador + " - ";
            for (ItemBiblioteca item: itensBiblioteca) {

                if (item instanceof Livro) {
                    dados += "Livro";
                } else if (item instanceof Dvd) {
                    dados += "DVD";
                } else if (item instanceof Revista) {
                    dados += "Revista";
                }

                dados += item.getTitulo() + " | Taxa de Multa: " + item.getMulta() + " | Prazo padrão:" + item.getPrazo() + " | Data útlimo empréstimo: " + item.getDataEmprestimo() + "\n";
                contador++;
            }
            dados += "";
            return dados;
        }
}

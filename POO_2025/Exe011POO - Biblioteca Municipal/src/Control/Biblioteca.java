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
            itensBiblioteca.add(item);
        }

        public String listar() {
            String dados = "";
            int contador = 0;
            for (ItemBiblioteca item: itensBiblioteca) {
                dados += contador + " - ";
                if (item instanceof Livro) {
                    dados += "Livro ";
                } else if (item instanceof Dvd) {
                    dados += "DVD ";
                } else if (item instanceof Revista) {
                    dados += "Revista ";
                } else {
                    dados += "Outro ";
                }
                dados += item.getTitulo() + " | Taxa de Multa: " + item.getMulta() + " | Prazo padrão:" + item.getPrazo() + " | Data útlimo empréstimo: " + item.getDataEmprestimo() + "\n";
                contador++;
            }
            dados += "";
            return dados;
        }

        public String listarEmprestados() {
            String dados = "";
            int contador = 0;
            for (ItemBiblioteca item: itensBiblioteca) {
                if (item.isEmprestado()) {
                    dados += contador + " - ";
                    if (item instanceof Livro) {
                        dados += "Livro ";
                    } else if (item instanceof Dvd) {
                        dados += "DVD ";
                    } else if (item instanceof Revista) {
                        dados += "Revista ";
                    } else {
                        dados += "Outro ";
                    }
                    dados += item.getTitulo() + " | Taxa de Multa: " + item.getMulta() + " | Prazo padrão:" + item.getPrazo() + " | Data útlimo empréstimo: " + item.getDataEmprestimo() + "\n";
                    contador++;
                }
            }
            dados += "";
            return dados;
        }

        public ArrayList<ItemBiblioteca> getItensBiblioteca()
        {
            return itensBiblioteca;
        }

        public boolean validarOpcaoInserida(char opcao) {
            switch (opcao) {
                case 'L':
                case 'R':
                case 'D':
                case 'O':
                    return true;
            }
            return false;
        }
}

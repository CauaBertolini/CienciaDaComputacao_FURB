import Entities.Compra;
import Entities.ItemCompra;
import Entities.Produto;
import Enums.Unidade;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public void Executar(Scanner scanner) {
        boolean sair = false;

        Produto prod1 = new Produto("Leite", Unidade.L);
        Produto prod2 = new Produto("Arroz", Unidade.KG);
        Produto prod3 = new Produto("Granola", Unidade.G);
        Produto prod4 = new Produto("Iogurte", Unidade.ML);

        List<Produto> estoqueMercado = new ArrayList<>();
        estoqueMercado.add(prod1);
        estoqueMercado.add(prod2);
        estoqueMercado.add(prod3);
        estoqueMercado.add(prod4);

        List<Compra> historicoDeCompras = new ArrayList<>();

        List<String> opcoesDoMenu = new ArrayList<>();
        opcoesDoMenu.add("Iniciar Venda");
        opcoesDoMenu.add("Gerenciar Produtos");
        opcoesDoMenu.add("Sair");

        List<String> opcoesDeVenda = new ArrayList<>();


        int opcaoMenu;

        do {
            String tituloPrincipal = "Mercado FURB";
            mostrarMenu(tituloPrincipal, opcoesDoMenu);
            opcaoMenu = scanner.nextInt();

            switch (opcaoMenu) {
                case 1:
                    String tituloVendas = "Vendendo! Selecione o produto que deseja.";
                    mostrarMenu(tituloVendas, (ArrayList<Produto>) estoqueMercado);

                    break;
                case 2:
                    //Métod
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (!sair);
    }

    public void mostrarMenu(String tituloMenu, List<String> opcoesMenu) {
        int contador = 0;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        for (String op : opcoesMenu) {
            contador++;
            System.out.printf("[ %d ] %s", contador, op);
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public void mostrarMenu(String tituloMenu, ArrayList<Produto> opcoesMenu) {
        int contador = 0;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        for (Produto op : opcoesMenu) {
            contador++;
            System.out.printf("[ %d ] %s", contador, op.getNome());
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");

    }



}

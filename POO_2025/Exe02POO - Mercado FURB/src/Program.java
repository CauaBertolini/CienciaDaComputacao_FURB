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

        String[] opcoesDoMenu = {"Iniciar venda", "Gerenciar Produtos", "Sair"};

        List<String> opcoesDeVenda = new ArrayList<>();

        int opcaoMenu;
        int opcaoProduto;
        int quantidadeDeCompra;
        double precoProduto;

        Compra compraAtual = new Compra();

        do {
            String tituloPrincipal = "Mercado FURB";
            mostrarMenu(tituloPrincipal, opcoesDoMenu);
            opcaoMenu = scanner.nextInt();

            switch (opcaoMenu) {
                case 1:
                    String tituloVendas = "Vendendo! Selecione o produto que deseja.";
                    mostrarMenu(tituloVendas, (ArrayList<Produto>) estoqueMercado);
                    opcaoProduto = scanner.nextInt();

                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Informe a quantidade: ");
                    quantidadeDeCompra = scanner.nextInt();

                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Informe o preço unitário: ");
                    precoProduto = scanner.nextDouble();

                    Produto produtoAdicionar = estoqueMercado.get(opcaoProduto-1);

                    ItemCompra item = new ItemCompra(produtoAdicionar, precoProduto, quantidadeDeCompra, 0);

                    compraAtual.adicionarItem(item);

                    break;
                case 2:
                    //Métod
                    break;

                case 3:
                    historicoDeCompras.add(compraAtual);
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

    public void mostrarMenu(String tituloMenu, String[] opcoesMenu) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(tituloMenu);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < opcoesMenu.length; i++) {
            System.out.printf("[ %d ] %s", i, opcoesMenu[i]);
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");

    }



}

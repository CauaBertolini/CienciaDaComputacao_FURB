import Entities.Compra;
import Entities.ItemCompra;
import Entities.Produto;
import Enums.Unidade;

import java.util.Scanner;

public class Program {
    public void Executar(Scanner scanner) {
        boolean sair = false;
        int opc;

        do {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Mercado FURB - Sistema");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("[ 1 ] - Iniciar Venda");
            System.out.println("[ 2 ] - Gerenciar Produtos");
            System.out.println("[ 3 ] - Sair ");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    //Métod
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

}
